package com.jarvisdong.manager.web.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.kit.TbItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by JarvisDong on 2018/11/28.
 */
@Controller
public class TestController {

    @Reference(version = "1.0.0",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880")
    private TbItemService demoService;

    @RequestMapping("/sayHello")
    public String sayHello() {
        if(demoService==null){
            return "null";
        }
        return demoService.selectAll("22222");
    }
}
