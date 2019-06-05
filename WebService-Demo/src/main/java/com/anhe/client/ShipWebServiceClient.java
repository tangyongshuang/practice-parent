package com.anhe.client;

import com.alibaba.fastjson.JSON;
import com.fedex.ship.stub.*;
import org.apache.axis.types.NonNegativeInteger;
import org.apache.axis.types.PositiveInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Created by Albert.Tang on 2019/4/28 3:00 PM.
 */
public class ShipWebServiceClient {


    private static final Logger logger = LoggerFactory.getLogger(ShipWebServiceClient.class);

    public static void main(String[] args) {
        ProcessShipmentRequest request = buildRequest(); // Build a request object
        //
        try {
            // Initialize the service
            ShipServiceLocator service;
            ShipPortType port;
            //
            service = new ShipServiceLocator();
            updateEndPoint(service);
            port = service.getShipServicePort();
            //
            ProcessShipmentReply reply = port.processShipment(request); // This is the call to the ship web service passing in a request object and returning a reply object

            logger.info("------------request----------------");
            logger.info(JSON.toJSONString(request));
            logger.info("------------reply----------------");
            logger.info(JSON.toJSONString(reply));
            //
            if (isResponseOk(reply.getHighestSeverity())) // check if the call was successful
            {
                writeServiceOutput(reply);
            }

            printNotifications(reply.getNotifications());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    //
    private static ProcessShipmentRequest buildRequest() {
        ProcessShipmentRequest request = new ProcessShipmentRequest(); // Build a request object

        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        TransactionDetail transactionDetail = new TransactionDetail();
        transactionDetail.setCustomerTransactionId("java sample - Domestic Smartpost"); // The client will get the same value back in the response
        request.setTransactionDetail(transactionDetail);
        //
        VersionId versionId = new VersionId("ship", 23, 0, 0);
        request.setVersion(versionId);
        //
        RequestedShipment requestedShipment = new RequestedShipment();
        requestedShipment.setShipTimestamp(Calendar.getInstance()); // Ship date and time
        requestedShipment.setServiceType(ServiceType.SMART_POST); // Service types are STANDARD_OVERNIGHT, PRIORITY_OVERNIGHT, FEDEX_GROUND ...
        requestedShipment.setDropoffType(DropoffType.REGULAR_PICKUP);
        requestedShipment.setPackagingType(PackagingType.YOUR_PACKAGING); // Packaging type FEDEX_BOX, FEDEX_PAK, FEDEX_TUBE, YOUR_PACKAGING, ...

        //
        requestedShipment.setShipper(addShipper()); // Sender information
        //
        requestedShipment.setRecipient(addRecipient());
        //
        requestedShipment.setShippingChargesPayment(addShippingChargesPayment());
        //

        SmartPostShipmentDetail smartPost = new SmartPostShipmentDetail();
        smartPost.setAncillaryEndorsement(SmartPostAncillaryEndorsementType.ADDRESS_CORRECTION);
        smartPost.setCustomerManifestId("XXX");
        smartPost.setHubId(getHub());
        smartPost.setIndicia(SmartPostIndiciaType.PRESORTED_STANDARD);
        requestedShipment.setSmartPostDetail(smartPost);

        requestedShipment.setLabelSpecification(addLabelSpecification());

        //
        requestedShipment.setPackageCount(new NonNegativeInteger("1"));
        //
        requestedShipment.setRequestedPackageLineItems(new RequestedPackageLineItem[]{addSmartpostPackageLineItem()});
        //
        request.setRequestedShipment(requestedShipment);
        //
        return request;
    }

    //
    private static void writeServiceOutput(ProcessShipmentReply reply) throws Exception {
        try {
            System.out.println(reply.getTransactionDetail().getCustomerTransactionId());
            CompletedShipmentDetail csd = reply.getCompletedShipmentDetail();
            String masterTrackingNumber = printMasterTrackingNumber(csd);
            printShipmentOperationalDetails(csd.getOperationalDetail());
            printShipmentRating(csd.getShipmentRating());
            CompletedPackageDetail cpd[] = csd.getCompletedPackageDetails();
            printPackageDetails(cpd);
            saveShipmentDocumentsToFile(csd.getShipmentDocuments(), masterTrackingNumber);
            //  If Express COD shipment is requested, the COD return label is returned as an Associated Shipment.
            getAssociatedShipmentLabels(csd.getAssociatedShipments());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //
        }
    }

    private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
        if (notificationSeverityType == null) {
            return false;
        }
        if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
                notificationSeverityType.equals(NotificationSeverityType.NOTE) ||
                notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
            return true;
        }
        return false;
    }

