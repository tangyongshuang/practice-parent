package com.anhe.test2;

import com.anhe.pojo.Person;
import com.anhe.pojo.QtdShp;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;

/**
 * Created by Albert.Tang on 2019/4/11 11:36 PM.
 */
public class XStreamTest8 {
    public static void main(String[] args) throws IOException {
        XStream xStream = new XStream();
        xStream.processAnnotations(QtdShp.class);
//        Person person1 = new Person("张三", 19, "李四", "王五", "赵六");
//        String s = xStream.toXML(person1);
//        System.out.println(s);
        QtdShp person = (QtdShp) xStream.fromXML("     <QtdShp>\n" +
                "                <OriginServiceArea>\n" +
                "                    <FacilityCode>HGE</FacilityCode>\n" +
                "                    <ServiceAreaCode>HGH</ServiceAreaCode>\n" +
                "                </OriginServiceArea>\n" +
                "                <DestinationServiceArea>\n" +
                "                    <FacilityCode>PH2</FacilityCode>\n" +
                "                    <ServiceAreaCode>PHL</ServiceAreaCode>\n" +
                "                </DestinationServiceArea>\n" +
                "                <GlobalProductCode>7</GlobalProductCode>\n" +
                "                <LocalProductCode>7</LocalProductCode>\n" +
                "                <ProductShortName>EXPRESS EASY</ProductShortName>\n" +
                "                <LocalProductName>EXPRESS EASY DOC</LocalProductName>\n" +
                "                <NetworkTypeCode>TD</NetworkTypeCode>\n" +
                "                <POfferedCustAgreement>Y</POfferedCustAgreement>\n" +
                "                <TransInd>N</TransInd>\n" +
                "                <PickupDate>2019-04-12 11:59:00.123 CST</PickupDate>\n" +
                "                <PickupCutoffTime>PT20H30M</PickupCutoffTime>\n" +
                "                <BookingTime>PT19H30M</BookingTime>\n" +
                "                <CurrencyCode>CNY</CurrencyCode>\n" +
                "                <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                <WeightCharge>499.000</WeightCharge>\n" +
                "                <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                <TotalTransitDays>3</TotalTransitDays>\n" +
                "                <PickupPostalLocAddDays>0</PickupPostalLocAddDays>\n" +
                "                <DeliveryPostalLocAddDays>0</DeliveryPostalLocAddDays>\n" +
                "                <PickupNonDHLCourierCode> </PickupNonDHLCourierCode>\n" +
                "                <DeliveryNonDHLCourierCode> </DeliveryNonDHLCourierCode>\n" +
                "                <DeliveryDate>\n" +
                "                    <DeliveryType>QDDC</DeliveryType>\n" +
                "                    <DlvyDateTime>2019-04-15 11:59:00 CST</DlvyDateTime>\n" +
                "                    <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "                </DeliveryDate>\n" +
                "                <DeliveryTime>PT23H59M</DeliveryTime>\n" +
                "                <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "                <WeightUnit>KG</WeightUnit>\n" +
                "                <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "                <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "                <QuotedWeight>1.000</QuotedWeight>\n" +
                "                <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "                <PricingDate>2019-04-15 11:59:00 CST</PricingDate>\n" +
                "                <ShippingCharge>499.000</ShippingCharge>\n" +
                "                <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>499.000</WeightCharge>\n" +
                "                    <TotalAmount>499.000</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>499.000</WeightCharge>\n" +
                "                    <TotalAmount>499.000</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                    <CurrencyCode>EUR</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>64.690</WeightCharge>\n" +
                "                    <TotalAmount>64.690</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <PickupWindowEarliestTime>09:30:00</PickupWindowEarliestTime>\n" +
                "                <PickupWindowLatestTime>20:30:00</PickupWindowLatestTime>\n" +
                "                <BookingCutoffOffset>PT1H</BookingCutoffOffset>\n" +
                "            </QtdShp>");
        System.out.println(111);
    }
}
