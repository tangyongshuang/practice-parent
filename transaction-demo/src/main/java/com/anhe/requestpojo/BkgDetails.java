/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.requestpojo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * Auto-generated: 2019-04-12 11:1:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("BkgDetails")
public class BkgDetails {

    private String PaymentCountryCode;
    private Date Date;
    private String ReadyTime;
    private String ReadyTimeGMTOffset;
    private String DimensionUnit;
    private String WeightUnit;
    private Pieces Pieces;
    private String IsDutiable;
    private String NetworkTypeCode;
    private String InsuredValue;
    private String InsuredCurrency;
    public void setPaymentCountryCode(String PaymentCountryCode) {
         this.PaymentCountryCode = PaymentCountryCode;
     }
     public String getPaymentCountryCode() {
         return PaymentCountryCode;
     }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public void setReadyTime(String ReadyTime) {
         this.ReadyTime = ReadyTime;
     }
     public String getReadyTime() {
         return ReadyTime;
     }

    public void setReadyTimeGMTOffset(String ReadyTimeGMTOffset) {
         this.ReadyTimeGMTOffset = ReadyTimeGMTOffset;
     }
     public String getReadyTimeGMTOffset() {
         return ReadyTimeGMTOffset;
     }

    public void setDimensionUnit(String DimensionUnit) {
         this.DimensionUnit = DimensionUnit;
     }
     public String getDimensionUnit() {
         return DimensionUnit;
     }

    public void setWeightUnit(String WeightUnit) {
         this.WeightUnit = WeightUnit;
     }
     public String getWeightUnit() {
         return WeightUnit;
     }

    public void setPieces(Pieces Pieces) {
         this.Pieces = Pieces;
     }
     public Pieces getPieces() {
         return Pieces;
     }

    public void setIsDutiable(String IsDutiable) {
         this.IsDutiable = IsDutiable;
     }
     public String getIsDutiable() {
         return IsDutiable;
     }

    public void setNetworkTypeCode(String NetworkTypeCode) {
         this.NetworkTypeCode = NetworkTypeCode;
     }
     public String getNetworkTypeCode() {
         return NetworkTypeCode;
     }

    public void setInsuredValue(String InsuredValue) {
         this.InsuredValue = InsuredValue;
     }
     public String getInsuredValue() {
         return InsuredValue;
     }

    public void setInsuredCurrency(String InsuredCurrency) {
         this.InsuredCurrency = InsuredCurrency;
     }
     public String getInsuredCurrency() {
         return InsuredCurrency;
     }

}