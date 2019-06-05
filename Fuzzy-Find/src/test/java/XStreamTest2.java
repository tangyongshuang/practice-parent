import com.anhe.controller.testpojo.User;
import com.anhe.util.XmlUtil;
import com.thoughtworks.xstream.XStream;

/**
 * Created by Albert.Tang on 2019/4/11 11:36 PM.
 */
public class XStreamTest2 {
    public static void main(String[] args) {
        XStream xStream = new XStream();
        User user = XmlUtil.xmlToBean("<User>\n" +
                "<name>tom</name>\n" +
                "<age>23</age>\n" +
                "<Customer>\n" +
                "\t<commodity>apple1</commodity>\n" +
                "</Customer>\n" +
                "<Customer>\n" +
                "\t<commodity>apple2</commodity>\n" +
                "</Customer>\n" +
                "</User>",User.class);
        System.out.println(user);
        System.out.println("111");
    }
}
