package com.jarvisdong.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by JarvisDong on 2018/12/7.
 */
@Entity
@Table(name = "tb_item_param", schema = "jarvisroom", catalog = "")
public class TbItemParamEntity {
    private long id;
    private Long itemCatId;
    private String paramData;
    private Timestamp created;
    private Timestamp updated;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "item_cat_id", nullable = true)
    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    @Basic
    @Column(name = "param_data", nullable = true, length = -1)
    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "updated", nullable = true)
    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbItemParamEntity that = (TbItemParamEntity) o;

        if (id != that.id) return false;
        if (itemCatId != null ? !itemCatId.equals(that.itemCatId) : that.itemCatId != null) return false;
        if (paramData != null ? !paramData.equals(that.paramData) : that.paramData != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (itemCatId != null ? itemCatId.hashCode() : 0);
        result = 31 * result + (paramData != null ? paramData.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