    private static void printNotifications(Notification[] notifications) {
        System.out.println("Notifications:");
        if (notifications == null || notifications.length == 0) {
            System.out.println("  No notifications returned");
        }
        for (int i = 0; i < notifications.length; i++) {
            Notification n = notifications[i];
            System.out.print("  Notification no. " + i + ": ");
            if (n == null) {
                System.out.println("null");
                continue;
            } else {
                System.out.println("");
            }
            NotificationSeverityType nst = n.getSeverity();

            System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
            System.out.println("    Code: " + n.getCode());
            System.out.println("    Message: " + n.getMessage());
            System.out.println("    Source: " + n.getSource());
        }
    }

    private static void printMoney(Money money, String description, String space) {
        if (money != null) {
            System.out.println(space + description + ": " + money.getAmount() + " " + money.getCurrency());
        }
    }

    private static void printWeight(Weight weight, String description, String space) {
        if (weight != null) {
            System.out.println(space + description + ": " + weight.getValue() + " " + weight.getUnits());
        }
    }

    private static void printString(String value, String description, String space) {
        if (value != null) {
            System.out.println(space + description + ": " + value);
        }
    }

    private static Money addMoney(String currency, Double value) {
        Money money = new Money();
        money.setCurrency(currency);
        money.setAmount(new BigDecimal(value));
        return money;
    }

    private static Weight addPackageWeight(Double packageWeight, WeightUnits weightUnits) {
        Weight weight = new Weight();
        weight.setUnits(weightUnits);
        weight.setValue(new BigDecimal(packageWeight));
        return weight;
    }

    private static Dimensions addPackageDimensions(Integer length, Integer height, Integer width, LinearUnits linearUnits) {
        Dimensions dimensions = new Dimensions();
        dimensions.setLength(new NonNegativeInteger(length.toString()));
        dimensions.setHeight(new NonNegativeInteger(height.toString()));
        dimensions.setWidth(new NonNegativeInteger(width.toString()));
        dimensions.setUnits(linearUnits);
        return dimensions;
    }

    //Shipment level reply information
    private static void printShipmentOperationalDetails(ShipmentOperationalDetail shipmentOperationalDetail) {
        if (shipmentOperationalDetail != null) {
            System.out.println("Routing Details");
            printString(shipmentOperationalDetail.getUrsaPrefixCode(), "URSA Prefix", "  ");
            if (shipmentOperationalDetail.getCommitDay() != null)
                printString(shipmentOperationalDetail.getCommitDay().getValue(), "Service Commitment", "  ");
            printString(shipmentOperationalDetail.getAirportId(), "Airport Id", "  ");
            if (shipmentOperationalDetail.getDeliveryDay() != null)
                printString(shipmentOperationalDetail.getDeliveryDay().getValue(), "Delivery Day", "  ");
            System.out.println();
        }
    }

    private static void printShipmentRating(ShipmentRating shipmentRating) {
        if (shipmentRating != null) {
            System.out.println("Shipment Rate Details");
            ShipmentRateDetail[] srd = shipmentRating.getShipmentRateDetails();
            for (int j = 0; j < srd.length; j++) {
                System.out.println("  Rate Type: " + srd[j].getRateType().getValue());
                printWeight(srd[j].getTotalBillingWeight(), "Shipment Billing Weight", "    ");
                printMoney(srd[j].getTotalBaseCharge(), "Shipment Base Charge", "    ");
                printMoney(srd[j].getTotalNetCharge(), "Shipment Net Charge", "    ");
                printMoney(srd[j].getTotalSurcharges(), "Shipment Total Surcharge", "    ");
                if (null != srd[j].getSurcharges()) {
                    System.out.println("    Surcharge Details");
                    Surcharge[] s = srd[j].getSurcharges();
                    for (int k = 0; k < s.length; k++) {
                        printMoney(s[k].getAmount(), s[k].getSurchargeType().getValue(), "      ");
                    }
                }
                printFreightDetail(srd[j].getFreightRateDetail());
                System.out.println();
            }
        }
    }

