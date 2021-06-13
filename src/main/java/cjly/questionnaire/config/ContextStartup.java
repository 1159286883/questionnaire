package cjly.questionnaire.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;

public class ContextStartup implements ApplicationRunner, ServletContextAware {

    ServletContext servletContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @Override
    public void setServletContext(ServletContext servletContext){
        this.servletContext = servletContext;
    }

}
