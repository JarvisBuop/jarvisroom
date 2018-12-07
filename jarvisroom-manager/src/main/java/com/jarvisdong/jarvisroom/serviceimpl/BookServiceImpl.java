package com.jarvisdong.jarvisroom.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jarvisdong.pojo.BookVo;
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
    private List<BookVo> mList = new ArrayList<BookVo>(){
        {
            add(new BookVo(0l,"my book1","jarvis","good book1"));
            add(new BookVo(1l,"my book2","dong","good book2"));
        }
    };

    @Override
    public List<BookVo> findAll() {
        return mList;
    }

    @Override
    public BookVo insertByBook(BookVo bookVo) {
        return null;
    }

    @Override
    public BookVo update(BookVo bookVo) {
        return null;
    }

    @Override
    public BookVo delete(Long id) {
        return null;
    }

    @Override
    public BookVo findById(Long id) {
        return null;
    }
}
