package Day01;

import java.util.Scanner;

public class Day01_5 { // c s

	
	public static void main(String[] args) { // m s
		
		// �Է� -> ���� -> ���
		// 1. �Է°�ü ����
		Scanner scanner = new Scanner(System.in);
		// 2. �Է��� ��� �ȳ� // 3.�Է¹��� ������ �ٸ����� ���� [ ��? ����� ]
		System.out.println(" ���̵� : ");		String id = scanner.next();
		System.out.println(" ��й�ȣ : ");	String pw = scanner.next();  
		System.out.println(" ���� : ");		String name = scanner.next();
		System.out.println(" �̸��� : ");		String email = scanner.next();
		// 3. ���
		System.out.println(">>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ���>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println( id + "\t"+ pw +"\t" + name +"\t"+ email );
		
	} // m e
} // c e
