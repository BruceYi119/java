package ch11.polymorphism2;

public class KumhoTire extends Tire01 {

	//field
	
	//constructor
	public KumhoTire() {}
	public KumhoTire(String location,int maxRotation) {
		//super() 조상클래스의 생성자를 호출. 반드시 생성자의 첫번째 라인에서 작성
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accmulatedRotation; //호출될때마다 1씩 회전수 (누적)증가
		if(accmulatedRotation<maxRotation) {//누적회전수<최대회전수 :정상적으로 타이어가 roll상태
			System.out.println(location+" 금호Tire수명: "+(maxRotation-accmulatedRotation));
			return true;
		}else { //누적회전수==최대회전수: 펑크났어요
			System.out.println("** "+location+" 금호Tire펑크"+" **");
			return false;
		}
	}
}















