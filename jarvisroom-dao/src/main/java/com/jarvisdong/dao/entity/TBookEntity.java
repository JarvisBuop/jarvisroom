package com.jarvisdong.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "t_book", schema = "jarvisroom", catalog = "")
public class TBookEntity {
    private int id;
    private String name;
    private String writer;
    private String introduction;

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(writer, that.writer) &&
                Objects.equals(introduction, that.introduction);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, writer, introduction);
    }
}
