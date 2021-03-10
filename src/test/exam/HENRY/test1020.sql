CREATE TABLE board (
no number(4) constraint board_no_p primary key,
writer varchar2(100) constraint board_writer_n not null,
title varchar2(300) constraint board_title_n not null,
content varchar2(3000) constraint board_content_n not null,
writeDate date,
hit number(10)
);

select no,writer,title,content,writeDate,hit from board;