package ch04_if_for;

import java.util.Scanner; //java.util패키지안의 Scanner클래스를 임포트하겠다
//Scanner클래스는 교재 P40, P510참고하세요

//교재 P150참고
/*가위(1), 바위(2), 보(3) 게임을 구현하세요
 컴퓨터 : 임의 값  => Math.random()이용
 유저   : 값을 입력 => Scanner클래스이용

 비교연산자, 조건문 이용
예) 컴퓨터는  보를 내었습니다
    당신은    가위를 내었습니다
    귀하께서  이겼어요!!*/
public class Ex05_p150 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(); //콘솔을 통해 입력받은 데이터를 숫자형태로 받겠다
		int computer = (int)(Math.random()*(3-1+1)+1); //컴퓨터의 값 임의설정
		
		System.out.println("당신은    "+user+"를 내었습니다");
		System.out.println("컴퓨터는  "+computer+"를 내었습니다"); 
		
		//가위(1), 바위(2), 보(3)  가위1<바위2  바위2<보3  보3<가위1
		switch(user-computer){ 
			case 2:  
			case -1: System.out.println("컴WIN");  break; //가위 바위   바위보
			
			case 1: //바위-가위 나win  보 바위 나win
			case -2: System.out.println("You WIN~~~~~~~~!"); break;  //내가위 컴보자기
			
			case 0 : System.out.println("비겼어요");
			default://실행코드 								
		}
	}

}












