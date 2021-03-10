package ch06;

import java.util.Date;

// Constructor
// using both primitive and reference types
//자동차에 대한 속성(과 기능)을 가진 Class


//클래스 - 속성(Field), 기능(method)
//Initializes automatically based on declared data type(s)
//byte, short, int...
// double -> 0.0
//String, Date -> null
public class Car01 {
	

		//속성 => 필드(Field) => 변수선언
		//색상-빨주 red, 제조사-현대, 기아, 가격-1000, 최고속도 350, 제조날짜 년원일 (/.-)
		//[접근제한자] [석상 field], 기능 (method)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
		//고유데이터 바뀌지 않는 데이터
		String color = "white";
		String brand = "현대"; 
		//int price;
		int maxSpeed;
		Date makeDate = new Date();//제조날짜
		double maxKGM; //최대토크
		int price = 3000;
		
		
		//상태데이터 - 현재 속도, 엔진회전수
		int speed;// 현재속도
		
		

		
		//기능 => method
		//[접근제한자] [속성] 리턴유형 함수명(매개변수리스트){}

		//움직이다 0 1 2 3 4 5
		void move () {
			System.out.println("move()호출성공!");
		}

		//멈추다 5 4 3 2 1 0
		void stop() {
			System.out.println("stop()호출성공!");
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getMaxSpeed() {
			return maxSpeed;
		}

		public void setMaxSpeed(int maxSpeed) {
			this.maxSpeed = maxSpeed;
		}

		public Date getMakeDate() {
			return makeDate;
		}

		public void setMakeDate(Date makeDate) {
			this.makeDate = makeDate;
		}

		public double getMaxKGM() {
			return maxKGM;
		}

		public void setMaxKGM(double maxKGM) {
			this.maxKGM = maxKGM;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getSpeed() {
			return speed;
		}

		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		
	}











