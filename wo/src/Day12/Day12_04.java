package Day12;

import java.util.Random;
import java.util.Scanner;

public class Day12_04 {

	
	public static void main(String[] args) {
		
		// 차량번호 구분 프로그램
		// 조건
			// 1. 난수 0000~9999[ 4자리 정수 ] 사이의 난수 10개 생성해서 배열에 저장
			// 2. 모든 차량 번호를 배열에 저장
			// 3. 끝자리 번호로 홀/짝 구분
			// 4. 차량 끝짜리의 번호가 홀수 차량 배열에 저장
			// 5. 차량 끝짜리의 번호가 짝수 차량 배열에 저장
			// 6. 홀수차량 배열 출력 // 짝수차량 배열 출력
	
		Scanner scanner = new Scanner(System.in); // *입력객체
		
		String[] carlist = new String[10]; // * 문자열 10개 저장할수 있는 배열 [ 차량번호 최대 10개 저장 가능 ]
		String[] evenlist = new String[10];
		String[] oddlist = new String[10];
		while(true) { // 무한루프
			
			// 모든차량 번호 출력
			System.out.println(" \n*** 주자중인 모든 차량번호 *** ");
			for( String temp : carlist ) {
				if( temp != null ) {
					if( Integer.parseInt(temp) % 2 == 0 ) {
						System.out.println( temp+"[짝]  ");
						// 짝수차량배열에 저장
						for( int i = 0; i<evenlist.length ; i++) {
							if( evenlist[i] == null) { evenlist[i] = temp;break;}
						}
					}else {
						System.out.println( temp+"[홀]  ");
					}
				 System.out.println( temp+ " " );
				}
			}
			// 홀수차량 번호 출력
			System.out.println(" *** 주차중인 모든 홀수 차량***");
			
			// 짝수차량 번호 출력
			System.out.println(" *** 주차중인 모든 짝수 차량***");
			
			System.out.println(" 1.차량입차"); int ch = scanner.nextInt();
			if( ch == 1) {
			// 차량번호 난수 생성	
			Random random = new Random(); // 랜덤 객체
			int intnum = random.nextInt(10000); // 0~9999 중 난수 발생
			String strnum = String.format("%04d" , intnum ); // %숫자d : 숫자만큼 자릿수 [ 만일 해당 자릿수가 없으면 공백
			// 배열내 공백을 찾아 차량번호 저장																																				
			boolean save = false;
			for( int i =0; i<carlist.length ; i++ ) {
				if( carlist[i] == null ) { carlist[i] = strnum; save=true; break; }
			}
			// 만약에 빈공간이 없으면 만차
			if( save == false)System.out.println(" 만차 [ 주차 불가 ] ");
			
			}else {
			
			}
	
	
	
	
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
