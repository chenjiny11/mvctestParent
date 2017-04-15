package com.cjy.use.util;



import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author f4o823hv9
 * @since  2017/4/15.
 */
public class SystemProperties {

    private static Properties properties = new Properties();

    static {
        InputStream resourceAsStream = SystemProperties.class.getClassLoader().getResourceAsStream("init-content.properties");
        try {
            properties.load(resourceAsStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(resourceAsStream);
        }
    }

    private SystemProperties() {
    }

    public static String getPropertiesByKey(String key) {
        return properties.getProperty(key);
    }


}
