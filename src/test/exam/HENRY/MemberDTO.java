package HENRY;

import java.util.Date;

public class MemberDTO {
	private int mNo;
	private String mWriter;
	private String mTitle; 
	private String mContent;
	private Date mwriteDate;
	private int mHit;

	public MemberDTO() {}
	public MemberDTO(int mNo,String mWriter,String mTitle,String mContent,Date mwriteDate,int mHit) {
		this.mNo = mNo;
		this.mWriter = mWriter;
		this.mTitle = mTitle; 
		this.mContent = mContent;
		this.mwriteDate = mwriteDate;
		this.mHit = mHit;
	}
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmWriter() {
		return mWriter;
	}
	public void setmWriter(String mWriter) {
		this.mWriter = mWriter;
	}
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public String getmContent() {
		return mContent;
	}
	public void setmContent(String mContent) {
		this.mContent = mContent;
	}
	public Date getmwriteDate() {
		return mwriteDate;
	}
	public void setmwriteDate(Date mwriteDate) {
		this.mwriteDate = mwriteDate;
	}
	public int getmHit() {
		return mHit;
	}
	public void setmHit(int mHit) {
		this.mHit = mHit;
	}
	
	@Override
	public String toString() {
		return "MemberDTO [mNo=" + mNo + ", mWriter=" + mWriter + ", mTitle=" + mTitle + ", mContent=" + mContent
				+ ", mwriteDate=" + mwriteDate + ", mHit=" + mHit + "]";
	}
}



