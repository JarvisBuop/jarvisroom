//package com.jarvisdong.jarvisroom.config;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import com.jarvisdong.jarvisroom.util.Constants;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.web.servlet.config.annotation.*;
//
//import java.util.List;
//
///**
// *
// * ClassName: WebConfig
// * Function: SpringMVC配置.
// * date: 2017年5月3日 上午11:30:12
// *
// * @author zhao rui
// * @version
// */
//@Configuration
//public class WebConfig extends WebMvcConfigurationSupport {
//
//    /**
//     * xssFilter注册
//     */
//    /*@Bean
//    public FilterRegistrationBean xssFilterRegistration() {
//        XssFilter xssFilter = new XssFilter();
//        //xssFilter.setUrlExclusion(Arrays.asList("/notice/update","/notice/add"));
//        FilterRegistrationBean registration = new FilterRegistrationBean(xssFilter);
//        registration.addUrlPatterns("/*");
//        return registration;
//    }*/
//
////	/**
////	 *
////	 * 注入拦截器.
////	 *
////	 * @author zhao rui
////	 * @return
////	 */
////    @Bean
////    protected HeaderHttpRequestInterceptor headerHttpRequestInterceptor(){
////        return new HeaderHttpRequestInterceptor();
////    }
////
////    /**
////	 *
////	 * Web用户登录拦截器.
////	 *
////	 * @author zhao rui
////	 * @return
////	 */
////    @Bean
////    protected WebLoginHttpRequestInterceptor webLoginHttpRequestInterceptor(){
////        return new WebLoginHttpRequestInterceptor();
////    }
//
//	/**
//     * 配置静态访问资源
//     * @param registry
//     */
//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//    	String[] classPathResourceLocations = {"classpath:/META-INF/resources/",
//									           "classpath:/resources/",
//									           "classpath:/static/",
//									           "classpath:/public/"};
//        registry.addResourceHandler("/**").addResourceLocations(classPathResourceLocations);
//    }
//
//    /**
//     * 配置fastJson
//     * @param converters
//     */
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        converters.add(fastConverter);
//        super.configureMessageConverters(converters);
//    }
//
//    /**
//     * 拦截器
//     * @param registry
//     */
//    @Override
//    protected void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(headerHttpRequestInterceptor())
////                .addPathPatterns(Constants.apiRequestPath.API_ALL)
////                .excludePathPatterns(Constants.apiRequestPath.USER_LOGIN);
////        registry.addInterceptor(webLoginHttpRequestInterceptor())
////                .addPathPatterns(Constants.webRequestPath.WEB_ALL);
//        super.addInterceptors(registry);
//    }
//
//    /**
//     *
//     * 跨域配置.
//     * @see
//     */
//    @Override
//    protected void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedHeaders("Access-Control-Allow-Origin", "*")
//                .allowedMethods("Access-Control-Allow-Methods", "*")
//                .allowedOrigins("*");
//        super.addCorsMappings(registry);
//    }
//
//    /**
//     * 直接访问http://localhost:8080就跳转到login.html页面了
//     *
//     * @param registry
//     */
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addRedirectViewController("/", Constants.webPageName.PAGE_NAME_USER_INDEX);
//        registry.addViewController("/login.html").setViewName(Constants.webPageName.PAGE_NAME_USER_LOGIN);
//        super.addViewControllers(registry);
//    }
//}
