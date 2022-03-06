package Day01;

import java.util.Scanner;
public class Day01_6 { // c s

	
	public static void main(String[] args) { // m s
		
		/*
		문제2 : 하나의 방문록 
		[입력변수]
			1. 작성자 , 내용 , 날짜 
		[출력 예]
			 *  --------------방문록--------------------
			 *  | 순번 | 작성자 | 	내용 	  | 날짜  |
			 *  |  1    | 강호동 | 안녕하세요  | 09-28 |
			 *  ----------------------------------------
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" 순번 : ");	String 순번 = scanner.next();
		System.out.print(" 작성자 : ");	String 작성자 = scanner.next();
		System.out.print(" 내용 : ");	String 내용 = scanner.next();
		System.out.print(" 날짜 : ");	String 날짜 = scanner.next();
		
		System.out.println("*------------방문록--------------");
		System.out.println("* 순번\\작성자\\내용\\날짜");
		System.out.printf("*%s\t%s\t%s\t%s\t%s\n" , 순번 , 작성자 , 내용 , 날짜 , " ");
		System.out.println("*--------------------------------------");
		
		
	} // m e
} // c e
