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
@XStreamAlias("PieceID")
public class Piece {

    private String PieceID;
    private String Height;
    private String Depth;
    private String Width;
    private String Weight;
    public void setPieceID(String PieceID) {
         this.PieceID = PieceID;
     }
     public String getPieceID() {
         return PieceID;
     }

    public void setHeight(String Height) {
         this.Height = Height;
     }
     public String getHeight() {
         return Height;
     }

    public void setDepth(String Depth) {
         this.Depth = Depth;
     }
     public String getDepth() {
         return Depth;
     }

    public void setWidth(String Width) {
         this.Width = Width;
     }
     public String getWidth() {
         return Width;
     }

    public void setWeight(String Weight) {
         this.Weight = Weight;
     }
     public String getWeight() {
         return Weight;
     }

}