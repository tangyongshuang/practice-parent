/**
  * Copyright 2019 bejson.com 
  */
package com.anhe;
import java.util.List;

/**
 * Auto-generated: 2019-04-11 19:53:56
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Srv {

    private String GlobalProductCode;
    private List<MrkSrv> MrkSrv;
    public void setGlobalProductCode(String GlobalProductCode) {
         this.GlobalProductCode = GlobalProductCode;
     }
     public String getGlobalProductCode() {
         return GlobalProductCode;
     }

    public void setMrkSrv(List<MrkSrv> MrkSrv) {
         this.MrkSrv = MrkSrv;
     }
     public List<MrkSrv> getMrkSrv() {
         return MrkSrv;
     }

}