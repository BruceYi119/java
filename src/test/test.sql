create table board(
	bno NUMBER(4),
	bwriter VARCHAR2(100),
	btitle VARCHAR2(300),
	bcontent VARCHAR2(3000),
	bwriteDate date fault sysdate,
	bhit NUMBER(10)
	);