select * from board;

create table board(
	bno NUMBER(4),
	bwriter VARCHAR2(100),
	btitle VARCHAR2(300),
	bcontent VARCHAR2(3000),
	bwriteDate date default sysdate,
	bhit NUMBER(10)
	);
	
insert into board  values(1,'작성자','제목','내용',sysdate,1);	