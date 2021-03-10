*TABLE 생성
CREATE TABLE 테이블명(
	컬럼명	타입(크기),
	컬럼명	타입(크기) [제약조건],
	컬럼명	타입(크기) [CONSTRAINT 제약조건명	제약조건],
	컬럼명	타입(크기) [CONSTRAINT 제약조건명	제약조건 DEFAULT 기본값]
);


select * from DEPT;
WHERE deptno=90;

--90부서 삭제
DELETE FROM DEPT
WHERE deptno=91;

--90부서의 지역을 독도로 수정
UPDATE DEPT
SET    loc='독도'
WHERE deptno=90;



--DEPT테이블에  90,IT,서울 입력
INSERT INTO DEPT
VALUES(90,'IT','서울');

--sequence생성
CREATE SEQUENCE eno_seq
START WITH 8000
INCREMENT BY 1
MAXVALUE  9999
NOCYCLE;

--sequence사용   시퀀스명.nextval
INSERT INTO  EMP(empno,ename,sal,hiredate)
VALUES( eno_seq.nextval,'홍1',3000,SYSDATE);

SELECT empno,ename,sal,hiredate
FROM   EMP
WHERE  empno>=7900
ORDER  BY empno desc;

UPDATE emp
SET    sal=sal+100
WHERE  EMPNO=8000;

DELETE FROM  EMP  WHERE  EMPNO=8000;


CREATE SEQUENCE 시퀀스명
START WITH 시작값
INCREMENT BY 증감값
MAXVALUE  최대값
MINVALUE  최소값
CYCLE | NOCYCLE






*delete문법
DELETE [FROM] 테이블명
[WHERE 조건]

*update문법
UPDATE 테이블명
SET    컬럼명=새값, 컬럼명=새값...
[WHERE 조건]

*insert문법
INSERT INTO 테이블명
VALUES(값,값,..);

*select문법
SELECT  {* | 컬럼명 [as] 별칭}
FROM		테이블명
[WHERE  조건]
[GROUP  BY 그룹기준]
[HAVING 그룹조건]
[ORDER  BY 정렬기준 정렬방식]
정렬방식 
-오름차순(기본,ASC) : 숫자 작->큰, A->Z, ㄱ->ㅎ, 예전->최근
-내림차순(DESC)












