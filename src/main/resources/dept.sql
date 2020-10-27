create table if not exists s_dept(
dept_no int(3) unsigned zerofill primary key auto_increment,
dept_name varchar(32) not null,
is_valid char(2) not null
)engine = innodb default charset = utf8;