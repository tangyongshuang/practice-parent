package com.anhe.test;

/**
 * Created by Albert.Tang on 2019/5/5 12:38 PM.
 */
public class FilterChainTest {

    public static void main(String[] args) {
        Message message = new Message();
        message.setMsg("我们都是程序员<script>,我们都是996");

        String msg = message.getMsg();

        System.out.println(msg);

    }

    interface Filter {
        void doFilter(String msg);
    }

    class HTMLFilter implements Filter{

        @Override
        public void doFilter(String msg) {
            msg = msg.replace("<", "[");
            msg = msg.replace(">", "]");
        }
    }

    class SentiviteFilter implements Filter{

        @Override
        public void doFilter(String msg) {
            msg = msg.replace("996", "955");
        }
    }

    static class Message {
        private String title;
        private String msg;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }
}
