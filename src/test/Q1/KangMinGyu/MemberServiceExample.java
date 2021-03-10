package test.q1.KangMinGyu;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		boolean result = ms.login("hong","12345");
		boolean result1 = ms.login("hong", "54321");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		if(!result1){
			ms.logout();
			System.out.println("id�� password �� Ȯ���ϼ���.");
		}
		
	}

}