    //Package level reply information
    private static void printPackageOperationalDetails(PackageOperationalDetail packageOperationalDetail) {
        if (packageOperationalDetail != null) {
            System.out.println("  Routing Details");
            printString(packageOperationalDetail.getAstraHandlingText(), "Astra", "    ");
            printString(packageOperationalDetail.getGroundServiceCode(), "Ground Service Code", "    ");
            System.out.println();
        }
    }

    private static void printPackageDetails(CompletedPackageDetail[] cpd) throws Exception {
        if (cpd != null) {
            System.out.println("Package Details");
            for (int i = 0; i < cpd.length; i++) { // Package details / Rating information for each package
                String trackingNumber = cpd[i].getTrackingIds()[0].getTrackingNumber();
                printTrackingNumbers(cpd[i]);
                System.out.println();
                //
                printPackageRating(cpd[i].getPackageRating());
                //	Write label buffer to file
                ShippingDocument sd = cpd[i].getLabel();
                saveLabelToFile(sd, trackingNumber);
                printPackageOperationalDetails(cpd[i].getOperationalDetail());
                // If Ground COD shipment is requested, the COD return label is returned as in CodReturnPackageDetail.
                printGroundCodLabel(cpd[i], trackingNumber);
                System.out.println();
            }
        }
    }

    private static void printPackageRating(PackageRating packageRating) {
        if (packageRating != null) {
            System.out.println("Package Rate Details");
            PackageRateDetail[] prd = packageRating.getPackageRateDetails();
            for (int j = 0; j < prd.length; j++) {
                System.out.println("  Rate Type: " + prd[j].getRateType().getValue());
                printWeight(prd[j].getBillingWeight(), "Billing Weight", "    ");
                printMoney(prd[j].getBaseCharge(), "Base Charge", "    ");
                printMoney(prd[j].getNetCharge(), "Net Charge", "    ");
                printMoney(prd[j].getTotalSurcharges(), "Total Surcharge", "    ");
                if (null != prd[j].getSurcharges()) {
                    System.out.println("    Surcharge Details");
                    Surcharge[] s = prd[j].getSurcharges();
                    for (int k = 0; k < s.length; k++) {
                        printMoney(s[k].getAmount(), s[k].getSurchargeType().getValue(), "      ");
                    }
                }
                System.out.println();
            }
        }
    }

    private static void printTrackingNumbers(CompletedPackageDetail completedPackageDetail) {
        if (completedPackageDetail.getTrackingIds() != null) {
            TrackingId[] trackingId = completedPackageDetail.getTrackingIds();
            for (int i = 0; i < trackingId.length; i++) {
                String trackNumber = trackingId[i].getTrackingNumber();
                String trackType = trackingId[i].getTrackingIdType().getValue();
                String formId = trackingId[i].getFormId();
                printString(trackNumber, trackType + " tracking number", "  ");
                printString(formId, "Form Id", "  ");
            }
        }
    }


    private static String getPayorAccountNumber() {
        // See if payor account number is set as system property,
        // if not default it to "XXX"
        String payorAccountNumber = System.getProperty("Payor.AccountNumber");
        if (payorAccountNumber == null) {
            payorAccountNumber = "899587790"; // Replace "XXX" with the payor account number
        }
        return payorAccountNumber;
    }

    private static String getHub() {
        String hubId = System.getProperty("HubId");
        if (hubId == null) {
            hubId = "5902"; //Replace "XXX" with the Smartpost Hub Id
        }
        return hubId;
    }

    private static Party addShipper() {
        Party shipperParty = new Party(); // Sender information
        Contact shipperContact = new Contact();
        shipperContact.setPersonName("Sender Name");
        shipperContact.setCompanyName("Sender Company Name");
        shipperContact.setPhoneNumber("0805522713");
        Address shipperAddress = new Address();
        shipperAddress.setStreetLines(new String[]{"Address Line 1"});
        shipperAddress.setCity("Austin");
        shipperAddress.setStateOrProvinceCode("TX");
        shipperAddress.setPostalCode("73301");
        shipperAddress.setCountryCode("US");
        shipperParty.setContact(shipperContact);
        shipperParty.setAddress(shipperAddress);
        return shipperParty;
    }

