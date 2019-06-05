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
public class DeliveryDate {

    private String DeliveryType;
    private Date DlvyDateTime;
    private String DeliveryDateTimeOffset;
    public void setDeliveryType(String DeliveryType) {
         this.DeliveryType = DeliveryType;
     }
     public String getDeliveryType() {
         return DeliveryType;
     }

    public void setDlvyDateTime(Date DlvyDateTime) {
         this.DlvyDateTime = DlvyDateTime;
     }
     public Date getDlvyDateTime() {
         return DlvyDateTime;
     }

    public void setDeliveryDateTimeOffset(String DeliveryDateTimeOffset) {
         this.DeliveryDateTimeOffset = DeliveryDateTimeOffset;
     }
     public String getDeliveryDateTimeOffset() {
         return DeliveryDateTimeOffset;
     }

}