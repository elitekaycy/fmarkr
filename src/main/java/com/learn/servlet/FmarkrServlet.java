package com.learn.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.learn.config.ConfigurationFactory;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FmarkrServlet extends HttpServlet {
  private Configuration cfg;

  @Override
  public void init() {
    cfg = ConfigurationFactory.getConfiguration(getServletContext());
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
          throws ServletException, IOException {

      Map<String, Object> data = new HashMap<>();
      data.put("message", "Welcome to FreeMaker!");
      Template template = cfg.getTemplate("home.ftl");
      response.setContentType("text/html");

      try {
          template.process(data, response.getWriter());
      } catch (TemplateException e) {
          throw new ServletException(e);
      }
  }
}
