package apiDemos;

import utils.Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Accessibility extends Base {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("\"./src/global.properties\"");
        Properties properties = new Properties();
        properties.load(fileInputStream);
    }
}
