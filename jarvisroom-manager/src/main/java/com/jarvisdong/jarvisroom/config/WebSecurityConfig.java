//package com.jarvisdong.jarvisroom.config;
//
//import com.handsure.zjbi.security.filter.CustomUsernamePasswordAuthenticationFilter;
//import com.handsure.zjbi.security.service.CustomAccessDecisionManager;
//import com.handsure.zjbi.security.service.CustomJdbcTokenRepositoryImpl;
//import com.handsure.zjbi.security.service.CustomUserService;
//import com.handsure.zjbi.security.success.CustomSuccessHandler;
//import org.apache.tomcat.jdbc.pool.DataSource;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.session.SessionRegistry;
//import org.springframework.security.core.session.SessionRegistryImpl;
//import org.springframework.security.web.authentication.AuthenticationFailureHandler;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
//import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
//import org.springframework.security.web.authentication.rememberme.PersistentTokenBasedRememberMeServices;
//import org.springframework.security.web.authentication.session.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * spring-security配置
// * @author Murphy.Chang
// *
// */
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//	/**
//     * springsecurity配置
//     * @author Murphy.Chang
//     * @return
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//    	http.authorizeRequests()//拦截页面
//	        .anyRequest().authenticated();//全部页面都要验证
//
//    	http.authorizeRequests()
//			.accessDecisionManager(customAccessDecisionManager());//使用自定义授权管理器
//
//    	//禁用csrf - 使用自定义登录页面
//    	http.csrf().disable();
//
//    	//使用自定义用户名密码过滤器
//    	http.addFilterAt(customUsernamePasswordAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
//
//    	//登录的相应设置
//    	http.formLogin()
//    	 	.loginPage("/login.html")
//    	 	.loginProcessingUrl("/login")
//			.permitAll();
//
//    	http.rememberMe()//记住我
//			.rememberMeParameter("remember-me")
//			.authenticationSuccessHandler(authenticationSuccessHandler())
//			.key("zjbi")
//			.rememberMeServices(persistentTokenBasedRememberMeServices())
//			.tokenRepository(customJdbcTokenRepositoryImpl())
//			.tokenValiditySeconds(1000*60*60*24*7);
//
//    	//注销的相应设置
//		http.logout()
//			.logoutUrl("/logout")
//			.logoutSuccessHandler(logoutSuccessHandler())
//			.deleteCookies("remeber-me")
//			.permitAll();
//
//		http.sessionManagement()//Session管理器
//			.sessionFixation()
//			.changeSessionId()
//	        .invalidSessionUrl("/login.html?invalid")//Session失效
//	        .maximumSessions(1)//只能同时一个人在线
//	        .sessionRegistry(sessionRegistry())
//	        .expiredUrl("/login.html?expired");
//
//		http.exceptionHandling()//权限验证失败进入的页面（只对使用自定义拦截有效）
//			.accessDeniedPage("/web/common/error403");
//
//	    http.headers()//允许同源iframe访问
//	        .frameOptions()
//	        .sameOrigin();
//    }
//
//    /**
//     * Web层面的拦截，用来跳过的资源
//     * @author Murphy.Chang
//     * @return
//     */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//    	//静态资源
//    	web.ignoring().antMatchers("/static/**");//静态资源
//    	web.ignoring().antMatchers("/login.html");//登录页面
//    }
//
//    /**
//     * 用户认证管理器
//     * @author Murphy.Chang
//     * @return
//     */
//    @Autowired
//    protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////    	auth.userDetailsService(customUserService()).passwordEncoder(new ShaPasswordEncoder());
//    }
//
//}
