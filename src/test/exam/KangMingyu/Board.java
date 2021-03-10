package test.exam.KangMinGyu;

import java.util.Date;

/*
create table board(
no number(4) constraint  board_no_p primary key, --not null 기본키 포함
writer varchar2(100) not null,
title varchar2(300) not null,
content varchar2(3000) not null,
writeDate Date,
hit number(10)
); 
*/

public class Board {
	
	int no;
	String writer;
	String title;
	String content;
	Date writeDate;
	int hit;
	
	
	public Board() {}
	public Board(int no,String writer,String title,String content,Date writeDate,int hit) {
		this.no=no;
		this.writer=writer;
		this.title=title;
		this.content=content;
		this.writeDate=writeDate;
		this.hit=hit;
			
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", writer=" + writer + ", title=" + title + ", content=" + content + ", writeDate="
				+ writeDate + ", hit=" + hit + "]";
	}
	
	
	
}
