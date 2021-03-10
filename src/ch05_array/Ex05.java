package ch05_array;

//가변배열-[Java의정석]ch5_배열 - 슬라이드12, 교재 p219 참고
//	다차원 배열에서 마지막 차수의 크기를 지정하지 않고 각각 다르게 지정.

public class Ex05 {

	public static void main(String[] args) {
		//5개반 학생들의 몸무게를 저장하세요
		double[][]  weight = {{20.5, 21.8, 26.9},
							  {16.8, 19.5},
							  {26.7},
							  {20.9, 22.2, 30.4, 16.7},
							  {36.0, 32.1}};
		
		//각 배열의 크기가 다른 것을 확인할 수 있다
		System.out.println("weight[0].length="+weight[0].length);//3
		System.out.println("weight[1].length="+weight[1].length);//2
		System.out.println("weight[2].length="+weight[2].length);//1
		System.out.println("weight[3].length="+weight[3].length);//4
		System.out.println("weight[4].length="+weight[4].length);//2
		
		for(int i=0; i<5; i++) {
			//배열의 크기가 다르므로 조건을  weight[i].length으로 이용
			for(int j=0; j<weight[i].length; j++) {
				System.out.print(weight[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}







