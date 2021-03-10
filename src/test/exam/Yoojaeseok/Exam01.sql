*TABLE 생성
create table board(
	no number(4) constraint board_no_p primary key,
	writer varchar2(100) constraint board_writer_n not null,
	title varchar2(300) constraint board_title_n not null,
	content varchar2(3000) constraint board_content_n not null,
	writeDate date DEFAULT sysdate,
	hit number	DEFAULT '0'
	);
	
	SELECT * FROM BOARD;
	
CREATE SEQUENCE no_seq
START WITH 0001
INCREMENT BY 1
MAXVALUE  9999
NOCYCLE;

	--board테이블에  90,IT,서울 입력
INSERT INTO  BOARD(no,writer,title,content,writeDate)
VALUES( no_seq.nextval,'유재석','title','abcdefg',SYSDATE );