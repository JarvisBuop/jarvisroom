package com.jarvisdong.kit.utils;

public class LogFormatter {

    public static String formatInfo(String input) {
        return "查看" + input + "接口开始";
    }

    public static String formatError(String input, Throwable e) {
        return "查看" + input + "接口出错:{}" + e.getMessage();
    }
}
