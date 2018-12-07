package com.jarvisdong.service;


import com.jarvisdong.pojo.BookVo;

import java.util.List;

/**
 * Created by JarvisDong on 2018/12/4.
 */
public interface BookService {
    /**
     * 获取所有 BookVo
     */
    List<BookVo> findAll();

    /**
     * 新增 BookVo
     *
     * @param bookVo {@link BookVo}
     */
    BookVo insertByBook(BookVo bookVo);

    /**
     * 更新 BookVo
     *
     * @param bookVo {@link BookVo}
     */
    BookVo update(BookVo bookVo);

    /**
     * 删除 BookVo
     *
     * @param id 编号
     */
    BookVo delete(Long id);

    /**
     * 获取 BookVo
     *
     * @param id 编号
     */
    BookVo findById(Long id);
}
