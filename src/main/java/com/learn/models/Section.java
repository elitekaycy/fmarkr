package com.learn.models;

/**
 * Section
 */
public class Section {

  private String info;
  private String description;

  public Section(String info, String description) {
    this.info = info;
    this.description = description;
  }

  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
 
}
