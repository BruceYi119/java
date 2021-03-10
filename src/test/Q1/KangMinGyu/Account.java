package test.q1.KangMinGyu;

public class Account {
	
//	field	[����������][�Ӽ�]������Ÿ�� ������ = [�ʱⰪ];
	private int balance;
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
//	constructor	[����������]Ŭ������([�Ű���������Ʈ]){}
	
//	method	[����������][�Ӽ�]�������� �޼ҵ��([�Ű���������Ʈ]){}
	//이 balance(int) 메서드의 기능은 무엇일까요?
	 boolean balance(int values) {
		if(0<values && values<=1000000) {
			return true;
		}else {
			return false;
		}
	}
	 int setBalance(int balance) {
		 this.balance = balance;
		 if(MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
			System.out.println(balance);
			return balance;
	 	}else {
	 		System.out.println("�ݾ��� ���� �ʽ��ϴ�.");
	 		return balance;
	 	}
	
	 }
	 
	int getBalance(int balance) {
		return balance;	
	 }
	 
}
	

