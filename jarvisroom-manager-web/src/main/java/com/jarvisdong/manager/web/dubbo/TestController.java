package com.jarvisdong.manager.web.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jarvisdong.kit.TbItemService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by JarvisDong on 2018/11/28.
 */
@Controller
public class TestController {
    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://localhost:20880")
    private TbItemService demoService;

    @RequestMapping("/sayHello")
    public ResponseEntity<Object> sayHello() {
        if(demoService==null){
            return new ResponseEntity<Object>("null",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<Object>(demoService.selectAll("22222"),HttpStatus.OK);
    }
}
