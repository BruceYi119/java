package test.q2.JiSeungWon;

public class Account {
	//field
	private String ano; //계좌번호 //comment: 필드명옆에 주석문을 작성해주는게 가독성이 좋아요
	private String owner;//계좌소유자명
	private int balance;//잔고
	
	//constructor
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
		
	}
	//setter & getter
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
		
		
}
