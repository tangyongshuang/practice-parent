package com.anhe.test;

import com.anhe.requestpojo.*;
import com.thoughtworks.xstream.XStream;

import java.util.Date;

/**
 * Created by Albert.Tang on 2019/4/12 11:08 AM.
 */
public class DHLRateRequestTest {
    public static void main(String[] args) {
        GetQuote getQuote = new GetQuote();

        Request request = new Request();
        ServiceHeader serviceHeader = new ServiceHeader();
        serviceHeader.setMessageTime(new Date());
        serviceHeader.setMessageReference("Circle中国官方唯一入口");
        serviceHeader.setSiteID("v62_oWcQZRvRrN");
        serviceHeader.setPassword("2rtk88ZGb5");
        MetaData metaData = new MetaData();
        metaData.setSoftwareName("3PV");
        metaData.setSoftwareVersion("1.0");
        request.setServiceHeader(serviceHeader);
        request.setMetaData(metaData);
        getQuote.setRequest(request);

        From from = new From();
        from.setCountryCode("CN");
        from.setPostalcode("310008");
        getQuote.setFrom(from);

        BkgDetails bkgDetails = new BkgDetails();
        bkgDetails.setPaymentCountryCode("CN");
        bkgDetails.setDate(new Date());
        bkgDetails.setReadyTime("PT10H21M");
        bkgDetails.setReadyTimeGMTOffset("+01:00");
        bkgDetails.setDimensionUnit("CM");
        bkgDetails.setWeightUnit("KG");
        Pieces pieces = new Pieces();
        Piece piece = new Piece();
        piece.setPieceID("1");
        piece.setHeight("30");
        piece.setDepth("20");
        piece.setWidth("10");
        piece.setWeight("1.0");
//        pieces.setPiece(piece);
//        bkgDetails.setPieces(pieces);
        bkgDetails.setIsDutiable("N");
        bkgDetails.setNetworkTypeCode("AL");
        bkgDetails.setInsuredValue("400.000");
        bkgDetails.setInsuredCurrency("IDR");
        getQuote.setBkgDetails(bkgDetails);

        To to = new To();
        to.setCountryCode("US");
        to.setPostalcode("19711");
        getQuote.setTo(to);

        Dutiable dutiable = new Dutiable();
        dutiable.setDeclaredCurrency("CNY");
        dutiable.setDeclaredValue("9.0");
        getQuote.setDutiable(dutiable);

        XStream xStream = new XStream();
        xStream.processAnnotations(GetQuote.class);
        String ss = xStream.toXML(getQuote);
        System.out.println(ss);
        System.out.println(111);
    }
}
