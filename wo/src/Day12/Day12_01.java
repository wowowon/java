package Day12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_01 {

	public static void main(String[] args) throws IOException {
	
		// p.496
		// string ���ڿ� Ŭ����
			// 1. java.lang ��Ű�� [ import x ]�Ҽ�
			// 2. ��ü�ε� �ڵ� ���ͷ� [��ü�� �ڵ� ���� ]
		String ����1 = new String(" ���缮 "); System.out.println( ����1);
		String ����2 = "���缮";				System.out.println( ����2 ); // �ڵ� ��ü ����
			// 3. 13���� ������ [ ���ڿ� , ����Ʈ�� �� ]
			// 4. �ܺ�[ ����, ��Ʈ��ũ �� ]�� ���� �����ʹ� ����Ʈ��
		
		// ����Ʈ -> ���� ��ȯ ���� ����
			// 1. ����Ʈ => +-127 ǥ������
			// 2. �ƽ�Ű�ڵ� => 0 or 1 ���d�� 7�ڸ� => 0101011 => 2��7�� => 128���� ǥ������
			// ����Ʈ -> �ƽ�Ű�ڵ� ��ȯ [ ����/Ư������ 1����Ʈ , �ѱ� 2����Ʈ ]
		
			// ���� : 0 , 1
			// 7�ڸ� ���� : �ƽ�Ű�ڵ� [ 1000001 => A ]
		
		// p.497 ����1 
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
					//  H   e	l	l	o  ���� j a 	 v	a
					//	0	1	2	3	4	5  6 7	8	9 	=> 
		// 2. ����Ʈ �迭 -> ���ڿ� ��ȯ [ new String( �迭�� )
		String str1 = new String( bytes ); // String ����Ʈ -> �ƽ�Ű�ڵ庯ȯ
		// 3.Ȯ��
		System.out.println(" ����Ʈ�迭 -> ���ڿ� ��ȯ : " + str1 );
		
		// 4. Ư�� ��ġ���� ��ȯ		[ new String( �迭�� , �����ε��� , ���� ) ]
		String str2 = new String(bytes , 6 , 4 ); 
		// 5. Ȯ��
		System.out.println(" ����Ʈ�迭�� 6���ε������� 4�� ��ȯ : " + str2);
		
		// p.498 ����2
			// SyStem.out : �ý���Ŭ������ ����ʵ�
			// SyStem.in : �ý���Ŭ������ �Է��ʵ�
		byte[] bytes2 = new byte[100]; // 100�� ����Ʈ�� �����Ҽ� �ִ� �迭
		
		System.out.println(" �Է� : "); // ����ʵ峻 print�޼ҵ� ȣ��
		int readByteNo = System.in.read( bytes2 );
			// �ܺ���� : �ڹ����α׷��� [ Ű���� , ���� , ��Ʈ��ũ �� ] ����� �Ϲݿ��� 
		
		// Ű���� �Է� ---��Ʈ��[���:����Ʈ]----> ��ǻ��
		// a -> 97	// a ���� -> 97 , 13[\n:�ٹٲ�] , 10[\r:Ŀ���� ������]
		
		System.out.println(" �Է¹��� ����Ʈ : " + Arrays.toString(bytes2) );
		
		String str = new String( bytes2 , 0 , readByteNo-2 );
											// ��������Ʈ�� - 2
		System.out.println(" �Է¹��� ����Ʈ -> ���ڿ� ��ȯ : "+ str);
		
			// Scanner Ŭ���� [ System.in ���κ��� �Է¹��� ����Ʈ�� ��ü�� ���� ]
		Scanner scanner = new Scanner(System.in);
			//
		scanner.next(); // ����Ʈ -> ���ڿ� ��ȯ
		scanner.nextInt(); // ����Ʈ -> ������ ��ȯ
		scanner.nextDouble(); // ����Ʈ -> �Ǽ��� ��ȯ
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
