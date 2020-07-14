create database if not exists db_pz_crowd_funding;
use db_pz_crowd_funding;
drop table if exists t_admin;
CREATE TABLE t_admin(
    id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    admin_account VARCHAR(64) unique NOT NULL DEFAULT '' COMMENT '管理员账号',
    admin_password VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员登陆密码',
    admin_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员用户名',
    admin_email VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员邮箱',
    create_time TIMESTAMP NOT NULL COMMENT '该条字段创建时间',
    PRIMARY KEY (id)
)  ENGINE=INNODB COMMENT '管理员登陆信息数据表';
drop table if exists t_role;
create Table t_role(
id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
role_name VARCHAR(64) unique NOT NULL DEFAULT '' COMMENT '角色名称',
PRIMARY KEY (id)
)ENGINE=INNODB COMMENT '管理员登陆信息数据表';

drop table if exists t_menu;
create table t_menu (
id   BIGINT not null auto_increment,
pid   BIGINT comment '指向父节点id的字段',
`name`  varchar(64) not null default '' comment '菜单节点名称',
url   varchar(128) comment 'url',
icon  varchar(256) not null default '' comment 'icon',
primary key (id)
)ENGINE=INNODB COMMENT '菜单表';

drop table `t_inner_admin_role`;
CREATE TABLE `db_pz_crowd_funding`.`t_inner_admin_role` (
  `id` BIGINT(16) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `admin_id` BIGINT(16) NOT NULL COMMENT 'admin id',
  `role_id` BIGINT(16) NOT NULL COMMENT 'role id',
  PRIMARY KEY (`id`));

drop table if exists `t_auth`;
CREATE TABLE `t_auth` (
    `auth_id` BIGINT(16) NOT NULL AUTO_INCREMENT comment '主键',
    `auth_name` VARCHAR(64) DEFAULT NULL comment '权限名，英文，用于权限管理比对',
    `auth_title` VARCHAR(64) DEFAULT NULL comment '权限名，中文，在页面上显示',
    `category_id` BIGINT(16) DEFAULT NULL comment '指向本表中这条字段对应的父节点信息',
    PRIMARY KEY (`auth_id`)
);

 
drop table `t_inner_role_auth`;
CREATE TABLE `db_pz_crowd_funding`.`t_inner_role_auth` (
  `id` BIGINT(16) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` BIGINT(16) NOT NULL COMMENT 'role id',
  `auth_id` BIGINT(16) NOT NULL COMMENT 'auth id',
  PRIMARY KEY (`id`));
  
create database db_security;
use db_security;

create table if not exists t_securty_admin(
	id BIGINT NOT NULL AUTO_INCREMENT COMMENT '主键',
    admin_account VARCHAR(64) unique NOT NULL DEFAULT '' COMMENT '管理员账号',
    admin_password VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员登陆密码',
    admin_name VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员用户名',
    admin_email VARCHAR(64) NOT NULL DEFAULT '' COMMENT '管理员邮箱',
    PRIMARY KEY (id)
);


CREATE TABLE IF NOT EXISTS t_member (
    member_id BIGINT(16) NOT NULL AUTO_INCREMENT,
    member_account VARCHAR(64) NOT NULL DEFAULT '',
    member_password VARCHAR(128) NOT NULL DEFAULT '',
    member_username VARCHAR(64),
    member_email VARCHAR(64),
    member_authstatus INT(4) COMMENT '实名认证状态 0 - 未实名认证， 1 - 实名认证申请中， 2 - 已实名认证',
    member_user_type INT(4) COMMENT '0 - 个人， 1 - 企业',
    member_real_name VARCHAR(64),
    member_card_number VARCHAR(64),
    member_account_type INT(4) COMMENT '0 - 企业， 1 - 个体， 2 - 个人， 3 - 政府',
    PRIMARY KEY (member_id)
);
desc t_member;
select * from t_member;
alter table t_member change column member_account member_account VARCHAR(64) unique NOT NULL DEFAULT '';


CREATE TABLE t_project_type (
    type_id BIGINT(16) NOT NULL AUTO_INCREMENT,
    type_name VARCHAR(256) COMMENT '分类名称',
    type_remark VARCHAR(256) COMMENT '分类介绍',
    PRIMARY KEY (type_id)
);

CREATE TABLE t_inner_project_type (
    id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_id BIGINT(16),
    type_id BIGINT(16),
    PRIMARY KEY (id)
);

CREATE TABLE t_project_tag (
    tag_id BIGINT(16) NOT NULL AUTO_INCREMENT,
    tag_pid BIGINT(16),
    tag_name VARCHAR(256),
    PRIMARY KEY (tag_id)
);

CREATE TABLE t_inner_project_tag (
    id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_id BIGINT(16),
    tag_id BIGINT(16),
    PRIMARY KEY (id)
);

CREATE TABLE t_project (
    project_id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_name VARCHAR(256),
    project_description VARCHAR(256),
    project_funding_money BIGINT(16),
    project_funding_day INT(16),
    project_header_img_path VARCHAR(256),
    project_status INT(4) COMMENT '0-即将开始，1-众筹中，2-众筹成功，3-众筹失败',
    project_deploydate TIMESTAMP,
    project_support_money BIGINT(16),
    project_supporter INT(16),
    project_completion INT(4),
    project_member_id BIGINT(16),
    project_createdate TIMESTAMP,
    project_follower INT(16),
    PRIMARY KEY (project_id)
);

CREATE TABLE t_project_detailed_img (
    img_id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_id BIGINT(16),
    img_path VARCHAR(256),
    PRIMARY KEY (img_id)
);

CREATE TABLE t_project_launch_member_info (
    id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_id BIGINT(16),
    member_id BIGINT(16),
    member_self_description_simple VARCHAR(256),
    member_self_description_detail VARCHAR(256),
    member_phone_number VARCHAR(256),
    service_phone_num VARCHAR(256),
    PRIMARY KEY (id)
);

CREATE TABLE t_project_return_info (
    id BIGINT(16) NOT NULL AUTO_INCREMENT,
    project_id BIGINT(16),
    return_type INT(4) COMMENT '0 - 实物回报， 1 虚拟物品回报',
    support_money BIGINT(16),
    return_content VARCHAR(256) COMMENT '回报内容',
    count INT(16) COMMENT '回报产品限额，“0”为不限回报数量',
    signal_purchase INT(16) COMMENT '是否设置单笔限购 0-限购，1-不限购',
    purchase INT(16) COMMENT '具体限购数量',
    freight INT(16) COMMENT '运费，“0”为包邮',
    invoice INT(4) COMMENT '0 - 不开发票， 1 - 开发票',
    returndate INT(16) COMMENT '项目结束后多少天向支持者发送回报',
    describ_pic_path VARCHAR(256) COMMENT '说明图片路径',
    PRIMARY KEY (id)
);

CREATE TABLE t_project_launch_member_confirm_info (
    id BIGINT(16) NOT NULL AUTO_INCREMENT,
    member_id BIGINT(16),
    member_pay_num VARCHAR(256) COMMENT '易付宝企业账号',
    member_card_num VARCHAR(256) COMMENT '法人身份证号',
    PRIMARY KEY (id)
);


