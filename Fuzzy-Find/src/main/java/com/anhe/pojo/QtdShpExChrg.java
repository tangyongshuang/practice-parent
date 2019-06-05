/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("QtdShpExChrg")
public class QtdShpExChrg {

    private String SpecialServiceType;
    private String LocalServiceType;
    private String GlobalServiceName;
    private String LocalServiceTypeName;
    private String SOfferedCustAgreement;
    private String ChargeCodeType;
    private String CurrencyCode;
    private String ChargeValue;
    @XStreamImplicit(itemFieldName = "QtdSExtrChrgInAdCur")
    private List<QtdSExtrChrgInAdCur> QtdSExtrChrgInAdCur;
    public void setSpecialServiceType(String SpecialServiceType) {
         this.SpecialServiceType = SpecialServiceType;
     }
     public String getSpecialServiceType() {
         return SpecialServiceType;
     }

    public void setLocalServiceType(String LocalServiceType) {
         this.LocalServiceType = LocalServiceType;
     }
     public String getLocalServiceType() {
         return LocalServiceType;
     }

    public void setGlobalServiceName(String GlobalServiceName) {
         this.GlobalServiceName = GlobalServiceName;
     }
     public String getGlobalServiceName() {
         return GlobalServiceName;
     }

    public void setLocalServiceTypeName(String LocalServiceTypeName) {
         this.LocalServiceTypeName = LocalServiceTypeName;
     }
     public String getLocalServiceTypeName() {
         return LocalServiceTypeName;
     }

    public void setSOfferedCustAgreement(String SOfferedCustAgreement) {
         this.SOfferedCustAgreement = SOfferedCustAgreement;
     }
     public String getSOfferedCustAgreement() {
         return SOfferedCustAgreement;
     }

    public void setChargeCodeType(String ChargeCodeType) {
         this.ChargeCodeType = ChargeCodeType;
     }
     public String getChargeCodeType() {
         return ChargeCodeType;
     }

    public void setCurrencyCode(String CurrencyCode) {
         this.CurrencyCode = CurrencyCode;
     }
     public String getCurrencyCode() {
         return CurrencyCode;
     }

    public void setChargeValue(String ChargeValue) {
         this.ChargeValue = ChargeValue;
     }
     public String getChargeValue() {
         return ChargeValue;
     }

    public void setQtdSExtrChrgInAdCur(List<QtdSExtrChrgInAdCur> QtdSExtrChrgInAdCur) {
         this.QtdSExtrChrgInAdCur = QtdSExtrChrgInAdCur;
     }
     public List<QtdSExtrChrgInAdCur> getQtdSExtrChrgInAdCur() {
         return QtdSExtrChrgInAdCur;
     }

}