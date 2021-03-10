package jdbc;

import java.util.Date;

//DTO(Data Transfer Object) : Data를 Object로 변환하는 객체
//일반적으로 로직을 갖고 있지 않은  순수한 데이터 객체
//필드, 그 필드에 접근하기위한 getter & setter메소드만 가진 클래스

public class MemberDTO{
	//field - [접근제어자] [속성] 데이터타입 변수명[=초기값]
	private  int 	mNo;	//회원번호
	private  String mname;	//이름
	private  String mId;	//id
	private  String mPwd;	//비번
	private  Date	Date;	//회원가입일
	
	//constructor -[접근제어자] 클래스명(매개변수리스트){}
	public MemberDTO() {}
	public MemberDTO(String mname,String mId,String mPwd) {
		this.mname	= mname;
		this.mId	= mId;
		this.mPwd	= mPwd;
	}
	public MemberDTO(int mNo,String mname,String mId,String mPwd,Date	Date) {
		this.mNo 	= mNo;
		this.mname	= mname;
		this.mId	= mId;
		this.mPwd	= mPwd;
		this.Date 	= Date;
	}
	
	//method - [접근제어자] [속성]  리턴유형 함수명(매개변수리스트){}
	//getter & setter
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [mNo=" + mNo + ", mname=" + mname + ", mId=" + mId + ", mPwd=" + mPwd + ", Date=" + Date
				+ "]";
	}
	
	
}











