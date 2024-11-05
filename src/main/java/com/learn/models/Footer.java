package com.learn.models;

/**
 * Footer
 */
public class Footer {

 
  private String text;
  private String author;
  private String organization;

  public Footer(String organization, String text, String author) {
    this.organization = organization;
    this.text = text;
    this.author = author;
  }

  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }
  public String getAuthor() {
    return author;
  }
  public void setAuthor(String author) {
    this.author = author;
  }
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }
 
}
