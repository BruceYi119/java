--회원테이블삭제
DROP TABLE MEMBER;

--회원테이블 
CREATE TABLE MEMBER( 
	mno			number(5)		CONSTRAINT member_mno_pk	primary key, /*회원번호*/
	mname		varchar2(30), /*이름*/
	mid			varchar2(20), /*id*/
	mpwd		varchar2(20), /*비번*/
	mdate		date DEFAULT SYSDATE /*회원가입일*/
);

--INSERT INTO member VALUES(mno,mname,mid,mpwd,mdate);
INSERT INTO member VALUES(eno_seq.nextval,'홍1','hid','1234',SYSDATE);
INSERT INTO member VALUES(eno_seq.nextval,'홍2','kid','1234',SYSDATE);
INSERT INTO member VALUES(eno_seq.nextval,'홍3','qid','1234',SYSDATE);

UPDATE MEMBER
set    mname='홍new1', mpwd='111'
WHERE  mno=8002;

DELETE FROM MEMBER WHERE  mno=8002;

SELECT mno,mname,mid,mpwd,mdate	 FROM MEMBER;




--테이블생성 문법
CREATE TABLE 테이블명(
	컬럼명	타입(크기),
	컬럼명	타입(크기) [제약조건],
	컬럼명	타입(크기) [CONSTRAINT 제약조건명	제약조건],
	컬럼명	타입(크기) [CONSTRAINT 제약조건명	제약조건 DEFAULT 기본값]
);

