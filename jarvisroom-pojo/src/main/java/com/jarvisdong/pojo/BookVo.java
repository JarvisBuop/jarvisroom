package com.jarvisdong.pojo;

import java.io.Serializable;

/**
 * BookVo 实体类
 *
 * Created by bysocket on 30/09/2017.
 */

public class BookVo implements Serializable {

    private static final long serialVersionUID = -6243733009672073347L;
    /**
     * 编号
     */
    private int id=0;

    /**
     * 书名
     */
    private String name;

    /**
     * 作者
     */
    private String writer;

    /**
     * 简介
     */
    private String introduction;

    public BookVo(int id, String name, String writer, String introduction) {
        this.id = id;
        this.name = name;
        this.writer = writer;
        this.introduction = introduction;
    }

    public BookVo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
}
