package ch03_operator;

// 3항연산자
// 조건? 참값: 거짓값   ->  if(조건){참값}else{거짓값}
// 조건1? 조건1참값: (조건2)? 조건2참값:거짓값     
public class Ex08 {

	public static void main(String[] args) {
		int score = 75;
		
		String result = (score<=100 && score>=91)? "A학점": (score<91 &&  score>=81)? "B학점":"그외";
		System.out.println(score+"점은 "+result);
		
		
		if(score<=100 && score>=91 ) { 
			System.out.println("A학점");
		}else if(score<91 &&  score>=81) { 
			System.out.println("B학점");
		}else if(score<81 && score>=71) {
			System.out.println("C학점");
		}else {
			System.out.println("기타");
		}
	}

}


//(조건1)? 조건1참값: 거짓값;


