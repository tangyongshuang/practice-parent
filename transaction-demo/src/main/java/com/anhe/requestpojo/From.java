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
@XStreamAlias("From")
public class From {

    private String CountryCode;
    private String Postalcode;
    public void setCountryCode(String CountryCode) {
         this.CountryCode = CountryCode;
     }
     public String getCountryCode() {
         return CountryCode;
     }

    public void setPostalcode(String Postalcode) {
         this.Postalcode = Postalcode;
     }
     public String getPostalcode() {
         return Postalcode;
     }

}