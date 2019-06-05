/**
  * Copyright 2019 bejson.com 
  */
package com.anhe.requestpojo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

import javax.validation.constraints.Max;
import java.util.List;

/**
 * Auto-generated: 2019-04-12 11:1:1
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@XStreamAlias("Pieces")
public class Pieces {

    @XStreamImplicit(itemFieldName = "Piece")
    private List<Piece> Piece;

    public List<com.anhe.requestpojo.Piece> getPiece() {
        return Piece;
    }

    public void setPiece(List<com.anhe.requestpojo.Piece> piece) {
        Piece = piece;
    }
}