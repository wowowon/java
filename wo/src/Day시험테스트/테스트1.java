package Day시험테스트;

import java.util.Scanner;

public class 테스트1 {

	
	public static void main(String[] args) {
		
		학생[] 학생배열 = new 학생[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t성\t적\t표\t\t\t");
				System.out.println("\" 번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("----------------------------------------------------------");		
				int index = 0;
				for( 학생 학생 : 학생배열 )
					if( 학생 != null ) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n" , 학생.get번호() , 학생.get이름() , 학생.get국어(),
								학생.get영어() , 학생.get수학() , 학생.get총점() , 학생.get평균() , 학생.get석차());
					index++;
					}
				System.out.println("----------------------------");
				System.out.println(" 1. 학생점수 등록 2. 학생점수 삭제 : ");		
				int ch = scanner.nextInt();
				if( ch == 1) {
				System.out.print(" 이름을 입력하세요 : "); String 이름 = scanner.next();
				System.out.print(" 국어점수를 입력하세요 : "); int 국어 = scanner.nextInt();
				System.out.print(" 영어점수를 입력하세요 : "); int 영어 = scanner.nextInt();
				System.out.print(" 수학점수를 입력하세요 : "); int 수학 = scanner.nextInt();
					
					int 총점 = 국어+영어+수학; 
					double 평균 = (double)총점/3;
					
					학생 학생 = new 학생 (이름,국어,영어,수학);
					int i =0;
					for( 학생 temp : 학생배열 ) {
						if( temp == null) {
							학생배열[i] = 학생;
							break;
						}
					}
				i++;
				} // 학생등록
				else if( ch == 2) {
					System.out.println(" 삭제할 학생을 고르시오"); String 이름 = scanner.next();
					for( 학생 학생 : 학생배열 ) {
						if( 학생.get이름().equals(학생명)) {
							학생배열.remove(학생);
							break;
						}
					}
				} // 학생 삭제
				else {}
			}
		catch(Exception e ) {
			System.out.println(" 메시지)) ");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
