package com.jarvisdong.manager.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.kit.utils.LogFormatter;
import com.jarvisdong.manager.web.utils.Constants;
import com.jarvisdong.pojo.BookVo;
import com.jarvisdong.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String getAllBooks(Model model) {
        logger.info(LogFormatter.formatInfo("全部书籍"));
        try {
            List<BookVo> all = bookService.findAll();
            model.addAttribute("bookLists", all);
            return Constants.WebPageAddr.WEB_NAME_BOOK;
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("全部书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }

    /**
     * 跳转到页面详情,添加new book
     * @param model
     * @return
     */
    @RequestMapping(value = {"/create"},method = {RequestMethod.GET,RequestMethod.POST})
    public String createBook(Model model){
        logger.info(LogFormatter.formatInfo("创建书籍"));
        try {
            model.addAttribute("book",new BookVo());
            model.addAttribute("action","addBook");
            return Constants.WebPageAddr.WEB_NAME_BOOK_FORM;
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("创建书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }

    @RequestMapping(value = {"/update/{id}","/detail/{id}"},method = {RequestMethod.GET,RequestMethod.POST})
    public String updateBookIntent(Model model,@PathVariable(value = "id") int id){
        logger.info(LogFormatter.formatInfo("跳转更新书籍"));
        try {
            model.addAttribute("book",bookService.findById(id));
            model.addAttribute("action","update");
            return Constants.WebPageAddr.WEB_NAME_BOOK_FORM;
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("跳转更新书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }


    @RequestMapping(value = "/delete/{id}",method = {RequestMethod.GET,RequestMethod.POST})
    public String deleteBook(@PathVariable(value = "id") int id){
        logger.info(LogFormatter.formatInfo("删除书籍"));
        try {
            bookService.delete(id);
            return "redirect:/book/getAllBooks";
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("删除书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }

    @RequestMapping(value = "/update" ,method = {RequestMethod.GET,RequestMethod.POST})
    public String updateBook(BookVo bookVo){
        logger.info(LogFormatter.formatInfo("更新书籍"));
        try {
            bookService.update(bookVo);
            return "redirect:/book/getAllBooks";
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("更新书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }

    @RequestMapping(value = "/addBook",method = {RequestMethod.GET,RequestMethod.POST})
    public String addBook(BookVo bookVo){
        logger.info(LogFormatter.formatInfo("添加书籍"));
        try {
            bookService.insertByBook(bookVo);
            return "redirect:/book/getAllBooks";
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("添加书籍",e));
            return Constants.WebPageCommon.WEB_PAGE_NAME_ERROR;
        }
    }
}
