package test.q2.ChoiHongJun;

public class Account {
	//comment : 필드의 개수가 많아질 수 있으므로  필드에 대한 주석을 필드선언줄에 작성을 권합니다
	//field
	private String accno;	//계좌번호
	private String owner;	//계좌소유자명
	private int balance;	//잔고
	
	//constructor
	public Account(String accno,String owner,int balance){
		this.accno = accno;
		this.owner = owner;
		this.balance = balance;
	}
	
	//setter & getter
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
}
