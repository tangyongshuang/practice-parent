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
@XStreamAlias("ServiceHeader")
public class ServiceHeader {

    private Date MessageTime;
    private String MessageReference;
    private String SiteID;
    private String Password;
    public void setMessageTime(Date MessageTime) {
         this.MessageTime = MessageTime;
     }
     public Date getMessageTime() {
         return MessageTime;
     }

    public void setMessageReference(String MessageReference) {
         this.MessageReference = MessageReference;
     }
     public String getMessageReference() {
         return MessageReference;
     }

    public void setSiteID(String SiteID) {
         this.SiteID = SiteID;
     }
     public String getSiteID() {
         return SiteID;
     }

    public void setPassword(String Password) {
         this.Password = Password;
     }
     public String getPassword() {
         return Password;
     }

}