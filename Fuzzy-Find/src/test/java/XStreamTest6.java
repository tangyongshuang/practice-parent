
import com.anhe.pojo.*;
import com.anhe.util.XmlUtil;
import com.thoughtworks.xstream.XStream;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Albert.Tang on 2019/4/11 11:36 PM.
 */
public class XStreamTest6 {
    public static void main(String[] args) throws IOException {
//        DateFormat dateTimeformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S z");
//        String strBeginDate = dateTimeformat.format(new Date());
//        System.out.println(strBeginDate);
//        InputStream xmlInputStream = new ClassPathResource("response.xml").getInputStream();
//        XStream xStream = new XStream();
//        xStream.alias("QtdShp", QtdShp.class);
//        xStream.alias("OriginServiceArea", OriginServiceArea.class);
//        xStream.alias("DestinationServiceArea", DestinationServiceArea.class);
//        xStream.alias("DeliveryDate", DeliveryDate.class);
//        xStream.alias("QtdShpExChrg", DeliveryDate.class);
//        xStream.alias("QtdSExtrChrgInAdCur", QtdSExtrChrgInAdCur.class);
//        xStream.alias("QtdShp", QtdShp.class);
////        xStream.alias("QtdSInAdCur", QtdSInAdCur.class);
//        QtdShp users = (QtdShp) xStream.fromXML(xmlInputStream);
//
//        System.out.println(1);
        QtdShp qtdShp = XmlUtil.xmlToBean("<QtdShp>\n" +
                "    <OriginServiceArea>\n" +
                "        <FacilityCode>HGE</FacilityCode>\n" +
                "        <ServiceAreaCode>HGH</ServiceAreaCode>\n" +
                "    </OriginServiceArea>\n" +
                "    <DestinationServiceArea>\n" +
                "        <FacilityCode>PH2</FacilityCode>\n" +
                "        <ServiceAreaCode>PHL</ServiceAreaCode>\n" +
                "    </DestinationServiceArea>\n" +
                "    <GlobalProductCode>L</GlobalProductCode>\n" +
                "    <LocalProductCode>L</LocalProductCode>\n" +
                "    <ProductShortName>EXPRESS 10:30</ProductShortName>\n" +
                "    <LocalProductName>EXPRESS 10:30 DOC</LocalProductName>\n" +
                "    <NetworkTypeCode>TD</NetworkTypeCode>\n" +
                "    <POfferedCustAgreement>N</POfferedCustAgreement>\n" +
                "    <TransInd>Y</TransInd>\n" +
                "    <PickupDate>2019-04-12 10:30:00.123 CST</PickupDate>\n" +
                "    <PickupCutoffTime>PT20H30M</PickupCutoffTime>\n" +
                "    <BookingTime>PT19H30M</BookingTime>\n" +
                "    <CurrencyCode>CNY</CurrencyCode>\n" +
                "    <ExchangeRate>0.129643</ExchangeRate>\n" +
                "    <WeightCharge>574.000</WeightCharge>\n" +
                "    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "    <TotalTransitDays>3</TotalTransitDays>\n" +
                "    <PickupPostalLocAddDays>0</PickupPostalLocAddDays>\n" +
                "    <DeliveryPostalLocAddDays>0</DeliveryPostalLocAddDays>\n" +
                "    <PickupNonDHLCourierCode> </PickupNonDHLCourierCode>\n" +
                "    <DeliveryNonDHLCourierCode> </DeliveryNonDHLCourierCode>\n" +
                "    <DeliveryDate>\n" +
                "        <DeliveryType>QDDC</DeliveryType>\n" +
                "        <DlvyDateTime>2019-04-15 10:30:00.123 CST</DlvyDateTime>\n" +
                "        <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "    </DeliveryDate>\n" +
                "    <DeliveryTime>PT10H30M</DeliveryTime>\n" +
                "    <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "    <WeightUnit>KG</WeightUnit>\n" +
                "    <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "    <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "    <QuotedWeight>1.500</QuotedWeight>\n" +
                "    <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "    <QtdShpExChrg>\n" +
                "        <SpecialServiceType>YJ</SpecialServiceType>\n" +
                "        <LocalServiceType>YJ</LocalServiceType>\n" +
                "        <GlobalServiceName>10:30 PREMIUM</GlobalServiceName>\n" +
                "        <LocalServiceTypeName>10:30 PREMIUM</LocalServiceTypeName>\n" +
                "        <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "        <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "        <CurrencyCode>CNY</CurrencyCode>\n" +
                "        <ChargeValue>199.000</ChargeValue>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>199.000</ChargeValue>\n" +
                "            <CurrencyCode>CNY</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>199.000</ChargeValue>\n" +
                "            <CurrencyCode>CNY</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>25.800</ChargeValue>\n" +
                "            <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "            <CurrencyCode>EUR</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "    </QtdShpExChrg>\n" +
                "    <QtdShpExChrg>\n" +
                "        <SpecialServiceType>FF</SpecialServiceType>\n" +
                "        <LocalServiceType>FF</LocalServiceType>\n" +
                "        <GlobalServiceName>FUEL SURCHARGE</GlobalServiceName>\n" +
                "        <LocalServiceTypeName>FUEL SURCHARGE</LocalServiceTypeName>\n" +
                "        <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "        <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "        <CurrencyCode>CNY</CurrencyCode>\n" +
                "        <ChargeValue>133.340</ChargeValue>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>133.340</ChargeValue>\n" +
                "            <CurrencyCode>CNY</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>133.340</ChargeValue>\n" +
                "            <CurrencyCode>CNY</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "        <QtdSExtrChrgInAdCur>\n" +
                "            <ChargeValue>17.290</ChargeValue>\n" +
                "            <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "            <CurrencyCode>EUR</CurrencyCode>\n" +
                "            <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "        </QtdSExtrChrgInAdCur>\n" +
                "    </QtdShpExChrg>\n" +
                "    <PricingDate>2019-04-11</PricingDate>\n" +
                "    <ShippingCharge>906.340</ShippingCharge>\n" +
                "    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "    <QtdSInAdCur>\n" +
                "        <CurrencyCode>CNY</CurrencyCode>\n" +
                "        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "        <WeightCharge>574.000</WeightCharge>\n" +
                "        <TotalAmount>906.340</TotalAmount>\n" +
                "        <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "        <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "    </QtdSInAdCur>\n" +
                "    <QtdSInAdCur>\n" +
                "        <CurrencyCode>CNY</CurrencyCode>\n" +
                "        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "        <WeightCharge>574.000</WeightCharge>\n" +
                "        <TotalAmount>906.340</TotalAmount>\n" +
                "        <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "        <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "    </QtdSInAdCur>\n" +
                "    <QtdSInAdCur>\n" +
                "        <ExchangeRate>0.129643</ExchangeRate>\n" +
                "        <CurrencyCode>EUR</CurrencyCode>\n" +
                "        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "        <WeightCharge>74.420</WeightCharge>\n" +
                "        <TotalAmount>117.510</TotalAmount>\n" +
                "        <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "        <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "    </QtdSInAdCur>\n" +
                "    <PickupWindowEarliestTime>09:30:00</PickupWindowEarliestTime>\n" +
                "    <PickupWindowLatestTime>20:30:00</PickupWindowLatestTime>\n" +
                "    <BookingCutoffOffset>PT1H</BookingCutoffOffset>\n" +
                "</QtdShp>", QtdShp.class);
        System.out.println(111);
    }
}
