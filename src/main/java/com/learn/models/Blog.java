package com.learn.models;

import java.util.List;

public class Blog {

  private String title;
  private String author;
  private String createdAt;
  private List<Section> sections;
  private Footer footer;

  public Blog(List<Section> sections, String title, String author, String createdAt, Footer footer) {
    this.sections = sections;
    this.title = title;
    this.author = author;
    this.createdAt = createdAt;
    this.footer = footer;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public Footer getFooter() {
    return footer;
  }
  public void setFooter(Footer footer) {
    this.footer = footer;
  }
  public List<Section> getSections() {
    return sections;
  }
  public void setSections(List<Section> sections) {
    this.sections = sections;
  }
  
}
