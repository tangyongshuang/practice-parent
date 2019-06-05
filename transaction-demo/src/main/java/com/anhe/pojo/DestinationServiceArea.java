/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("DestinationServiceArea")
public class DestinationServiceArea {

    private String FacilityCode;
    private String ServiceAreaCode;
    public void setFacilityCode(String FacilityCode) {
         this.FacilityCode = FacilityCode;
     }
     public String getFacilityCode() {
         return FacilityCode;
     }

    public void setServiceAreaCode(String ServiceAreaCode) {
         this.ServiceAreaCode = ServiceAreaCode;
     }
     public String getServiceAreaCode() {
         return ServiceAreaCode;
     }

}