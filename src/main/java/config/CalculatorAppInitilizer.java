package config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class CalculatorAppInitilizer extends AbstractDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    // regist the Spring config file
    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class aClass[] = {CalculatorAppConfig.class};
        return aClass;
    }

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        return null;
    }

    // add mapping URL
    @Override
    protected String[] getServletMappings() {
        String arr[] = {"/java/*"};
        return arr;
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
