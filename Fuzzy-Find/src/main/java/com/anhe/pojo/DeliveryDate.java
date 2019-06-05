/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Date;

/**
 * Auto-generated: 2019-04-12 10:11:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("DeliveryDate")
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