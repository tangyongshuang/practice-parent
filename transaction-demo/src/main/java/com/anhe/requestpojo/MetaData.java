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
@XStreamAlias("MetaData")
public class MetaData {

    private String SoftwareName;
    private String SoftwareVersion;
    public void setSoftwareName(String SoftwareName) {
         this.SoftwareName = SoftwareName;
     }
     public String getSoftwareName() {
         return SoftwareName;
     }

    public void setSoftwareVersion(String SoftwareVersion) {
         this.SoftwareVersion = SoftwareVersion;
     }
     public String getSoftwareVersion() {
         return SoftwareVersion;
     }

}