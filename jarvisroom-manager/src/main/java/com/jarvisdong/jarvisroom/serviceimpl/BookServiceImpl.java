package com.jarvisdong.jarvisroom.serviceimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jarvisdong.dao.entity.TBookEntity;
import com.jarvisdong.dao.repository.BookRepository;
import com.jarvisdong.pojo.BookVo;
import com.jarvisdong.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by JarvisDong on 2018/12/4.
 */
@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Transactional
public class BookServiceImpl implements BookService {
    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookVo> findAll() {
        List<TBookEntity> entities = bookRepository.findAll();
        List<BookVo> resultList = new ArrayList<>();
        for (TBookEntity entity : entities) {
            BookVo bookVo = new BookVo();
            BeanUtils.copyProperties(entity, bookVo);
            resultList.add(bookVo);
        }
        return resultList;
    }

    @Override
    public BookVo insertByBook(BookVo bookVo) {
        TBookEntity tBookEntity = new TBookEntity();
        tBookEntity.setName(bookVo.getName());
        tBookEntity.setWriter(bookVo.getWriter());
        tBookEntity.setIntroduction(bookVo.getIntroduction());
        bookRepository.save(tBookEntity);
        return bookVo;
    }

    @Override
    public BookVo update(BookVo bookVo) {
        int id = Integer.valueOf(bookVo.getId());
        TBookEntity tBookEntity = bookRepository.findById(id).get();
        tBookEntity.setName(bookVo.getName());
        tBookEntity.setWriter(bookVo.getWriter());
        tBookEntity.setIntroduction(bookVo.getIntroduction());
        bookRepository.save(tBookEntity);
        entityManager.flush();
        return bookVo;
    }

    @Override
    public BookVo delete(int id) {
        TBookEntity tBookEntity = bookRepository.findById(id).get();
        bookRepository.delete(tBookEntity);
        return null;
    }

    @Override
    public BookVo findById(int id) {
        TBookEntity tBookEntity = bookRepository.findById(id).get();
        BookVo bookVo = new BookVo();
        BeanUtils.copyProperties(tBookEntity,bookVo);
        return bookVo;
    }
}
