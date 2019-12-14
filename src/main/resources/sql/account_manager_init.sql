drop table if exists account_manager;
create table account_manager (
id int not null auto_increment,
int int not null comment 'ID',
user_id int not null comment '用户id',
avail_balance decimal(10,2) not null comment '可用余额',
frozen_blance decimal(10,2) not null comment '冻结余额',
account_type int not null comment '账户类型',
coin_type int not null comment '币种类型',
create_time timestamp not null comment '创建时间',
create_time timestamp not null default current_timestamp comment '创建时间',
update_time timestamp not null default current_timestamp on update current_timestamp comment '修改时间',
primary key (id)
)