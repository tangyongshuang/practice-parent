package com.anhe.test;

/**
 * Created by Albert.Tang on 2019/4/15 3:49 PM.
 */
public class ParseStringTest {
    public static void main(String[] args) {
        String s = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><res:DCTResponse xmlns:res='http://www.dhl.com' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance' xsi:schemaLocation= 'http://www.dhl.com DCT-Response.xsd'>\n" +
                "    <GetQuoteResponse>\n" +
                "        <Response>\n" +
                "            <ServiceHeader>\n" +
                "                <MessageTime>2019-04-15T09:47:47.186+02:00</MessageTime>\n" +
                "                <MessageReference>Shipmnt_AP_CN_wth2pc_62_sch_Reg</MessageReference>\n" +
                "                <SiteID>v62_oWcQZRvRrN</SiteID>\n" +
                "            </ServiceHeader>\n" +
                "        </Response>\n" +
                "        <Note>\n" +
                "            <ActionStatus>Success</ActionStatus>\n" +
                "            <Condition>\n" +
                "                <ConditionCode>410301</ConditionCode>\n" +
                "                <ConditionData>Products not available between this origin and destination (network segment)</ConditionData>\n" +
                "            </Condition>\n" +
                "        </Note>\n" +
                "    </GetQuoteResponse></res:DCTResponse><!-- ServiceInvocationId:20190415094746_97ed_3207c456-98fb-4486-86f4-a71a5d825f6a -->";
//        System.out.println(s.substring(s.indexOf("<ConditionData>") + "<ConditionData>".length(), s.indexOf("</ConditionData>")));

        String ss = "Total Declared Value must be same per the                    total of all individual item&apos;s value in export                    line item section. Please update it and                    re-try.:Total Declared Value must be same per the                    total of all individual item&apos;s value in export                    line item section. Please update it and re-try.";
        ss = ss.replaceAll("                    ", " ");
        ss = ss.replaceAll("&apos;", "'");
        String sss = "Division code has been replaced to valid GREF                Division Code";
        sss = repaceWhiteSapce(ss);
        System.out.println(sss);
    }

    public static String repaceWhiteSapce(String original) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstSpace = false;//标记是否是第一个空格

//        original = original.trim();//如果考虑开头和结尾有空格的情形

        char c;
        for (int i = 0; i < original.length(); i++) {
            c = original.charAt(i);
            if (c == ' ' || c == '\t')//遇到空格字符时,先判断是不是第一个空格字符
            {
                if (!isFirstSpace) {
                    sb.append(c);
                    isFirstSpace = true;
                }
            } else {//遇到非空格字符时
                sb.append(c);
                isFirstSpace = false;
            }
        }
        return sb.toString();
    }
}
