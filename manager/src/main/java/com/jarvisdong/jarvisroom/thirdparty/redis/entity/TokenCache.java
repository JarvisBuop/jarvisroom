package com.jarvisdong.jarvisroom.thirdparty.redis.entity;


import com.jarvisdong.jarvisroom.vo.UserInfoVo;

import java.io.Serializable;

/**
 * 
 * ClassName: TokenCache
 * Function: TODO APP凭证缓存,用于在redis中进行缓存存储
 * date: 2017年5月26日 下午9:05:41
 *
 * @author zhao rui
 * @version
 */
public class TokenCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5366290992053803074L;
	
	private String token;          //  设备token
	private UserInfoVo userInfoVo; //  登录用户信息
	
	public TokenCache(String token, UserInfoVo userInfoVo){
		this.token = token;
		this.userInfoVo = userInfoVo;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

	public UserInfoVo getUserInfoVo() {
		return userInfoVo;
	}

	public void setUserInfoVo(UserInfoVo userInfoVo) {
		this.userInfoVo = userInfoVo;
	}
}
