package com.jarvisdong.manager.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.manager.web.utils.Constants;
import com.jarvisdong.pojo.Book;
import com.jarvisdong.service.BookService;
import org.apache.http.protocol.HTTP;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by JarvisDong on 2018/12/4.
 */
@Controller
@RequestMapping(value = "/book")
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880")
    private BookService bookService;

    @RequestMapping(value = "/getAllBooks", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<Object> getAllBooks(Model model) {
        logger.info("查看APP页面权限接口开始");
        try {
            List<Book> all = bookService.findAll();
            model.addAttribute("bookLists", all);
//            return Constants.WebPageAddr.WEB_NAME_BOOK;
//            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
//            return "bookList";
        } catch (Exception e) {
            logger.info("查看APP页面权限接口出错:{}", e.getMessage());
//            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
        return new ResponseEntity<Object>("kkkk", HttpStatus.OK);
    }
}
