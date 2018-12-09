//package com.jarvisdong.jarvisroom.interceptor;
//
//import com.jarvisdong.jarvisroom.thirdparty.redis.RedisBaseOperation;
//import com.jarvisdong.jarvisroom.thirdparty.redis.entity.TokenCache;
//import com.jarvisdong.kit.utils.IpUtil;
//import com.jarvisdong.jarvisroom.vo.UserInfoVo;
//import com.mysql.cj.util.StringUtils;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.PrintWriter;
//
///**
// *
// * ClassName: 拦截器处理
// * Function: 请求头拦截器,获取指定请求头,并进行预处理
// * date: 2017年5月3日 下午3:05:44
// *
// * @author zhao rui
// * @version
// */
//@Component
//public class HeaderHttpRequestInterceptor implements HandlerInterceptor {
//    private final static Logger logger = LoggerFactory.getLogger(HeaderHttpRequestInterceptor.class);
//
//    @Autowired
//    private RedisBaseOperation<TokenCache> redisBaseOperation;
////    @Autowired
////    private UserService userService;
////    @Autowired
////    private ReportService reportService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//    	logger.info("----------app start----------");
//    	//获取访问的IP
//    	String ip = IpUtil.getIpAddress(request);
//    	logger.info("App用户IP:{}", ip);
//        long startTime = System.currentTimeMillis();
//        request.setAttribute("requestStartTime", startTime);
//        String appToken = request.getHeader("app-token");
//        //app登录
//        if(!StringUtils.isNullOrEmpty(appToken)){
//        	logger.info("App请求头拦截器:{}",appToken);
//        	TokenCache tokenCache = redisBaseOperation.get(appToken);
////        	if(tokenCache != null){
////        		UserInfoVo userInfoVo = tokenCache.getUserInfoVo();
////        		//查询app-token是不是有效
////        		if(userService.checkAppLoginUserIsValid(appToken)) {
////        			request.setAttribute("app-user", userInfoVo);
////            		logger.info("appToken验证成功");
////            		reportService.updateReportUserOperation(userInfoVo.getUserId());
////            		return true;
////        		}
////        	}
//        	logger.info("AppToken验证失败，身份不合法");
//        	//设置返回状态码
//        	response.setStatus(HttpStatus.FORBIDDEN.value());
//        	this.setResponseMessage(response, "{\"code\":403,\"msg\":\"对不起,您认证失败，请重新登录！\"}");
//        	return false;
//        }
//        logger.info("AppToken验证失败，身份不合法");
//    	//设置返回状态码
//        response.setStatus(HttpStatus.FORBIDDEN.value());
//        this.setResponseMessage(response, "{\"code\":403,\"msg\":\"对不起，你的身份不合法，请重新登录！\"}");
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//    	long startTime = (Long) request.getAttribute("requestStartTime");
//        long endTime = System.currentTimeMillis();
//        long executeTime = endTime - startTime;
//        logger.info("----------app end spend:{}ms----------", executeTime);
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//
//    }
//
//    /**
//     * response传回信息设置
//     * @author Murphy.Chang
//     * @param response
//     * @param message
//     */
//    private HttpServletResponse setResponseMessage(HttpServletResponse response, String message){
//    	response.setContentType("application/json;charset=utf-8");
//    	response.setCharacterEncoding("UTF-8");
//    	PrintWriter pw = null;
//    	try {
//			pw = response.getWriter();
//			pw.write(message);
//		} catch (Exception e) {
//			logger.info("App拦截器response信息写入出错");
//		}finally{
//			if(pw != null){
//				pw.close();
//			}
//		}
//    	return response;
//    }
//}