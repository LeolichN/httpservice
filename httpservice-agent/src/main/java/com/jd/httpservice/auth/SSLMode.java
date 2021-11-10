package com.jd.httpservice.auth;

/**
 * @description: SSL认证模式
 * @author: imuge
 * @date: 2021/11/10
 **/
public enum SSLMode {

    // 关闭，忽略证书
    OFF,
    // 单向认证
    ON_WAY,
    // 双向认证
    TWO_WAY

}
