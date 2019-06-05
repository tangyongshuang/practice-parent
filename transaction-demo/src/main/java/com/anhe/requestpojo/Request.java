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
@XStreamAlias("Request")
public class Request {

    private ServiceHeader ServiceHeader;
    private MetaData MetaData;

    public Request() {
    }

    public void setServiceHeader(ServiceHeader ServiceHeader) {
         this.ServiceHeader = ServiceHeader;
     }
     public ServiceHeader getServiceHeader() {
         return ServiceHeader;
     }

    public void setMetaData(MetaData MetaData) {
         this.MetaData = MetaData;
     }
     public MetaData getMetaData() {
         return MetaData;
     }

}