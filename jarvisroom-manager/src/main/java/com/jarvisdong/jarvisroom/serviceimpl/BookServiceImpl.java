package com.jarvisdong.jarvisroom.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jarvisdong.pojo.Book;
import com.jarvisdong.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JarvisDong on 2018/12/4.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class BookServiceImpl implements BookService {
    private List<Book> mList = new ArrayList<Book>(){
        {
            add(new Book(0l,"my book1","jarvis","good book1"));
            add(new Book(1l,"my book2","dong","good book2"));
        }
    };

    @Override
    public List<Book> findAll() {
        return mList;
    }

    @Override
    public Book insertByBook(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book delete(Long id) {
        return null;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }
}
