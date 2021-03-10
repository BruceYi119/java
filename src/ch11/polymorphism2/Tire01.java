package ch11.polymorphism2;

//이 클래스의  direct subClass로 HankookTire,KumhoTire가   있다
public class Tire01 {
	//field
	public int maxRotation;			//최대회전수(=>타이어의 수명)
	public int accmulatedRotation;	//누적회전수
	public String location;			//타이어의 위치 1:앞왼쪽 2:앞오른 3:뒤왼 4:뒤오른
	
	//constructor   //new HankookTire("앞왼쪽",15); //new KumhoTire("앞오른쪽",13);
	public Tire01() {}
	public Tire01(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//method
	public boolean roll() {
		++accmulatedRotation; //호출될때마다 1씩 회전수 (누적)증가
		if(accmulatedRotation<maxRotation) {//누적회전수<최대회전수 :정상적으로 타이어가 roll상태
			System.out.println(location+" Tire수명: "+(maxRotation-accmulatedRotation));
			return true;
		}else { //누적회전수==최대회전수: 펑크났어요
			System.out.println("** "+location+" Tire펑크"+" **");
			return false;
		}
	}
}








