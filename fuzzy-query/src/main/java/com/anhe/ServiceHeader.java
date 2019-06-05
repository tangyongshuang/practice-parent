/**
  * Copyright 2019 bejson.com 
  */
package com.anhe;
import java.util.Date;

/**
 * Auto-generated: 2019-04-11 19:53:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class ServiceHeader {

    private Date MessageTime;
    private String MessageReference;
    private String SiteID;
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

}