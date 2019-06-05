package com.anhe.test;

import com.anhe.pojo.BkgDetails;
import com.thoughtworks.xstream.XStream;

/**
 * Created by Albert.Tang on 2019/4/12 10:39 AM.
 */
public class DHLRateParseResponse {
    public static void main(String[] args) {
        XStream xStream = new XStream();
        xStream.processAnnotations(BkgDetails.class);
        BkgDetails bkgDetails = (BkgDetails) xStream.fromXML(
                "        <BkgDetails>\n" +
                "            <QtdShp>\n" +
                "                <OriginServiceArea>\n" +
                "                    <FacilityCode>HGE</FacilityCode>\n" +
                "                    <ServiceAreaCode>HGH</ServiceAreaCode>\n" +
                "                </OriginServiceArea>\n" +
                "                <DestinationServiceArea>\n" +
                "                    <FacilityCode>PH2</FacilityCode>\n" +
                "                    <ServiceAreaCode>PHL</ServiceAreaCode>\n" +
                "                </DestinationServiceArea>\n" +
                "                <GlobalProductCode>L</GlobalProductCode>\n" +
                "                <LocalProductCode>L</LocalProductCode>\n" +
                "                <ProductShortName>EXPRESS 10:30</ProductShortName>\n" +
                "                <LocalProductName>EXPRESS 10:30 DOC</LocalProductName>\n" +
                "                <NetworkTypeCode>TD</NetworkTypeCode>\n" +
                "                <POfferedCustAgreement>N</POfferedCustAgreement>\n" +
                "                <TransInd>Y</TransInd>\n" +
                "                <PickupDate>2019-04-12 11:59:00.123 CST</PickupDate>\n" +
                "                <PickupCutoffTime>PT20H30M</PickupCutoffTime>\n" +
                "                <BookingTime>PT19H30M</BookingTime>\n" +
                "                <CurrencyCode>CNY</CurrencyCode>\n" +
                "                <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                <WeightCharge>574.000</WeightCharge>\n" +
                "                <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                <TotalTransitDays>3</TotalTransitDays>\n" +
                "                <PickupPostalLocAddDays>0</PickupPostalLocAddDays>\n" +
                "                <DeliveryPostalLocAddDays>0</DeliveryPostalLocAddDays>\n" +
                "                <PickupNonDHLCourierCode> </PickupNonDHLCourierCode>\n" +
                "                <DeliveryNonDHLCourierCode> </DeliveryNonDHLCourierCode>\n" +
                "                <DeliveryDate>\n" +
                "                    <DeliveryType>QDDC</DeliveryType>\n" +
                "                    <DlvyDateTime>2019-04-15</DlvyDateTime>\n" +
                "                    <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "                </DeliveryDate>\n" +
                "                <DeliveryTime>PT10H30M</DeliveryTime>\n" +
                "                <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "                <WeightUnit>KG</WeightUnit>\n" +
                "                <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "                <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "                <QuotedWeight>1.500</QuotedWeight>\n" +
                "                <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "                <QtdShpExChrg>\n" +
                "                    <SpecialServiceType>YJ</SpecialServiceType>\n" +
                "                    <LocalServiceType>YJ</LocalServiceType>\n" +
                "                    <GlobalServiceName>10:30 PREMIUM</GlobalServiceName>\n" +
                "                    <LocalServiceTypeName>10:30 PREMIUM</LocalServiceTypeName>\n" +
                "                    <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "                    <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <ChargeValue>199.000</ChargeValue>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>199.000</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>199.000</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>25.800</ChargeValue>\n" +
                "                        <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "                        <CurrencyCode>EUR</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                </QtdShpExChrg>\n" +
                "                <QtdShpExChrg>\n" +
                "                    <SpecialServiceType>FF</SpecialServiceType>\n" +
                "                    <LocalServiceType>FF</LocalServiceType>\n" +
                "                    <GlobalServiceName>FUEL SURCHARGE</GlobalServiceName>\n" +
                "                    <LocalServiceTypeName>FUEL SURCHARGE</LocalServiceTypeName>\n" +
                "                    <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "                    <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <ChargeValue>133.340</ChargeValue>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>133.340</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>133.340</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>17.290</ChargeValue>\n" +
                "                        <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "                        <CurrencyCode>EUR</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                </QtdShpExChrg>\n" +
                "                <PricingDate>2019-04-12 11:59:00.123 CST</PricingDate>\n" +
                "                <ShippingCharge>906.340</ShippingCharge>\n" +
                "                <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>906.340</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>906.340</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                    <CurrencyCode>EUR</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>74.420</WeightCharge>\n" +
                "                    <TotalAmount>117.510</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <PickupWindowEarliestTime>09:30:00</PickupWindowEarliestTime>\n" +
                "                <PickupWindowLatestTime>20:30:00</PickupWindowLatestTime>\n" +
                "                <BookingCutoffOffset>PT1H</BookingCutoffOffset>\n" +
                "            </QtdShp>\n" +
                "            <QtdShp>\n" +
                "                <OriginServiceArea>\n" +
                "                    <FacilityCode>HGE</FacilityCode>\n" +
                "                    <ServiceAreaCode>HGH</ServiceAreaCode>\n" +
                "                </OriginServiceArea>\n" +
                "                <DestinationServiceArea>\n" +
                "                    <FacilityCode>PH2</FacilityCode>\n" +
                "                    <ServiceAreaCode>PHL</ServiceAreaCode>\n" +
                "                </DestinationServiceArea>\n" +
                "                <GlobalProductCode>T</GlobalProductCode>\n" +
                "                <LocalProductCode>T</LocalProductCode>\n" +
                "                <ProductShortName>EXPRESS 12:00</ProductShortName>\n" +
                "                <LocalProductName>EXPRESS 12:00 DOC</LocalProductName>\n" +
                "                <NetworkTypeCode>TD</NetworkTypeCode>\n" +
                "                <POfferedCustAgreement>N</POfferedCustAgreement>\n" +
                "                <TransInd>Y</TransInd>\n" +
                "                <PickupDate>2019-04-12 11:59:00.123 CST</PickupDate>\n" +
                "                <PickupCutoffTime>PT20H30M</PickupCutoffTime>\n" +
                "                <BookingTime>PT19H30M</BookingTime>\n" +
                "                <CurrencyCode>CNY</CurrencyCode>\n" +
                "                <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                <WeightCharge>574.000</WeightCharge>\n" +
                "                <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                <TotalTransitDays>3</TotalTransitDays>\n" +
                "                <PickupPostalLocAddDays>0</PickupPostalLocAddDays>\n" +
                "                <DeliveryPostalLocAddDays>0</DeliveryPostalLocAddDays>\n" +
                "                <PickupNonDHLCourierCode> </PickupNonDHLCourierCode>\n" +
                "                <DeliveryNonDHLCourierCode> </DeliveryNonDHLCourierCode>\n" +
                "                <DeliveryDate>\n" +
                "                    <DeliveryType>QDDC</DeliveryType>\n" +
                "                    <DlvyDateTime>2019-04-15 12:00:00.123 CST</DlvyDateTime>\n" +
                "                    <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "                </DeliveryDate>\n" +
                "                <DeliveryTime>PT12H</DeliveryTime>\n" +
                "                <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "                <WeightUnit>KG</WeightUnit>\n" +
                "                <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "                <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "                <QuotedWeight>1.500</QuotedWeight>\n" +
                "                <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "                <QtdShpExChrg>\n" +
                "                    <SpecialServiceType>YK</SpecialServiceType>\n" +
                "                    <LocalServiceType>YK</LocalServiceType>\n" +
                "                    <GlobalServiceName>12:00 PREMIUM</GlobalServiceName>\n" +
                "                    <LocalServiceTypeName>12:00 PREMIUM</LocalServiceTypeName>\n" +
                "                    <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "                    <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <ChargeValue>69.000</ChargeValue>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>69.000</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>69.000</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>8.950</ChargeValue>\n" +
                "                        <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "                        <CurrencyCode>EUR</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                </QtdShpExChrg>\n" +
                "                <QtdShpExChrg>\n" +
                "                    <SpecialServiceType>FF</SpecialServiceType>\n" +
                "                    <LocalServiceType>FF</LocalServiceType>\n" +
                "                    <GlobalServiceName>FUEL SURCHARGE</GlobalServiceName>\n" +
                "                    <LocalServiceTypeName>FUEL SURCHARGE</LocalServiceTypeName>\n" +
                "                    <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "                    <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <ChargeValue>110.920</ChargeValue>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>110.920</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>110.920</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>14.380</ChargeValue>\n" +
                "                        <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "                        <CurrencyCode>EUR</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                </QtdShpExChrg>\n" +
                "                <PricingDate>2019-04-12 11:59:00.123 CST</PricingDate>\n" +
                "                <ShippingCharge>753.920</ShippingCharge>\n" +
                "                <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>753.920</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>753.920</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                    <CurrencyCode>EUR</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>74.420</WeightCharge>\n" +
                "                    <TotalAmount>97.750</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <PickupWindowEarliestTime>09:30:00</PickupWindowEarliestTime>\n" +
                "                <PickupWindowLatestTime>20:30:00</PickupWindowLatestTime>\n" +
                "                <BookingCutoffOffset>PT1H</BookingCutoffOffset>\n" +
                "            </QtdShp>\n" +
                "            <QtdShp>\n" +
                "                <OriginServiceArea>\n" +
                "                    <FacilityCode>HGE</FacilityCode>\n" +
                "                    <ServiceAreaCode>HGH</ServiceAreaCode>\n" +
                "                </OriginServiceArea>\n" +
                "                <DestinationServiceArea>\n" +
                "                    <FacilityCode>PH2</FacilityCode>\n" +
                "                    <ServiceAreaCode>PHL</ServiceAreaCode>\n" +
                "                </DestinationServiceArea>\n" +
                "                <GlobalProductCode>D</GlobalProductCode>\n" +
                "                <LocalProductCode>D</LocalProductCode>\n" +
                "                <ProductShortName>EXPRESS WORLDWIDE</ProductShortName>\n" +
                "                <LocalProductName>EXPRESS WORLDWIDE DOC</LocalProductName>\n" +
                "                <NetworkTypeCode>TD</NetworkTypeCode>\n" +
                "                <POfferedCustAgreement>N</POfferedCustAgreement>\n" +
                "                <TransInd>Y</TransInd>\n" +
                "                <PickupDate>2019-04-12 11:59:00</PickupDate>\n" +
                "                <PickupCutoffTime>PT20H30M</PickupCutoffTime>\n" +
                "                <BookingTime>PT19H30M</BookingTime>\n" +
                "                <CurrencyCode>CNY</CurrencyCode>\n" +
                "                <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                <WeightCharge>574.000</WeightCharge>\n" +
                "                <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                <TotalTransitDays>3</TotalTransitDays>\n" +
                "                <PickupPostalLocAddDays>0</PickupPostalLocAddDays>\n" +
                "                <DeliveryPostalLocAddDays>0</DeliveryPostalLocAddDays>\n" +
                "                <PickupNonDHLCourierCode> </PickupNonDHLCourierCode>\n" +
                "                <DeliveryNonDHLCourierCode> </DeliveryNonDHLCourierCode>\n" +
                "                <DeliveryDate>\n" +
                "                    <DeliveryType>QDDC</DeliveryType>\n" +
                "                    <DlvyDateTime>2019-04-15 11:59:00.123 CST</DlvyDateTime>\n" +
                "                    <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "                </DeliveryDate>\n" +
                "                <DeliveryTime>PT23H59M</DeliveryTime>\n" +
                "                <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "                <WeightUnit>KG</WeightUnit>\n" +
                "                <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "                <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "                <QuotedWeight>1.500</QuotedWeight>\n" +
                "                <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "                <QtdShpExChrg>\n" +
                "                    <SpecialServiceType>FF</SpecialServiceType>\n" +
                "                    <LocalServiceType>FF</LocalServiceType>\n" +
                "                    <GlobalServiceName>FUEL SURCHARGE</GlobalServiceName>\n" +
                "                    <LocalServiceTypeName>FUEL SURCHARGE</LocalServiceTypeName>\n" +
                "                    <SOfferedCustAgreement>N</SOfferedCustAgreement>\n" +
                "                    <ChargeCodeType>SCH</ChargeCodeType>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <ChargeValue>99.020</ChargeValue>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>99.020</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>99.020</ChargeValue>\n" +
                "                        <CurrencyCode>CNY</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                    <QtdSExtrChrgInAdCur>\n" +
                "                        <ChargeValue>12.840</ChargeValue>\n" +
                "                        <ChargeTaxRate>0.000</ChargeTaxRate>\n" +
                "                        <CurrencyCode>EUR</CurrencyCode>\n" +
                "                        <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    </QtdSExtrChrgInAdCur>\n" +
                "                </QtdShpExChrg>\n" +
                "                <PricingDate>2019-04-15 11:59:00.123 CST</PricingDate>\n" +
                "                <ShippingCharge>673.020</ShippingCharge>\n" +
                "                <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BILLC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>673.020</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <CurrencyCode>CNY</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>PULCL</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>574.000</WeightCharge>\n" +
                "                    <TotalAmount>673.020</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <QtdSInAdCur>\n" +
                "                    <ExchangeRate>0.129643</ExchangeRate>\n" +
                "                    <CurrencyCode>EUR</CurrencyCode>\n" +
                "                    <CurrencyRoleTypeCode>BASEC</CurrencyRoleTypeCode>\n" +
                "                    <WeightCharge>74.420</WeightCharge>\n" +
                "                    <TotalAmount>87.260</TotalAmount>\n" +
                "                    <TotalTaxAmount>0.000</TotalTaxAmount>\n" +
                "                    <WeightChargeTax>0.000</WeightChargeTax>\n" +
                "                </QtdSInAdCur>\n" +
                "                <PickupWindowEarliestTime>09:30:00</PickupWindowEarliestTime>\n" +
                "                <PickupWindowLatestTime>20:30:00</PickupWindowLatestTime>\n" +
                "                <BookingCutoffOffset>PT1H</BookingCutoffOffset>\n" +
                "            </QtdShp>\n" +
                "            <QtdShp>\n" +
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
                "                    <DlvyDateTime>2019-04-15 11:59:00.123 CST</DlvyDateTime>\n" +
                "                    <DeliveryDateTimeOffset>+00:00</DeliveryDateTimeOffset>\n" +
                "                </DeliveryDate>\n" +
                "                <DeliveryTime>PT23H59M</DeliveryTime>\n" +
                "                <DimensionalWeight>1.200</DimensionalWeight>\n" +
                "                <WeightUnit>KG</WeightUnit>\n" +
                "                <PickupDayOfWeekNum>5</PickupDayOfWeekNum>\n" +
                "                <DestinationDayOfWeekNum>1</DestinationDayOfWeekNum>\n" +
                "                <QuotedWeight>1.000</QuotedWeight>\n" +
                "                <QuotedWeightUOM>KG</QuotedWeightUOM>\n" +
                "                <PricingDate>2019-04-15 11:59:00.123 CST</PricingDate>\n" +
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
                "            </QtdShp>\n" +
                "        </BkgDetails>\n" );
        System.out.println("111");
    }
}