    private static Party addRecipient() {
        Party recipientParty = new Party(); // Recipient information
        Contact recipientContact = new Contact();
        recipientContact.setPersonName("Recipient Name");
        recipientContact.setCompanyName("Recipient Company Name");
        recipientContact.setPhoneNumber("1234567890");
        Address recipientAddress = new Address();
        recipientAddress.setStreetLines(new String[]{"Address Line 1"});
        recipientAddress.setCity("Windsor");
        recipientAddress.setStateOrProvinceCode("CT");
        recipientAddress.setPostalCode("06006");
        recipientAddress.setCountryCode("US");
        recipientAddress.setResidential(Boolean.valueOf(false));
        recipientParty.setContact(recipientContact);
        recipientParty.setAddress(recipientAddress);
        return recipientParty;
    }

    private static Payment addShippingChargesPayment() {
        Payment payment = new Payment(); // Payment information
        payment.setPaymentType(PaymentType.THIRD_PARTY);
        Payor payor = new Payor();
        Party responsibleParty = new Party();
        responsibleParty.setAccountNumber(getPayorAccountNumber());
        Address responsiblePartyAddress = new Address();
        responsiblePartyAddress.setCountryCode("US");
        responsibleParty.setAddress(responsiblePartyAddress);
        responsibleParty.setContact(new Contact());
        payor.setResponsibleParty(responsibleParty);
        payment.setPayor(payor);
        return payment;
    }

    private static LabelSpecification addLabelSpecification() {
        LabelSpecification labelSpecification = new LabelSpecification(); // Label specification
        labelSpecification.setImageType(ShippingDocumentImageType.PDF);// Image types PDF, PNG, DPL, ...
        labelSpecification.setLabelFormatType(LabelFormatType.COMMON2D); //LABEL_DATA_ONLY, COMMON2D
        labelSpecification.setLabelStockType(LabelStockType.value9); // STOCK_4X6.75_LEADING_DOC_TAB
        //labelSpecification.setLabelPrintingOrientation(LabelPrintingOrientationType.TOP_EDGE_OF_TEXT_FIRST);
        return labelSpecification;
    }

    private static RequestedPackageLineItem addSmartpostPackageLineItem() {
        RequestedPackageLineItem smartpostLineItem = new RequestedPackageLineItem();
        smartpostLineItem.setWeight(addPackageWeight(0.5, WeightUnits.LB)); // Package weight information
        smartpostLineItem.setDimensions(addPackageDimensions(10, 1, 8, LinearUnits.IN));
//        smartpostLineItem.setCustomerReferences(new CustomerReference[]{new CustomerReference(), new CustomerReference(), new CustomerReference()}); // Reference details
        smartpostLineItem.setCustomerReferences(new CustomerReference[]{new CustomerReference()}); // Reference details
        smartpostLineItem.getCustomerReferences()[0].setCustomerReferenceType(CustomerReferenceType.CUSTOMER_REFERENCE);
        smartpostLineItem.getCustomerReferences()[0].setValue("reference-lalalal");
//        smartpostLineItem.getCustomerReferences()[1].setCustomerReferenceType(CustomerReferenceType.INVOICE_NUMBER);
//        smartpostLineItem.getCustomerReferences()[1].setValue("INV4567892");
//        smartpostLineItem.getCustomerReferences()[2].setCustomerReferenceType(CustomerReferenceType.P_O_NUMBER);
//        smartpostLineItem.getCustomerReferences()[2].setValue("PO4567892");
        smartpostLineItem.setSequenceNumber(new PositiveInteger("1"));
        return smartpostLineItem;
    }

    private static void printFreightDetail(FreightRateDetail freightRateDetail) {
        if (freightRateDetail != null) {
            System.out.println("  Freight Details");
            printFreightNotations(freightRateDetail);
            printFreightBaseCharges(freightRateDetail);

        }
    }

