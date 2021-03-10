create table board(
no number(4) not null,
writer varchar2(100) not null,
title varchar2(300) not null,
content varchar2(3000) not null,
writeDate date,
hit number(10)
);

insert into board values (2, '둘리', '공지', '내용', sysdate, 0);