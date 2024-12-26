-- 创建库
create database if not exists light_interview;

-- 切换库
use light_interview;

-- 用户表
create table if not exists user
(
    id            bigint auto_increment comment 'id' primary key,
    user_account  varchar(256)                           not null comment '账号',
    user_password varchar(512)                           not null comment '密码',
    union_id      varchar(256)                           null comment '微信开放平台id',
    mp_open_id    varchar(256)                           null comment '公众号openId',
    user_name     varchar(256)                           null comment '用户昵称',
    user_avatar   varchar(1024)                          null comment '用户头像',
    user_profile  varchar(512)                           null comment '用户简介',
    share_code    varchar(20)  DEFAULT NULL COMMENT '分享码',
    invite_user   bigint       DEFAULT NULL COMMENT '邀请用户 id',
    user_role     varchar(256) default 'user'            not null comment '用户角色：user/admin/ban',
    edit_time     datetime     default CURRENT_TIMESTAMP not null comment '编辑时间',
    create_time   datetime     default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time   datetime     default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted       tinyint      default 0                 not null comment '是否删除',
    index idx_union_id (union_id)
) comment '用户' collate = utf8mb4_unicode_ci;


-- 题库表
create table if not exists question_bank
(
    id             bigint auto_increment comment 'id' primary key,
    title          varchar(256)                       null comment '标题',
    description    text                               null comment '描述',
    picture        varchar(2048)                      null comment '图片',
    user_id        bigint                             not null comment '创建用户 id',
    review_status  int      default 0                 not null comment '状态：0-待审核, 1-通过, 2-拒绝',
    review_message varchar(512)                       null comment '审核信息',
    reviewer_id    bigint                             null comment '审核人 id',
    review_time    datetime                           null comment '审核时间',
    priority       int      default 0                 not null comment '优先级',
    view_num       int      default 0                 not null comment '浏览量',
    edit_time      datetime default CURRENT_TIMESTAMP not null comment '编辑时间',
    create_time    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted        tinyint  default 0                 not null comment '是否删除',
    index idx_title (title)
) comment '题库' collate = utf8mb4_unicode_ci;

-- 题库浏览记录表
create table if not exists question_browsing_history
(
    id          bigint auto_increment comment 'id' primary key,
    question_id bigint                             not null comment '题目id',
    user_id     bigint                             not null comment '浏览用户 id',
    create_time datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted     tinyint  default 0                 not null comment '是否删除',
    index idx_question (question_id)
) comment '题库浏览记录' collate = utf8mb4_unicode_ci;

-- 题目表
create table if not exists question
(
    id             bigint auto_increment comment 'id' primary key,
    title          varchar(256)                       null comment '标题',
    content        text                               null comment '内容',
    tags           varchar(1024)                      null comment '标签列表（json 数组）',
    answer         text                               null comment '推荐答案',
    user_id        bigint                             not null comment '创建用户 id',
    review_status  int      default 0                 not null comment '状态：0-待审核, 1-通过, 2-拒绝',
    review_message varchar(512)                       null comment '审核信息',
    reviewer_id    bigint                             null comment '审核人 id',
    review_time    datetime                           null comment '审核时间',
    view_num       int      default 0                 not null comment '浏览量',
    thumb_num      int      default 0                 not null comment '点赞数',
    favour_num     int      default 0                 not null comment '收藏数',
    priority       int      default 0                 not null comment '优先级',
    source         varchar(512)                       null comment '题目来源',
    edit_time      datetime default CURRENT_TIMESTAMP not null comment '编辑时间',
    create_time    datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time    datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    deleted        tinyint  default 0                 not null comment '是否删除',
    index idx_title (title),
    index idx_userId (user_id)
) comment '题目' collate = utf8mb4_unicode_ci;

-- 题库题目关系表（硬删除）
create table if not exists question_bank_rel_question
(
    id               bigint auto_increment comment 'id' primary key,
    question_bank_id bigint                             not null comment '题库 id',
    question_id      bigint                             not null comment '题目 id',
    user_id          bigint                             not null comment '创建用户 id',
    question_order   int      default 0                 not null comment '题目顺序（题号）',
    create_time      datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    update_time      datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    UNIQUE (question_bank_id, question_id)
) comment '题库题目关系表' collate = utf8mb4_unicode_ci;