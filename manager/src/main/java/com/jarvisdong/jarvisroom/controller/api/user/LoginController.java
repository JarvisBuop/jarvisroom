package com.jarvisdong.jarvisroom.controller.api.user;

import com.jarvisdong.jarvisroom.config.Response;
import com.jarvisdong.jarvisroom.controller.BaseController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/api/userlogin")
public class LoginController extends BaseController {

    @RequestMapping(value = "/appUserLogin", method = RequestMethod.POST)
    public ResponseEntity<Object> appUserLogin(HttpServletRequest request) {
        logger.info("用户app登录接口开始");
        return Response.serverError("22");
//        try {
////            ResponseEntity<Object> response = userService.appUserLogin(appLoginUserForm);
//            return response;
//        } catch (Exception e){
//            logger.info("调用登录接口出错:{}", e.getMessage());
//            return Response.serverError(SERVER_ERROR_MESSAGE);
//        }
    }
}
