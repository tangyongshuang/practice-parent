package com.anhe.test;

import com.sun.imageio.plugins.png.PNGMetadata;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.imageio.*;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOMetadataNode;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by Albert.Tang on 2019/4/17 11:40 AM.
 */
public class ReadPNGMetaData {


    public static void main(String[] args) throws IOException {

        File file = new File("/Users/circleus/Documents/issue/DHL的label尾部添加内容/freeformatter-decoded-55.png");
        FileInputStream fileInputStream = new FileInputStream(file);

        OutputStream outputStream = new ByteArrayOutputStream();

        byte[] buff = new byte[1024];
        int len = -1;
        while ((len = fileInputStream.read(buff)) != -1) {
            outputStream.write(buff);
        }
        outputStream.flush();
        fileInputStream.close();
        outputStream.close();
        byte[] imageByte = ((ByteArrayOutputStream) outputStream).toByteArray();
        String result = readCustomData(imageByte, "76092");
        System.out.println(result);
    }

    /**
     * 读取元数据信息
     *
     * @param imageData
     * @param key
     * @return
     * @throws IOException
     */
    public static String readCustomData(byte[] imageData, String key) throws IOException {
        ImageReader imageReader = ImageIO.getImageReadersByFormatName("png").next();

        imageReader.setInput(ImageIO.createImageInputStream(new ByteArrayInputStream(imageData)), true);

        // read metadata of first image
        IIOMetadata metadata = imageReader.getImageMetadata(0);

        //this cast helps getting the contents
        PNGMetadata pngmeta = (PNGMetadata) metadata;
        NodeList childNodes = pngmeta.getStandardTextNode().getChildNodes();

        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            String keyword = node.getAttributes().getNamedItem("keyword").getNodeValue();
            String value = node.getAttributes().getNamedItem("value").getNodeValue();
            if (key.equals(keyword)) {
                return value;
            }
        }
        return null;
    }

    /**
     * 修改图片元数据信息
     *
     * @param buffImg
     * @param key
     * @param value
     * @return
     * @throws Exception
     */
    public static byte[] writeCustomData(BufferedImage buffImg, String key, String value) throws Exception {
        ImageWriter writer = ImageIO.getImageWritersByFormatName("png").next();

        ImageWriteParam writeParam = writer.getDefaultWriteParam();
        ImageTypeSpecifier typeSpecifier = ImageTypeSpecifier.createFromBufferedImageType(BufferedImage.TYPE_INT_RGB);

        //adding metadata
        IIOMetadata metadata = writer.getDefaultImageMetadata(typeSpecifier, writeParam);

        IIOMetadataNode textEntry = new IIOMetadataNode("tEXtEntry");
        textEntry.setAttribute("keyword", key);
        textEntry.setAttribute("value", value);

        IIOMetadataNode text = new IIOMetadataNode("tEXt");
        text.appendChild(textEntry);

        IIOMetadataNode root = new IIOMetadataNode("javax_imageio_png_1.0");
        root.appendChild(text);

        metadata.mergeTree("javax_imageio_png_1.0", root);

        //writing the data
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageOutputStream stream = ImageIO.createImageOutputStream(baos);
        writer.setOutput(stream);
        writer.write(metadata, new IIOImage(buffImg, null, metadata), writeParam);
        stream.close();

        return baos.toByteArray();
    }
}
