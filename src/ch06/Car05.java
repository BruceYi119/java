package ch06;

/*return문-교재p258참고
- return문이 존재하면 현재 실행중인 메서드가 종료되고  
    해당 메서드를 호출한 곳으로 되돌아 간다.
   
    메소드 선언에               리턴타입이 있는 메소드는 반드시 return문을 사용해서 지정해야한다.
    하지만  void로 선언된 리턴값이 없는 메소드에서도         return문을 사용할 수 있다
    	이때의 return문은   함수를 강제종료시킨다.
    	예) return;
*/     
public class Car05 {
	//field
	int gas;
	
	//constructor //자동차객체를 생성
	
	//method
	//가스충전기능
	void setGas(int gas) {
		this.gas=gas;
	}
	
	//가스충전여부확인기능
	boolean isLeftGas() {
		if(gas==0){ //gas가 존재하지않는다면(남아있는경우라면)
			System.out.println("gas가 없어요");
			return true;
		}
	
		//gas가 존재하니
		System.out.println("gas가 남아있어요");
		return false;		
	}
	
	//달려라기능
	//void로 선언된 리턴값이 없는 메소드에서도         return문을 사용할 수 있다
	void run(){
		while(true) {
			if(gas>0) {
				System.out.println("달립니다(gas잔량:"+this.gas+")");
				gas-=1;
			}else {
				System.out.println("멈춥니다(gas잔량:"+gas+")");
				return;  //return문은   함수를 강제종료시킨다
			}
		}//while
	}//run()
	
	
}