    private static void printFreightNotations(FreightRateDetail frd) {
        if (null != frd.getNotations()) {
            System.out.println("    Notations");
            FreightRateNotation notations[] = frd.getNotations();
            for (int n = 0; n < notations.length; n++) {
                printString(notations[n].getCode(), "Code", "      ");
                printString(notations[n].getDescription(), "Notification", "      ");
            }
        }
    }

    private static void printFreightBaseCharges(FreightRateDetail frd) {
        if (null != frd.getBaseCharges()) {
            FreightBaseCharge baseCharges[] = frd.getBaseCharges();
            for (int i = 0; i < baseCharges.length; i++) {
                System.out.println("    Freight Rate Details");
                printString(baseCharges[i].getDescription(), "Description", "      ");
                printString(baseCharges[i].getFreightClass().getValue(), "Freight Class", "      ");
                printString(baseCharges[i].getRatedAsClass().getValue(), "Rated Class", "      ");
                printWeight(baseCharges[i].getWeight(), "Weight", "      ");
                printString(baseCharges[i].getChargeBasis().getValue(), "Charge Basis", "      ");
                printMoney(baseCharges[i].getChargeRate(), "Charge Rate", "      ");
                printMoney(baseCharges[i].getExtendedAmount(), "Extended Amount", "      ");
                printString(baseCharges[i].getNmfcCode(), "NMFC Code", "      ");
            }
        }
    }

    private static String printMasterTrackingNumber(CompletedShipmentDetail csd) {
        String trackingNumber = "";
        if (null != csd.getMasterTrackingId()) {
            trackingNumber = csd.getMasterTrackingId().getTrackingNumber();
            System.out.println("Master Tracking Number");
            System.out.println("  Type: "
                    + csd.getMasterTrackingId().getTrackingIdType());
            System.out.println("  Tracking Number: "
                    + trackingNumber);
        }
        return trackingNumber;
    }

