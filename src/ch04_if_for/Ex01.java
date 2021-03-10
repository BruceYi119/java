package ch04_if_for;

//switch
/* 문법
 * switch(조건){
 * 		case 값1: 실행코드
 * 				 [break;]
 * 		case 값2: 실행코드
 * 				 [break;]
 *		case 값n: 실행코드
 * 				 [break;]
 *      default: 실행코드
 * }
 */
public class Ex01 {

	public static void main(String[] args) {
		String bunho = "011"; 
		switch(bunho){
		  		case "011": System.out.println("sk");
		  				 	//break;
		  		case "016": System.out.println("ktf");
		  				 	//break;
		 		case "019": System.out.println("lg");
		  					//break;
		       default: System.out.println("기타");
		  }
	}

}




