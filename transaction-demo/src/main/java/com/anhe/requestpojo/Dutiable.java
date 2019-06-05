/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.requestpojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Auto-generated: 2019-04-12 11:1:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("Dutiable")
public class Dutiable {

    private String DeclaredCurrency;
    private String DeclaredValue;
    public void setDeclaredCurrency(String DeclaredCurrency) {
         this.DeclaredCurrency = DeclaredCurrency;
     }
     public String getDeclaredCurrency() {
         return DeclaredCurrency;
     }

    public void setDeclaredValue(String DeclaredValue) {
         this.DeclaredValue = DeclaredValue;
     }
     public String getDeclaredValue() {
         return DeclaredValue;
     }

}