package test.q1.ChoiHongJun;

import java.util.Scanner;

public class MemberService {

	public void login() {
		System.out.print("ID/password :");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
 	
		switch(input) {
			// comment : id/비번 이런형식으로 입력해야 한다는 전제인데
			// 그렇다면 id와 비번은 hong과  12345으로 일치하지만
		    // hong-12345이렇게 입력하면 로그인불가라는 문제가 생길 수 있어요
			// 따라서   입력형식과 무관하게
			//       id값 따로  비번값 따로.. 값자체를 비교하는 것을 권해요
 			case "hong/12345" :
 				System.out.println("�α��� �Ǿ����ϴ�.");
 				break;
 			default :
 				System.out.println("ID �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
 				break;
		}
	}

	public void logout() {
		System.out.print("�α׾ƿ��Ͻðڽ��ϱ�? :");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		switch(input) {
		case "��" :
			System.out.println("�α׾ƿ��Ǿ����ϴ�.");
			break;
		default :
			System.out.println("�α׾ƿ������ʾҽ��ϴ�.");
			break;
		}
	}

}
