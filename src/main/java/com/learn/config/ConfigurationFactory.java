package com.learn.config;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;
import jakarta.servlet.ServletContext;

public class ConfigurationFactory {

public static Configuration getConfiguration(ServletContext servletContext) {
    Configuration cfg = new Configuration(Configuration.VERSION_2_3_33);
    cfg.setServletContextForTemplateLoading(servletContext, "/WEB-INF/templates");

    cfg.setDefaultEncoding("UTF-8");
    cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
    return cfg;
}

}
