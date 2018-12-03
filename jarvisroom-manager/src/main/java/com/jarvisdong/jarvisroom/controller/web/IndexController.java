//package com.jarvisdong.jarvisroom.controller.web;
//
//import com.jarvisdong.jarvisroom.config.Response;
//import com.jarvisdong.jarvisroom.controller.BaseController;
//import com.jarvisdong.jarvisroom.util.Constants;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping("/web")
//public class IndexController extends BaseController {
//
//    @RequestMapping(value = "/index")
//    public String index(HttpServletRequest request) {
//        logger.info("用户app登录接口开始");
//        return Constants.webPageName.PAGE_NAME_USER_INDEX;
////        try {
//////            ResponseEntity<Object> response = userService.appUserLogin(appLoginUserForm);
////            return response;
////        } catch (Exception e){
////            logger.info("调用登录接口出错:{}", e.getMessage());
////            return Response.serverError(SERVER_ERROR_MESSAGE);
////        }
//    }
//}
