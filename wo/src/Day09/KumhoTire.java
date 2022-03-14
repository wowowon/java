package Day09;

public class KumhoTire extends Tire {
			// 서브클래스 extends 슈퍼 클래스
	
	// 1. 필드
	
	// 2. 생성자
	public KumhoTire( String location , int maxRotaion) {
		super(location , maxRotaion );
	}
			
	// 3. 메소드
			@Override // 슈퍼클래스내 메소드를 재정의[수정]
			public boolean roll() {
				accumulatedRotation++;
				if( accumulatedRotation < maxRotaion ) {
					System.out.println(location+ " 금호타이어 수명 : " 
							+ (maxRotaion- accumulatedRotation));
					return true;
				}else {
					System.out.println("*** " +location +" 금호 타이어 펑크 *** ");
					return false;
				} 
			}
	
	
	
}
