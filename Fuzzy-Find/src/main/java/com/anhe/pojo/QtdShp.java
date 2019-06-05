/**
 * Copyright 2019 bejson.com
 */
package com.anhe.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("QtdShp")
public class QtdShp {

    private OriginServiceArea OriginServiceArea;
    private DestinationServiceArea DestinationServiceArea;
    private String GlobalProductCode;
    private String LocalProductCode;
    private String ProductShortName;
    private String LocalProductName;
    private String NetworkTypeCode;
    private String POfferedCustAgreement;
    private String TransInd;
    private Date PickupDate;
    private String PickupCutoffTime;
    private String BookingTime;
    private String CurrencyCode;
    private String ExchangeRate;
    private String WeightCharge;
    private String WeightChargeTax;
    private String TotalTransitDays;
    private String PickupPostalLocAddDays;
    private String DeliveryPostalLocAddDays;
    private String PickupNonDHLCourierCode;
    private String DeliveryNonDHLCourierCode;
    private DeliveryDate DeliveryDate;
    private String DeliveryTime;
    private String DimensionalWeight;
    private String WeightUnit;
    private String PickupDayOfWeekNum;
    private String DestinationDayOfWeekNum;
    private String QuotedWeight;
    private String QuotedWeightUOM;
    @XStreamImplicit(itemFieldName = "QtdShpExChrg")
    private List<QtdShpExChrg> QtdShpExChrg;
    private Date PricingDate;
    private String ShippingCharge;
    private String TotalTaxAmount;
    @XStreamImplicit(itemFieldName = "QtdSInAdCur")
    private List<QtdSInAdCur> QtdSInAdCur;
    private String PickupWindowEarliestTime;
    private String PickupWindowLatestTime;
    private String BookingCutoffOffset;

    public void setOriginServiceArea(OriginServiceArea OriginServiceArea) {
        this.OriginServiceArea = OriginServiceArea;
    }

    public OriginServiceArea getOriginServiceArea() {
        return OriginServiceArea;
    }

    public void setDestinationServiceArea(DestinationServiceArea DestinationServiceArea) {
        this.DestinationServiceArea = DestinationServiceArea;
    }

    public DestinationServiceArea getDestinationServiceArea() {
        return DestinationServiceArea;
    }

    public void setGlobalProductCode(String GlobalProductCode) {
        this.GlobalProductCode = GlobalProductCode;
    }

    public String getGlobalProductCode() {
        return GlobalProductCode;
    }

    public void setLocalProductCode(String LocalProductCode) {
        this.LocalProductCode = LocalProductCode;
    }

    public String getLocalProductCode() {
        return LocalProductCode;
    }

    public void setProductShortName(String ProductShortName) {
        this.ProductShortName = ProductShortName;
    }

    public String getProductShortName() {
        return ProductShortName;
    }

    public void setLocalProductName(String LocalProductName) {
        this.LocalProductName = LocalProductName;
    }

    public String getLocalProductName() {
        return LocalProductName;
    }

    public void setNetworkTypeCode(String NetworkTypeCode) {
        this.NetworkTypeCode = NetworkTypeCode;
    }

    public String getNetworkTypeCode() {
        return NetworkTypeCode;
    }

    public void setPOfferedCustAgreement(String POfferedCustAgreement) {
        this.POfferedCustAgreement = POfferedCustAgreement;
    }

    public String getPOfferedCustAgreement() {
        return POfferedCustAgreement;
    }

    public void setTransInd(String TransInd) {
        this.TransInd = TransInd;
    }

    public String getTransInd() {
        return TransInd;
    }

    public void setPickupDate(Date PickupDate) {
        this.PickupDate = PickupDate;
    }

    public Date getPickupDate() {
        return PickupDate;
    }

    public void setPickupCutoffTime(String PickupCutoffTime) {
        this.PickupCutoffTime = PickupCutoffTime;
    }

    public String getPickupCutoffTime() {
        return PickupCutoffTime;
    }

    public void setBookingTime(String BookingTime) {
        this.BookingTime = BookingTime;
    }

    public String getBookingTime() {
        return BookingTime;
    }

    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setExchangeRate(String ExchangeRate) {
        this.ExchangeRate = ExchangeRate;
    }

    public String getExchangeRate() {
        return ExchangeRate;
    }

    public void setWeightCharge(String WeightCharge) {
        this.WeightCharge = WeightCharge;
    }

    public String getWeightCharge() {
        return WeightCharge;
    }

    public void setWeightChargeTax(String WeightChargeTax) {
        this.WeightChargeTax = WeightChargeTax;
    }

    public String getWeightChargeTax() {
        return WeightChargeTax;
    }

