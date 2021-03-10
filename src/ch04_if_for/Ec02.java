package ch04_if_for;

//조건문
/* 90점이상- A등급
 * 80점이상- B등급
 * 70점이상- C등급
 * 60점이상- D등급
 * 60점미만- F	출력
 */

/* Math.random() : 0.0이상 1.0미만의 난수발생 
 * Returns a double value with a positive sign, 
 * greater than or equal to 0.0 and less than 1.0
 */
public class Ec02 {

	public static void main(String[] args) {
		double num = Math.random();
		System.out.println("Math.random()="+num);
		System.out.println("(int)Math.random()="+(int)num);
		
		//0~5 0 1 2 3 4 5
		//Math.random()*(큰수-작은수+1)+작은수
		//(int)(Math.random()*(큰수-작은수+1)+작은수)
		System.out.println( (int)(Math.random()*(5-0+1)+0) );
		System.out.println( (int)(Math.random()*(5-0+1)+0) );
		
		int score = (int)(Math.random()*(100-0+1)+0);		//임의점수값을 저장하기 위한 변수
		String grade="";	//등급을         저장하기 위한 변수
		
		if(score >= 90){
			grade="A";  
		}else if(score>=80){
			grade="B";
		}else if(score>=70){
			grade="C";
		}else if(score>=60){
			grade="D";
		}else {
			grade="F";
		}
		
		System.out.println(score+"점 : "+grade+"등급");
	}

}







