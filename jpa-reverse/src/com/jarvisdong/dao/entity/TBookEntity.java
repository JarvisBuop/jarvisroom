package com.jarvisdong.dao.entity;

import javax.persistence.*;

/**
 * Created by JarvisDong on 2018/12/7.
 */
@Entity
@Table(name = "t_book", schema = "jarvisroom", catalog = "")
public class TBookEntity {
    private int id;
    private String name;
    private String writer;
    private String introduction;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "writer", nullable = true, length = 255)
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Basic
    @Column(name = "introduction", nullable = true, length = 255)
    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TBookEntity that = (TBookEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (writer != null ? !writer.equals(that.writer) : that.writer != null) return false;
        if (introduction != null ? !introduction.equals(that.introduction) : that.introduction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + (introduction != null ? introduction.hashCode() : 0);
        return result;
    }
}