    public void setTotalTransitDays(String TotalTransitDays) {
        this.TotalTransitDays = TotalTransitDays;
    }

    public String getTotalTransitDays() {
        return TotalTransitDays;
    }

    public void setPickupPostalLocAddDays(String PickupPostalLocAddDays) {
        this.PickupPostalLocAddDays = PickupPostalLocAddDays;
    }

    public String getPickupPostalLocAddDays() {
        return PickupPostalLocAddDays;
    }

    public void setDeliveryPostalLocAddDays(String DeliveryPostalLocAddDays) {
        this.DeliveryPostalLocAddDays = DeliveryPostalLocAddDays;
    }

    public String getDeliveryPostalLocAddDays() {
        return DeliveryPostalLocAddDays;
    }

    public void setPickupNonDHLCourierCode(String PickupNonDHLCourierCode) {
        this.PickupNonDHLCourierCode = PickupNonDHLCourierCode;
    }

    public String getPickupNonDHLCourierCode() {
        return PickupNonDHLCourierCode;
    }

    public void setDeliveryNonDHLCourierCode(String DeliveryNonDHLCourierCode) {
        this.DeliveryNonDHLCourierCode = DeliveryNonDHLCourierCode;
    }

    public String getDeliveryNonDHLCourierCode() {
        return DeliveryNonDHLCourierCode;
    }

    public void setDeliveryDate(DeliveryDate DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    public DeliveryDate getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryTime(String DeliveryTime) {
        this.DeliveryTime = DeliveryTime;
    }

    public String getDeliveryTime() {
        return DeliveryTime;
    }

    public void setDimensionalWeight(String DimensionalWeight) {
        this.DimensionalWeight = DimensionalWeight;
    }

    public String getDimensionalWeight() {
        return DimensionalWeight;
    }

    public void setWeightUnit(String WeightUnit) {
        this.WeightUnit = WeightUnit;
    }

    public String getWeightUnit() {
        return WeightUnit;
    }

    public void setPickupDayOfWeekNum(String PickupDayOfWeekNum) {
        this.PickupDayOfWeekNum = PickupDayOfWeekNum;
    }

    public String getPickupDayOfWeekNum() {
        return PickupDayOfWeekNum;
    }

    public void setDestinationDayOfWeekNum(String DestinationDayOfWeekNum) {
        this.DestinationDayOfWeekNum = DestinationDayOfWeekNum;
    }

    public String getDestinationDayOfWeekNum() {
        return DestinationDayOfWeekNum;
    }

    public void setQuotedWeight(String QuotedWeight) {
        this.QuotedWeight = QuotedWeight;
    }

    public String getQuotedWeight() {
        return QuotedWeight;
    }

    public void setQuotedWeightUOM(String QuotedWeightUOM) {
        this.QuotedWeightUOM = QuotedWeightUOM;
    }

    public String getQuotedWeightUOM() {
        return QuotedWeightUOM;
    }

    public void setQtdShpExChrg(List<QtdShpExChrg> QtdShpExChrg) {
        this.QtdShpExChrg = QtdShpExChrg;
    }

    public List<QtdShpExChrg> getQtdShpExChrg() {
        return QtdShpExChrg;
    }

    public void setPricingDate(Date PricingDate) {
        this.PricingDate = PricingDate;
    }

    public Date getPricingDate() {
        return PricingDate;
    }

    public void setShippingCharge(String ShippingCharge) {
        this.ShippingCharge = ShippingCharge;
    }

    public String getShippingCharge() {
        return ShippingCharge;
    }

    public void setTotalTaxAmount(String TotalTaxAmount) {
        this.TotalTaxAmount = TotalTaxAmount;
    }

    public String getTotalTaxAmount() {
        return TotalTaxAmount;
    }

    public void setQtdSInAdCur(List<QtdSInAdCur> QtdSInAdCur) {
        this.QtdSInAdCur = QtdSInAdCur;
    }

    public List<QtdSInAdCur> getQtdSInAdCur() {
        return QtdSInAdCur;
    }

    public void setPickupWindowEarliestTime(String PickupWindowEarliestTime) {
        this.PickupWindowEarliestTime = PickupWindowEarliestTime;
    }

    public String getPickupWindowEarliestTime() {
        return PickupWindowEarliestTime;
    }

    public void setPickupWindowLatestTime(String PickupWindowLatestTime) {
        this.PickupWindowLatestTime = PickupWindowLatestTime;
    }

    public String getPickupWindowLatestTime() {
        return PickupWindowLatestTime;
    }

    public void setBookingCutoffOffset(String BookingCutoffOffset) {
        this.BookingCutoffOffset = BookingCutoffOffset;
    }

    public String getBookingCutoffOffset() {
        return BookingCutoffOffset;
    }

}