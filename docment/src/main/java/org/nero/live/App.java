package org.nero.live;
/*
分布式直播平台架构文档

0.web页面层（web）
    0.直播平台
    1.管理平台
    2.资源审核管理平台

1.核心service支撑层
    0.用户服务
    1.聊天服务
    2.充值服务
    3.srs服务
    4.礼物服务
    4.队列监听服务

 2.zookeeper注册中心
 3.mysql数据库集群
 4.redis缓存集群

 */
/*
项目架构
包名：org.nero.live

0.公共项目依赖
    common-config
    common-parent
    common-service
    common-facade
    common-web
1.微服务
    user-facade
    user-service

3.web
    web-live
    web-manager
 */