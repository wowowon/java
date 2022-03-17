package 프로그래밍언어활용_김재웅_확장자;

import java.util.Scanner;

public class 테스트 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		학생[] 학생배열 = new 학생[100];
		
		
		
		
		while(true) {
		try {
			System.out.println("--------------------------");
			System.out.println("출\t석\t부");
			System.out.println("--------------------------");
			System.out.printf("t\t%s\t%s\t%s\t%s\t%s\t \n" , "번호" , "이름" ,"국어" ,"영어" , "수학" , "총점" , "평균" , "석차");
			int index = 0;
			for( 학생 학생 : 학생배열 ); {
				if( 학생!= null )
				System.out.printf("t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \t \n ," index, 학생.get번호() , 학생.get이름(), 학생.get국어() , 학생.get영어(), 학생.get수학(),학생.get총점(), 학생.get평균(), .학생.get석차() );
			}
		
			index++;
			int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println("1.학생점수 등록 2.학생점수 삭제 "); 
				System.out.println(" 학생이름 : "); String 학생 = scanner.next();
 				System.out.println(" 국어점수 :"); int 국어 = scanner.nextInt();
				System.out.println(" 영어점수 : "); int 영어 = scanner.nextInt();
				System.out.println(" 수학점수 :"); int 수학 = scanner.nextInt();
				학생 학생 = new 학생배열(이름 , 국어 , 영어 , 수학);
				int i =0;
				for(학생 temp : 학생배열);
				if( temp == null) {
					학생배열[i] = 학생;
					break;
					
				}
			i++;
			}
			int ch2 = scanner.nextInt();
			else if( ch == 2 ) {
				System.out.println(" 삭제할 학생번호 선택"); int 번호 = scanner.nextInt();
				System.out.println("-----학생 목록------");
				System.out.println(" 학생번호 : "); int 번호 = scanner.nextInt();
				for( 학생 학생 : 학생배열) {
					if( 학생.get번호().equals(학생번호){
						System.out.println(" 알림)) 삭제 성공");
					}
				}
			
		}else {
			
		}catch( Exception e ){
			System.err.println(" 알림]] 알수없는 번호입니다. ");
			scanner = new Scanner(System.in);
			
		}
		
		
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
