package com.jarvisdong.manager.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.pojo.Book;
import com.jarvisdong.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JarvisDong on 2018/12/4.
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {
    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880")
    private BookService bookService;

    @RequestMapping("/getAllBooks")
    private ResponseEntity<Object> getAllBooks(){
        List<Book> all = bookService.findAll();
        return new ResponseEntity<Object>(all, HttpStatus.OK);
    }
}
