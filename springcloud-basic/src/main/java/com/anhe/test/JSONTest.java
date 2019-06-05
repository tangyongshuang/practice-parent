//package com.anhe.test;
//
//import cn.miludeer.jsoncode.JsonCode;
//import com.alibaba.fastjson.JSON;
//import com.alibaba.fastjson.JSONObject;
//
//public class JSONTest {
//
//    private static String json = "{\"json\":{\"a\":{\"www\":\"ff\",\"rrr\":[\"v1\",\"v2\"]},\"b\":{\"www\":\"4567ttt\",\"rrr\":[\"v1\",\"v2\"]}}}";
//
//    private static String json2 = "{\n" +
//            "  \"clientDetail\": {\n" +
//            "    \"accountNumber\": \"899587790\",\n" +
//            "    \"meterNumber\": \"114539836\"\n" +
//            "  },\n" +
//            "  \"requestedShipment\": {\n" +
//            "    \"customsClearanceDetail\": {\n" +
//            "      \"brokers\": [],\n" +
//            "      \"commercialInvoice\": {\n" +
//            "        \"comments\": [],\n" +
//            "        \"customerReferences\": [],\n" +
//            "        \"purpose\": \"SOLD\",\n" +
//            "        \"termsOfSale\": \"DDU\"\n" +
//            "      },\n" +
//            "      \"commodities\": [\n" +
//            "        {\n" +
//            "          \"additionalMeasures\": [],\n" +
//            "          \"countryOfManufacture\": \"US\",\n" +
//            "          \"customsValue\": {\n" +
//            "            \"amount\": 1,\n" +
//            "            \"currency\": \"USD\"\n" +
//            "          },\n" +
//            "          \"description\": \"Mac\",\n" +
//            "          \"exciseConditions\": [],\n" +
//            "          \"harmonizedCode\": \"\",\n" +
//            "          \"numberOfPieces\": 1,\n" +
//            "          \"quantity\": 1,\n" +
//            "          \"quantityUnits\": \"EA\",\n" +
//            "          \"unitPrice\": {\n" +
//            "            \"amount\": 1,\n" +
//            "            \"currency\": \"USD\"\n" +
//            "          },\n" +
//            "          \"weight\": {\n" +
//            "            \"units\": \"LB\",\n" +
//            "            \"value\": 0.0625\n" +
//            "          }\n" +
//            "        }\n" +
//            "      ],\n" +
//            "      \"customsValue\": {\n" +
//            "        \"amount\": 1,\n" +
//            "        \"currency\": \"USD\"\n" +
//            "      },\n" +
//            "      \"documentContent\": \"DOCUMENTS_ONLY\",\n" +
//            "      \"dutiesPayment\": {\n" +
//            "        \"paymentType\": \"SENDER\",\n" +
//            "        \"payor\": {\n" +
//            "          \"responsibleParty\": {\n" +
//            "            \"accountNumber\": \"899587790\",\n" +
//            "            \"address\": {\n" +
//            "              \"countryCode\": \"US\",\n" +
//            "              \"streetLines\": []\n" +
//            "            },\n" +
//            "            \"contact\": {},\n" +
//            "            \"tins\": []\n" +
//            "          }\n" +
//            "        }\n" +
//            "      },\n" +
//            "      \"exportDetail\": {\n" +
//            "        \"exportComplianceStatement\": \"NO EEI 30.37 (a)\"\n" +
//            "      },\n" +
//            "      \"regulatoryControls\": []\n" +
//            "    },\n" +
//            "    \"dropoffType\": \"DROP_BOX\",\n" +
//            "    \"labelSpecification\": {\n" +
//            "      \"customerSpecifiedDetail\": {\n" +
//            "        \"additionalLabels\": [],\n" +
//            "        \"configurableReferenceEntries\": [],\n" +
//            "        \"maskedData\": [\n" +
//            "          \"DUTIES_AND_TAXES_PAYOR_ACCOUNT_NUMBER\",\n" +
//            "          \"TERMS_AND_CONDITIONS\",\n" +
//            "          \"TRANSPORTATION_CHARGES_PAYOR_ACCOUNT_NUMBER\"\n" +
//            "        ]\n" +
//            "      },\n" +
//            "      \"dispositions\": [],\n" +
//            "      \"imageType\": \"PDF\",\n" +
//            "      \"labelFormatType\": \"COMMON_2_D\",\n" +
//            "      \"labelStockType\": \"PAPER_4_X_6\"\n" +
//            "    },\n" +
//            "    \"masterTrackingId\": {},\n" +
//            "    \"packageCount\": 1,\n" +
//            "    \"packagingType\": \"YOUR_PACKAGING\",\n" +
//            "    \"rateRequestTypes\": [\n" +
//            "      \"ACCOUNT\"\n" +
//            "    ],\n" +
//            "    \"recipient\": {\n" +
//            "      \"address\": {\n" +
//            "        \"city\": \"hangzhou\",\n" +
//            "        \"countryCode\": \"CN\",\n" +
//            "        \"postalCode\": \"310021\",\n" +
//            "        \"residential\": false,\n" +
//            "        \"stateOrProvinceCode\": \"ZJ\",\n" +
//            "        \"streetLines\": [\n" +
//            "          \"hangzhou\",\n" +
//            "          \"\"\n" +
//            "        ]\n" +
//            "      },\n" +
//            "      \"contact\": {\n" +
//            "        \"companyName\": \"ciecle\",\n" +
//            "        \"personName\": \"ciecle\",\n" +
//            "        \"phoneNumber\": \"13216812660\"\n" +
//            "      },\n" +
//            "      \"tins\": []\n" +
//            "    },\n" +
//            "    \"requestedPackageLineItems\": [\n" +
//            "      {\n" +
//            "        \"contentRecords\": [],\n" +
//            "        \"customerReferences\": [\n" +
//            "          {\n" +
//            "            \"customerReferenceType\": \"CUSTOMER_REFERENCE\",\n" +
//            "            \"value\": \"20190515002\"\n" +
//            "          }\n" +
//            "        ],\n" +
//            "        \"dimensions\": {\n" +
//            "          \"height\": 2,\n" +
//            "          \"length\": 6,\n" +
//            "          \"units\": \"IN\",\n" +
//            "          \"width\": 4\n" +
//            "        },\n" +
//            "        \"insuredValue\": {\n" +
//            "          \"amount\": 0,\n" +
//            "          \"currency\": \"USD\"\n" +
//            "        },\n" +
//            "        \"sequenceNumber\": 1,\n" +
//            "        \"specialServicesRequested\": {\n" +
//            "          \"signatureOptionDetail\": {\n" +
//            "            \"optionType\": \"SERVICE_DEFAULT\"\n" +
//            "          },\n" +
//            "          \"specialServiceTypes\": []\n" +
//            "        },\n" +
//            "        \"weight\": {\n" +
//            "          \"units\": \"LB\",\n" +
//            "          \"value\": 0.125\n" +
//            "        }\n" +
//            "      }\n" +
//            "    ],\n" +
//            "    \"serviceType\": \"INTERNATIONAL_ECONOMY\",\n" +
//            "    \"shipTimestamp\": 1557892800000,\n" +
//            "    \"shipper\": {\n" +
//            "      \"address\": {\n" +
//            "        \"city\": \"Newark\",\n" +
//            "        \"countryCode\": \"US\",\n" +
//            "        \"postalCode\": \"19711\",\n" +
//            "        \"stateOrProvinceCode\": \"DE\",\n" +
//            "        \"streetLines\": [\n" +
//            "          \"201 Ruthar Drive, Suite 7\"\n" +
//            "        ]\n" +
//            "      },\n" +
//            "      \"contact\": {\n" +
//            "        \"companyName\": \"tangyongshuang6\",\n" +
//            "        \"personName\": \"tangyongshuang6\",\n" +
//            "        \"phoneNumber\": \"13216812\"\n" +
//            "      },\n" +
//            "      \"tins\": []\n" +
//            "    },\n" +
//            "    \"shippingChargesPayment\": {\n" +
//            "      \"paymentType\": \"SENDER\",\n" +
//            "      \"payor\": {\n" +
//            "        \"responsibleParty\": {\n" +
//            "          \"accountNumber\": \"899587790\",\n" +
//            "          \"address\": {\n" +
//            "            \"countryCode\": \"US\",\n" +
//            "            \"streetLines\": []\n" +
//            "          },\n" +
//            "          \"contact\": {},\n" +
//            "          \"tins\": []\n" +
//            "        }\n" +
//            "      }\n" +
//            "    },\n" +
//            "    \"shippingDocumentSpecification\": {\n" +
//            "      \"commercialInvoiceDetail\": {\n" +
//            "        \"customerImageUsages\": [],\n" +
//            "        \"format\": {\n" +
//            "          \"dispositions\": [],\n" +
//            "          \"imageType\": \"PDF\",\n" +
//            "          \"stockType\": \"PAPER_LETTER\"\n" +
//            "        }\n" +
//            "      },\n" +
//            "      \"customPackageDocumentDetail\": [],\n" +
//            "      \"customShipmentDocumentDetail\": [],\n" +
//            "      \"shippingDocumentTypes\": [\n" +
//            "        \"COMMERCIAL_INVOICE\"\n" +
//            "      ]\n" +
//            "    },\n" +
//            "    \"specialServicesRequested\": {\n" +
//            "      \"etdDetail\": {\n" +
//            "        \"documentReferences\": [],\n" +
//            "        \"requestedDocumentCopies\": [\n" +
//            "          \"COMMERCIAL_INVOICE\"\n" +
//            "        ]\n" +
//            "      },\n" +
//            "      \"specialServiceTypes\": [\n" +
//            "        \"ELECTRONIC_TRADE_DOCUMENTS\"\n" +
//            "      ]\n" +
//            "    },\n" +
//            "    \"totalInsuredValue\": {\n" +
//            "      \"amount\": 0,\n" +
//            "      \"currency\": \"USD\"\n" +
//            "    },\n" +
//            "    \"totalWeight\": {\n" +
//            "      \"units\": \"LB\",\n" +
//            "      \"value\": 0.125\n" +
//            "    }\n" +
//            "  },\n" +
//            "  \"transactionDetail\": {\n" +
//            "    \"customerTransactionId\": \"java Shipment\"\n" +
//            "  },\n" +
//            "  \"version\": {\n" +
//            "    \"intermediate\": 0,\n" +
//            "    \"major\": 13,\n" +
//            "    \"minor\": 0,\n" +
//            "    \"serviceId\": \"ship\"\n" +
//            "  },\n" +
//            "  \"webAuthenticationDetail\": {\n" +
//            "    \"userCredential\": {\n" +
//            "      \"key\": \"AtH7pgdGdvGce0GP\",\n" +
//            "      \"password\": \"ugudxJcKsYtxKCvyNxNPUFnwr\"\n" +
//            "    }\n" +
//            "  }\n" +
//            "}\n";
//
//    //    public static String usefastjson() {  // 使用fastjson
////        JSONObject ob = JSON.parseObject(json).getJSONObject("json").getJSONObject("b");
////        return ob.getString("www");
////    }
////
////    public static String usejsoncode() {   // 使用jsoncode
////        String ret = JsonCode.getValue(json, "$.json.b.www");
////        return ret;
////    }
////
////    public static void main(String[] argv) {
////        long time1 = System.currentTimeMillis();
////        for(int i=0; i<10000000;i++) {
////            usejsoncode();
////        }
////        long time2 = System.currentTimeMillis();
////        for(int i=0; i<10000000;i++) {
////            usefastjson();
////        }
////        long time3 = System.currentTimeMillis();
////
////
////        System.out.println("fastJson:" + (time3 - time2));
////        System.out.println("jsoncode:" + (time2 - time1));
//    public static void main(String[] args) {
//        String string = JSON.parseObject(json2).getJSONObject("requestedShipment").getString("dropoffType");
//        System.out.println(string);
//    }
//
//}
