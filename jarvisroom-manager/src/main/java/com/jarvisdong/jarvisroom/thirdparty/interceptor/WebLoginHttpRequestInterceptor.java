//package com.jarvisdong.jarvisroom.thirdparty.interceptor;
//
//import com.jarvisdong.kit.utils.IpUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * ClassName: Web登录拦截器处理
// *
// * date: 2017年5月3日 下午3:05:44
// *
// * @author zhao rui
// * @version
// */
//@Component
//public class WebLoginHttpRequestInterceptor implements HandlerInterceptor {
//    private final static Logger logger = LoggerFactory.getLogger(WebLoginHttpRequestInterceptor.class);
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//    	logger.info("----------WEB_START----------");
//    	//获取访问的IP
//    	String ip = IpUtil.getIpAddress(request);
//    	logger.info("WEB_USER_IP:{}", ip);
//        long startTime = System.currentTimeMillis();
//        request.setAttribute("requestStartTime", startTime);
//        String basePath = String.format("%s://%s:%s", request.getScheme(), request.getServerName(), request.getServerPort());
//        request.setAttribute("basePath", basePath);
//        //logger.info("SESSION_MAX:{}", request.getSession().getMaxInactiveInterval());
//
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//    	long startTime = (Long) request.getAttribute("requestStartTime");
//        long endTime = System.currentTimeMillis();
//        long executeTime = endTime - startTime;
//        logger.info("----------WEB_END, SPEND:{}ms----------", executeTime);
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//}