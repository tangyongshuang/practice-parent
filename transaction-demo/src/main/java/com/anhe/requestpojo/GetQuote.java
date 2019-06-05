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
@XStreamAlias("GetQuote")
public class GetQuote {

    private Request Request;
    private From From;
    private BkgDetails BkgDetails;
    private To To;
    private Dutiable Dutiable;
    public void setRequest(Request Request) {
         this.Request = Request;
     }
     public Request getRequest() {
         return Request;
     }

    public void setFrom(From From) {
         this.From = From;
     }
     public From getFrom() {
         return From;
     }

    public void setBkgDetails(BkgDetails BkgDetails) {
         this.BkgDetails = BkgDetails;
     }
     public BkgDetails getBkgDetails() {
         return BkgDetails;
     }

    public void setTo(To To) {
         this.To = To;
     }
     public To getTo() {
         return To;
     }

    public void setDutiable(Dutiable Dutiable) {
         this.Dutiable = Dutiable;
     }
     public Dutiable getDutiable() {
         return Dutiable;
     }

}