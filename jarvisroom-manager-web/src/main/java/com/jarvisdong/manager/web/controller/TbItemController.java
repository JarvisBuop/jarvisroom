package com.jarvisdong.manager.web.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.kit.utils.LogFormatter;
import com.jarvisdong.manager.web.utils.Constants;
import com.jarvisdong.manager.web.utils.ResponseUtils;
import com.jarvisdong.pojo.BookVo;
import com.jarvisdong.pojo.TbItem;
import com.jarvisdong.pojo.custom.SerialPageTo;
import com.jarvisdong.service.TbItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/tbItem")
public class TbItemController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880")
    private TbItemService tbItemService;

    @RequestMapping(value = "/findAll", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity getAllBooks(@RequestParam(defaultValue = "0") int currentPage) {
        logger.info(LogFormatter.formatInfo("分页demo"));
        try {
            Map<String ,Object> map = new HashMap<>();
            SerialPageTo<TbItem> allTbItemByPage = tbItemService.findAllTbItemByPage(currentPage);
            Page<TbItem> pageResult = new PageImpl<>(allTbItemByPage.getContent(), PageRequest.of(allTbItemByPage.getPage(), allTbItemByPage.getSize()), allTbItemByPage.getTotal());
            map.put("PageList",pageResult);
            return ResponseUtils.success(map, "ok");
        } catch (Exception e) {
            logger.info(LogFormatter.formatError("分页demo", e));
            return ResponseUtils.serverError(Constants.SERVER_ERROR_MESSAGE);
        }
    }

}
