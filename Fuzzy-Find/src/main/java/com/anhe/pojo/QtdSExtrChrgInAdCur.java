/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("QtdSExtrChrgInAdCur")
public class QtdSExtrChrgInAdCur {

    private String ChargeValue;
    private String CurrencyCode;
    private String CurrencyRoleTypeCode;
    public void setChargeValue(String ChargeValue) {
         this.ChargeValue = ChargeValue;
     }
     public String getChargeValue() {
         return ChargeValue;
     }

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

}