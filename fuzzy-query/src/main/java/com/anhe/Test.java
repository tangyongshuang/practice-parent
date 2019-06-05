package com.anhe;

import sun.misc.BASE64Decoder;

import java.io.*;

/**
 * Created by Albert.Tang on 2019/4/13 12:54 AM.
 */
public class Test {
    public static void base64StringToPdf(String base64Content,String filePath){
        BASE64Decoder decoder = new BASE64Decoder();
        BufferedInputStream bis = null;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;

        try {
            // base64编码内容转换为字节数组
            byte[] bytes = decoder.decodeBuffer(base64Content);
            ByteArrayInputStream byteInputStream = new ByteArrayInputStream(bytes);
            bis = new BufferedInputStream(byteInputStream);
            File file = new File(filePath);
            File path = file.getParentFile();
            if(!path.exists()){
                path.mkdirs();
            }
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int length = bis.read(buffer);
            while(length != -1){
                bos.write(buffer, 0, length);
                length = bis.read(buffer);
            }
            bos.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{


        }
    }

    public static void main(String[] args) {
        base64StringToPdf("iVBORw0KGgoAAAANSUhEUgAAAZYAAABeAQMAAAA6+qC4AAAABlBMVEX///8AAABVwtN+AAAAaklEQVR42mNkYGCo5K2e+6CjuF7xeAN7g9ALtgXitxYeb5BsYOj9yVHEsLT6flvnpHg1Tynxtpf3J3UwMDAxkA5G9YzqGdUzqmdUz6ieUT2jekb1jOoZ1TOqZ1TPqJ5RPaN6RvWM6hlMegDxYxW83WUuVwAAAABJRU5ErkJggg==","/Users/circleus/Documents/tmp/001/1.pdf");
    }

}
