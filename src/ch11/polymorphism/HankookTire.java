package ch11.polymorphism;

//이 클래스는 Tire01을 상속받는 클래스이다
public class HankookTire extends Tire01{
	//field
	//int maxRotation;			//최대회전수(=>타이어의 수명)
	//int accmulatedRotation;	//누적회전수
	//String location;			//타이어의 위치 1:앞왼쪽 2:앞오른 3:뒤왼 4:뒤오른
	
	//constructor
	public HankookTire() {}
	public HankookTire(String location,int maxRotation) {
		//super() 조상클래스의 생성자를 호출. 반드시 생성자의 첫번째 라인에서 작성
		super(location, maxRotation);
		/*super.location=location;
		  super.maxRotation=maxRotation; */
	}
	
	//method
	@Override
	public boolean roll() {
		++accmulatedRotation; //호출될때마다 1씩 회전수 (누적)증가
		if(accmulatedRotation<maxRotation) {//누적회전수<최대회전수 :정상적으로 타이어가 roll상태
			System.out.println(location+" 한국Tire수명: "+(maxRotation-accmulatedRotation));
			return true;
		}else { //누적회전수==최대회전수: 펑크났어요
			System.out.println("** "+location+" 한국Tire펑크"+" **");
			return false;
		}
	}
	
	
}





