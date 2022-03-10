package Day07;

public class Day07_04 {

	
	public static void main(String[] args) {
		
	// p. 229 : 외부호출
		
		// 1. 객체 선언
		Car2 mycar = new Car2();
		// 2. 자동차 시동 걸기
		mycar.keyTurnOn(); // 인수x반환x
		// 3. 자동차 전진 메소드 호출
		mycar.run(); // 인수x반환x
		// 4. 현재 스피드 확인 메소드 호출
		int speed = mycar.getspeed(); // 인수x반환o
		System.out.println("현재속도 : "+ speed+ "km/h");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