    //Saving and displaying shipping documents (labels)
    private static void saveLabelToFile(ShippingDocument shippingDocument, String trackingNumber) throws Exception {
        ShippingDocumentPart[] sdparts = shippingDocument.getParts();
        for (int a = 0; a < sdparts.length; a++) {
            ShippingDocumentPart sdpart = sdparts[a];
            String labelLocation = System.getProperty("file.label.location");
            if (labelLocation == null) {
                labelLocation = "c:\\";
            }
            String shippingDocumentType = shippingDocument.getType().getValue();
            String labelFileName = new String(labelLocation + shippingDocumentType + "." + trackingNumber + "_" + a + ".pdf");
            File labelFile = new File(labelFileName);
            FileOutputStream fos = new FileOutputStream(labelFile);
            fos.write(sdpart.getImage());
            fos.close();
            System.out.println("\nlabel file name " + labelFile.getAbsolutePath());
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + labelFile.getAbsolutePath());
        }
    }

    private static void printGroundCodLabel(CompletedPackageDetail completedPackageDetail, String trackingNumber) throws Exception {
        CodReturnPackageDetail codReturnPackageDetail = completedPackageDetail.getCodReturnDetail();
        if (codReturnPackageDetail != null && codReturnPackageDetail.getLabel() != null) {
            codReturnPackageDetail.getLabel();
            String labelLocation = System.getProperty("file.label.location");
            if (labelLocation == null) {
                labelLocation = "c:\\";
            }
            String labelName = codReturnPackageDetail.getLabel().getType().getValue();
            ShippingDocumentPart[] parts = codReturnPackageDetail.getLabel().getParts();
            for (int i = 0; i < parts.length; i++) {
                String codLabelFileName = new String(labelLocation + labelName + "." + trackingNumber + "_" + i + ".pdf");
                File codLabelFile = new File(codLabelFileName);
                FileOutputStream fos = new FileOutputStream(codLabelFile);
                fos.write(parts[i].getImage());
                fos.close();
                System.out.println("\nCod return label file name " + codLabelFile.getAbsolutePath());
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + codLabelFile.getAbsolutePath());
            }
        }
    }

    private static void saveShipmentDocumentsToFile(ShippingDocument[] shippingDocument, String trackingNumber) throws Exception {
        if (shippingDocument != null) {
            for (int i = 0; i < shippingDocument.length; i++) {
                ShippingDocumentPart[] sdparts = shippingDocument[i].getParts();
                for (int a = 0; a < sdparts.length; a++) {
                    ShippingDocumentPart sdpart = sdparts[a];
                    String labelLocation = System.getProperty("file.label.location");
                    if (labelLocation == null) {
                        labelLocation = "c:\\";
                    }
                    String labelName = shippingDocument[i].getType().getValue();
                    String shippingDocumentLabelFileName = new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
                    File shippingDocumentLabelFile = new File(shippingDocumentLabelFileName);
                    FileOutputStream fos = new FileOutputStream(shippingDocumentLabelFile);
                    fos.write(sdpart.getImage());
                    fos.close();
                    System.out.println("\nAssociated shipment label file name " + shippingDocumentLabelFile.getAbsolutePath());
                    Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + shippingDocumentLabelFile.getAbsolutePath());
                }
            }
        }
    }

    private static void getAssociatedShipmentLabels(AssociatedShipmentDetail[] associatedShipmentDetail) throws Exception {
        if (associatedShipmentDetail != null) {
            for (int j = 0; j < associatedShipmentDetail.length; j++) {
                if (associatedShipmentDetail[j].getLabel() != null && associatedShipmentDetail[j].getType() != null) {
                    String trackingNumber = associatedShipmentDetail[j].getTrackingId().getTrackingNumber();
                    String associatedShipmentType = associatedShipmentDetail[j].getType().getValue();
                    ShippingDocument associatedShipmentLabel = associatedShipmentDetail[j].getLabel();
                    saveAssociatedShipmentLabelToFile(associatedShipmentLabel, trackingNumber, associatedShipmentType);
                }
            }
        }
    }

    private static void saveAssociatedShipmentLabelToFile(ShippingDocument shippingDocument, String trackingNumber, String labelName) throws Exception {
        ShippingDocumentPart[] sdparts = shippingDocument.getParts();
        for (int a = 0; a < sdparts.length; a++) {
            ShippingDocumentPart sdpart = sdparts[a];
            String labelLocation = System.getProperty("file.label.location");
            if (labelLocation == null) {
                labelLocation = "c:\\";
            }
            String associatedShipmentLabelFileName = new String(labelLocation + labelName + "." + trackingNumber + "_" + a + ".pdf");
            File associatedShipmentLabelFile = new File(associatedShipmentLabelFileName);
            FileOutputStream fos = new FileOutputStream(associatedShipmentLabelFile);
            fos.write(sdpart.getImage());
            fos.close();
            System.out.println("\nAssociated shipment label file name " + associatedShipmentLabelFile.getAbsolutePath());
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + associatedShipmentLabelFile.getAbsolutePath());
        }
    }

    private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");

        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
            accountNumber = "959008817"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
            meterNumber = "113968542"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
    }

    private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
            key = "x14SOF5rlC0E7vhF"; // Replace "XXX" with clients key
        }
        if (password == null) {
            password = "7tBlBCmKnmJszT9sNsj1hzJSY"; // Replace "XXX" with clients password
        }
        userCredential.setKey(key);
        userCredential.setPassword(password);

        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential = false; //Set this value to true is using a parent credential
        if (useParentCredential) {

            String parentKey = System.getProperty("parentkey");
            String parentPassword = System.getProperty("parentpassword");
            //
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
            //
            if (parentKey == null) {
                parentKey = "XXX"; // Replace "XXX" with clients parent key
            }
            if (parentPassword == null) {
                parentPassword = "XXX"; // Replace "XXX" with clients parent password
            }
            parentCredential = new WebAuthenticationCredential();
            parentCredential.setKey(parentKey);
            parentCredential.setPassword(parentPassword);
        }
        return new WebAuthenticationDetail(parentCredential, userCredential);
    }

    private static void updateEndPoint(ShipServiceLocator serviceLocator) {
        String endPoint = System.getProperty("endPoint");
        if (endPoint != null) {
            serviceLocator.setShipServicePortEndpointAddress(endPoint);
        }
    }
}
