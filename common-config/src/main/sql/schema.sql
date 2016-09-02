CREATE DATABASE IF NOT  EXISTS nero_live;

USE nero_live;
-- 创建会员表
CREATE TABLE IF NOT EXISTS live_user(
  member_id bigint NOT NULL AUTO_INCREMENT COMMENT '会员id',
  member_phone bigint NOT NULL COMMENT '会员手机号',
  member_name VARCHAR (64) NOT NULL COMMENT '会员绑定昵称',
  member_email VARCHAR (64) COMMENT '会员绑定邮箱',
  member_status tinyint NOT NULL  DEFAULT 0 COMMENT '会员状态：0.未绑定手机（未激活），1.绑定手机，2.绑定邮箱，3.实名认证，4.主播，100.冻结',
  member_sex tinyint DEFAULT 0 COMMENT '会员性别：0.秘密，1.男，2.女',
  member_password VARCHAR (64) NOT NULL COMMENT  '会员密码',
  member_token VARCHAR (64) NOT NULL COMMENT '会员密钥',
  member_last_login_time DEFAULT CURRENT_TIMESTAMP DATETIME COMMENT '上一次上线时间',
  member_create_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '会员注册时间',
  PRIMARY KEY (member_id),
  INDEX index_member_name('member_name')
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='会员表';
-- 添加索引，优化慢检索
ALTER TABLE live_user ADD INDEX index_member_name (member_name);