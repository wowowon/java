package Day01;

import java.util.Scanner;
public class Day01_6 { // c s

	
	public static void main(String[] args) { // m s
		
		/*
		����2 : �ϳ��� �湮�� 
		[�Էº���]
			1. �ۼ��� , ���� , ��¥ 
		[��� ��]
			 *  --------------�湮��--------------------
			 *  | ���� | �ۼ��� | 	���� 	  | ��¥  |
			 *  |  1    | ��ȣ�� | �ȳ��ϼ���  | 09-28 |
			 *  ----------------------------------------
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� : ");	String ���� = scanner.next();
		System.out.print(" �ۼ��� : ");	String �ۼ��� = scanner.next();
		System.out.print(" ���� : ");	String ���� = scanner.next();
		System.out.print(" ��¥ : ");	String ��¥ = scanner.next();
		
		System.out.println("*------------�湮��--------------");
		System.out.println("* ����\\�ۼ���\\����\\��¥");
		System.out.printf("*%s\t%s\t%s\t%s\t%s\n" , ���� , �ۼ��� , ���� , ��¥ , " ");
		System.out.println("*--------------------------------------");
		
		
	} // m e
} // c e
