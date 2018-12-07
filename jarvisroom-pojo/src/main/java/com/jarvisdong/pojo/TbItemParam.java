package com.jarvisdong.pojo;


import java.io.Serializable;

public class TbItemParam implements Serializable {

  private long id;
  private long itemCatId;
  private String paramData;
  private java.sql.Timestamp created;
  private java.sql.Timestamp updated;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getItemCatId() {
    return itemCatId;
  }

  public void setItemCatId(long itemCatId) {
    this.itemCatId = itemCatId;
  }


  public String getParamData() {
    return paramData;
  }

  public void setParamData(String paramData) {
    this.paramData = paramData;
  }


  public java.sql.Timestamp getCreated() {
    return created;
  }

  public void setCreated(java.sql.Timestamp created) {
    this.created = created;
  }


  public java.sql.Timestamp getUpdated() {
    return updated;
  }

  public void setUpdated(java.sql.Timestamp updated) {
    this.updated = updated;
  }

}
