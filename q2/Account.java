package test.q2.YiSeungJun;

import java.util.ArrayList;

public class Account {

	protected ArrayList<Account> accList = new ArrayList<Account>();
	//comment : 일반적으로  접근제어자 속성  데이터타입 변수명 순으로 작성합니다
	final private String ACCNO;
	final private String ACNAME;
	private int balance;

	public Account() {
		this.ACCNO = "";
		this.ACNAME = "";
		this.balance = 0;

		if (accList == null)
			this.accList = new ArrayList<Account>();
	}; //comment : {}블럭뒤에 ;을 빼셔요~ 

	public Account(String accno, String acname, int balance) {
		this.ACCNO = accno;
		this.ACNAME = acname;
		this.balance = balance;
	}

	public void setBalance(int deposit) {
		this.balance = deposit;
	}

	public int getBalance() {
		return this.balance;
	}
	
	public String getACCNO() {
		return this.ACCNO;
	}

	public String getACNAME() {
		return this.ACNAME;
	}

	//setter와 getter외의 필요함수를 추가하셨군요 ~ ^-^
	public Account searchAccount(String accno) {
		Account acc = null;

		for (Account a : this.accList) {
			String acno = (String)a.getACCNO();

			if (acno.equals(accno)) {
				acc = a;
				break;
			}
		}

		return acc; 
	}

}