/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;

import java.math.BigDecimal;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class QtdSInAdCur {

    private BigDecimal ExchangeRate;

    public BigDecimal getExchangeRate() {
        return ExchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        ExchangeRate = exchangeRate;
    }

    private String CurrencyCode;
    private String CurrencyRoleTypeCode;
    private String WeightCharge;
    private String TotalAmount;
    private String TotalTaxAmount;
    private String WeightChargeTax;
    public void setCurrencyCode(String CurrencyCode) {
         this.CurrencyCode = CurrencyCode;
     }
     public String getCurrencyCode() {
         return CurrencyCode;
     }

    public void setCurrencyRoleTypeCode(String CurrencyRoleTypeCode) {
         this.CurrencyRoleTypeCode = CurrencyRoleTypeCode;
     }
     public String getCurrencyRoleTypeCode() {
         return CurrencyRoleTypeCode;
     }

    public void setWeightCharge(String WeightCharge) {
         this.WeightCharge = WeightCharge;
     }
     public String getWeightCharge() {
         return WeightCharge;
     }

    public void setTotalAmount(String TotalAmount) {
         this.TotalAmount = TotalAmount;
     }
     public String getTotalAmount() {
         return TotalAmount;
     }

    public void setTotalTaxAmount(String TotalTaxAmount) {
         this.TotalTaxAmount = TotalTaxAmount;
     }
     public String getTotalTaxAmount() {
         return TotalTaxAmount;
     }

    public void setWeightChargeTax(String WeightChargeTax) {
         this.WeightChargeTax = WeightChargeTax;
     }
     public String getWeightChargeTax() {
         return WeightChargeTax;
     }

}