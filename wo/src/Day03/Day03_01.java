package Day03;

public class Day03_01 { // c s

	public static void main(String[] args) { // m s
		
		// 1일차 : 출력 , 입력
		// 2일차 : 저장(변수) , 계산(연산) 
		
		// 제어문
			// 컴퓨터의 판단력
			// 조건식이 true 이면 실행문 처리
		// 형태
			// 1. IF( 조건식 [ true/false )	 실행문;
			// 2. IF ( 조건식 ) 실행문 [참];
			//		ELSE 실행문[거짓];
			// 3. 실행문이 2줄 이상 ( ; 2개 이상이면 ) { } 묶음처리
			// 4. 경우의수 다수일떄 [조건이 다술일때 ] 
			//	 IF( 조건1 ) {실행문[참1]; }
			//	 ELSE IF( 조건 2 ) { 실행문[참2]; }
			//	 ELSE IF( 조건 3 ) { 실행문[참3]; }
			//	 ELSE IF( 조건 4 ) { 실행문[참4]; }
			//	 ELSE IF( 조건 5 ) { 실행문[참5]; }
			// 	 ELSE { 실행문[거짓]; }
			// 5. if 중첩
			// 		if ( 조건식 ) {
			//			IF( 조건식 ){ 실행문; }
			//			ELSE { 실행문; }
			//		}ELSE{
			//			IF( 조건식 ){ 실행문; }
			//			ELSE { 실행문; }
			// 	}
		// 예제 1
		if( 3>1 ) System.out.println("예) 3이 1보다 크다. ");
			// 만약에 3이 1보다 크면 출력 아니면 출력x 
			// true이면 실행
		// 예제2
		if( 3>5 ) System.out.println("예 ) 3이 5보다 크다. ");
			// 만약에 3이 5보다 크면 출력o 아니면 출력x
		// 예제3
		if ( 3>1) System.out.println("예 ) 3이 1보다 크다.");
		else System.out.println("예3_2) 3이 1보다 작다.");
			// 만역에 3이 1보다 크면 예3_1 출력
			// 아니면 ( 3이 1보다 작으면 ) 예 3_2 출력
		// 예제4
		if ( 3>2 ) { // true 실행문 시작 [ 실행문(;) 2개 이상일때 ]
			System.out.println("true"); 
		System.out.println("3이 2보다 크다"); 
		} // true 실행문 끝
		else { // false 실행문 시작
			System.out.println("false");
			System.out.println("3이 2보다 작다.");
		} // false 실행문 끝
		
		// 예제5
		if( 3>5 ) System.out.println("예5) 3이 5보다 크다"); // 실행 x
		else if ( 3> 4 )System.out.println("예5) 3이 4보다 크다."); // 실행 x
		else if ( 3>3 )System.out.println("예5) 3이 3보다 크다"); // 실행 x
		else if ( 3>2 )System.out.println("예5) 3이 2보다 크다"); // 실행o
		else System.out.println(" true 없다. "); // 실행x
		
		if( 3>5 )System.out.println("예5) 3이 5보다 크다");	// 실행x
		if( 3>4 )System.out.println("예5) 3이 4보다 크다."); // 실행x
		if( 3>3 )System.out.println("예5) 3이 3보다 크다."); // 실행x
		if( 3>2 )System.out.println("예5) 3이 2보다 크다."); // 실행o
		if( 3<2 )System.out.println(" true 없다."); // 실행x
		
		
	
		
		
		
		
		
		
		
	} // m e

} // c e
