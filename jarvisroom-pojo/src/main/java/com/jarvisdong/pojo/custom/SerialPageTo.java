package com.jarvisdong.pojo.custom;

import java.io.Serializable;
import java.util.List;

/**
 * Created by JarvisDong on 2018/12/8.
 *  用于序列化传递的对象
 *  提供无参构造函数
 */
public class SerialPageTo<T> implements Serializable{
    private int page;
    private int size;
    private long total;
    private long totalPage;
    List<T> content;

    public long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(long totalPage) {
        this.totalPage = totalPage;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public SerialPageTo() {
    }
}
