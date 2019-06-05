/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.pojo;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import java.util.List;

/**
 * Auto-generated: 2019-04-12 10:36:42
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("BkgDetails")
public class BkgDetails {

    @XStreamImplicit(itemFieldName = "QtdShp")
    private List<QtdShp> QtdShp;
    public void setQtdShp(List<QtdShp> QtdShp) {
         this.QtdShp = QtdShp;
     }
     public List<QtdShp> getQtdShp() {
         return QtdShp;
     }

}