package com.jarvisdong.jarvisroom.util;

public class Constants {
    //Druid
    public static class druidConfig {
        public static final String USER_NAME = "user";
        public static final String PASSWORD = "jarvisroom"; //经理
    }

    public static class apiRequestPath {
        public static final String API_ALL = "/api/**";
        public static final String USER_LOGIN = "/api/userlogin/appUserLogin";
    }

    public static class webRequestPath {
        public static final String WEB_ALL = "/web/**";
    }

    //Web路径地址
    public static class webPageName {
        public static final String PAGE_NAME_USER_LOGIN = "/user/login";
        public static final String PAGE_NAME_USER_INDEX = "/web/index";
    }
}
