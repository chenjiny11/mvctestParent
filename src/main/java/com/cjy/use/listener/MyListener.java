package com.cjy.use.listener;


import com.cjy.use.util.SystemProperties;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

/**
 * 自定义监听器
 *
 * @author f4o823hv9
 * @since  2017/4/15.
 */
public class MyListener extends ContextLoaderListener {


    /**
     * 设置全局属性值
     *
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("name", SystemProperties.getPropertiesByKey("name"));
        super.contextInitialized(servletContextEvent);
    }

}
