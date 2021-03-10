drop table student;

create table student(
	sno number constraint student_sno_p primary key,
	name varchar2(20) not null,
	department varchar2(30) not null,
	id varchar2(20) not null,
	grade number not null
);

create sequence s_student;