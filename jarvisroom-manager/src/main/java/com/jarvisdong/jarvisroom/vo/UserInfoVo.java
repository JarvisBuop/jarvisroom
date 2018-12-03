package com.jarvisdong.jarvisroom.vo;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * ClassName: UserInfoVo
 * Function: TODO ADD FUNCTION.
 * date: 2017年7月5日 上午10:50:46
 *
 * @author zhao rui
 * @version
 */
public class UserInfoVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3907506179985314327L;
	private Integer userId;
	private String mobile;
	private String password;
    private String loginToken;
    private String tokenExprieTime;
    private String lastLoginTime;
    private String userName;
    private String idcard;
    private String sex;
    private String email;
    private String qq;
    private String weChat;
    private String avatarImgUrl;
    private String signImgUrl;
    private String idcardImgRrl1; //身份证扫描件图片1
    private String idcardImgRrl2; //身份证扫描件图片2
    private String address;
    private int status;
    private String remark;
    private String loginTime;
    private int UserLoginType; //用户登录类型 1.app 2.web
    private int isApprProjectSecondPlan;  //是否能审批项目二级进度权限(0:无权限 1:有权限)
    private int isSubcontractCompanyUser; //是否为分包公司用户(0:否 1:是)

	public Integer getUserId() {
		return userId;
	}
	public String getMobile() {
		return mobile;
	}
	public String getPassword() {
		return password;
	}
	public String getLoginToken() {
		return loginToken;
	}
	public String getTokenExprieTime() {
		return tokenExprieTime;
	}
	public String getLastLoginTime() {
		return lastLoginTime;
	}
	public String getUserName() {
		return userName;
	}
	public String getIdcard() {
		return idcard;
	}
	public String getSex() {
		return sex;
	}
	public String getEmail() {
		return email;
	}
	public String getQq() {
		return qq;
	}
	public String getWeChat() {
		return weChat;
	}
	public String getAvatarImgUrl() {
		return avatarImgUrl;
	}
	public String getSignImgUrl() {
		return signImgUrl;
	}
	public String getIdcardImgRrl1() {
		return idcardImgRrl1;
	}
	public String getIdcardImgRrl2() {
		return idcardImgRrl2;
	}
	public String getAddress() {
		return address;
	}
	public int getStatus() {
		return status;
	}
	public String getRemark() {
		return remark;
	}
	public String getLoginTime() {
		return loginTime;
	}
	public int getUserLoginType() {
		return UserLoginType;
	}
	public int getIsApprProjectSecondPlan() {
		return isApprProjectSecondPlan;
	}
	public int getIsSubcontractCompanyUser() {
		return isSubcontractCompanyUser;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}
	public void setTokenExprieTime(String tokenExprieTime) {
		this.tokenExprieTime = tokenExprieTime;
	}
	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}
	public void setAvatarImgUrl(String avatarImgUrl) {
		this.avatarImgUrl = avatarImgUrl;
	}
	public void setSignImgUrl(String signImgUrl) {
		this.signImgUrl = signImgUrl;
	}
	public void setIdcardImgRrl1(String idcardImgRrl1) {
		this.idcardImgRrl1 = idcardImgRrl1;
	}
	public void setIdcardImgRrl2(String idcardImgRrl2) {
		this.idcardImgRrl2 = idcardImgRrl2;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public void setLoginTime(String loginTime) {
		this.loginTime = loginTime;
	}
	public void setUserLoginType(int userLoginType) {
		UserLoginType = userLoginType;
	}
	public void setIsApprProjectSecondPlan(int isApprProjectSecondPlan) {
		this.isApprProjectSecondPlan = isApprProjectSecondPlan;
	}
	public void setIsSubcontractCompanyUser(int isSubcontractCompanyUser) {
		this.isSubcontractCompanyUser = isSubcontractCompanyUser;
	}
}
