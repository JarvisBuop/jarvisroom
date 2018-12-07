package com.jarvisdong.manager.web.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Function: 响应操作, 用于请求完成后, 对响应数据的操作
 */
public class ResponseUtils {
    private final static String MESSAGE = "msg";//消息名称常量
    private final static String CODE = "code";//状态码名称常量
    public final static String DATA = "data";//数据名称常量

    /**
     * 请求成功,无需返回结果集
     */
    public static <T> ResponseEntity<T> success() {
        return getEntity(null, "success", HttpStatus.NO_CONTENT);
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static <T> ResponseEntity<T> getEntity(T body, String msg, HttpStatus statusCode) {
        MultiValueMap<String, String> headers = new HttpHeaders();
        List<String> contentType = new ArrayList<>();
        contentType.add("application/json;charset=utf-8");
        headers.put("Content-Type", contentType);
        Map<String, Object> data = new HashMap<>();
        if (statusCode == HttpStatus.NO_CONTENT) {
            //因为HTTP状态码如果为204,则不会返回任何数据,所以需要把HTTP状态码更新为200,并使code状态码变为204
            statusCode = HttpStatus.OK;
            data.put(CODE, statusCode);
        } else {
            data.put(CODE, statusCode.value());
        }
        //消息
        if (!StringUtils.isEmpty(msg)) {
            data.put(MESSAGE, msg);
        }
        //内容
        if (body != null) {
            data.put(DATA, body);
        }
        return new ResponseEntity(data, headers, statusCode);
    }

    /**
     * 请求成功,并返回请求结果集
     *
     * @param T 返回到客户端的对象
     * @return Spring mvc ResponseEntity
     */
    public static <T> ResponseEntity<T> success(T T, String msg) {
        return getEntity(T, msg, HttpStatus.OK);
    }

    /**
     * 服务器错误
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static <T> ResponseEntity<T> serverError(String msg) {
        return getEntity(null, msg, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 请求失败,找不到数据
     *
     * @return Spring mvc ResponseEntity
     */
    public static <T> ResponseEntity<T> notFound(String msg) {
        return getEntity(null, msg, HttpStatus.NOT_FOUND);
    }

    /**
     * 鉴权失败
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static <T> ResponseEntity<T> authorityFailed(String msg) {
        return getEntity(null, msg, HttpStatus.FORBIDDEN);
    }

    /**
     * 非法参数
     *
     * @param msg 请求失败的错误信息
     * @return Spring mvc ResponseEntity
     */
    public static <T> ResponseEntity<T> illegalArgument(String msg) {
        return getEntity(null, msg, HttpStatus.NOT_ACCEPTABLE);
    }

    /**
     * Bad Request
     *
     * @param msg
     * @return
     */
    public static <T> ResponseEntity<T> badRequest(String msg) {
        return getEntity(null, msg, HttpStatus.BAD_REQUEST);
    }
}
