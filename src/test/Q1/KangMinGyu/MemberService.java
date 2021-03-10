package test.q1.KangMinGyu;

public class MemberService {
	
//	field	[����������][�Ӽ�]������Ÿ�� ������ = [�ʱⰪ];
	
//	constructor	[����������]Ŭ������([�Ű���������Ʈ]){}
	
//	method	[����������][�Ӽ�]�������� �޼ҵ��([�Ű���������Ʈ]){}
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
	}
	void logout() {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	
	}
}
