package Day03;

import java.util.Scanner;

public class Day03_04 { // c s

	
	public static void main(String[] args) { // m s
	
		// ��� : 1. if�� 2. switch��
			// if : ���˻�( true Ȥ�� false)		/ ����Ǽ� ������ ���� �ʴ°�� 
				// >= <= > < == !=
			// switch : �����Ͱ˻�(��������)					/ ����Ǽ� ������ �ִ� ���
				// ������ case 
			// ����
				// switch( �˻��� ) {
				//		case '��' : ���๮;
				//		case '��' : ���๮:
				//    	case '��' : ���๮;
				//		default : ���๮;
				// }
		
			// break; 
				
		// ��1) ������ 90�� �̸� A 80���̸� B 70���� C �׿� Ż��
		int ���� = 80;
		//-----------------------------------------------------
		if( ����== 90 ) System.out.println("A���");
		else if( ����==80 )System.out.println("B���");
		else if( ����==70 )System.out.println("C���");
		else System.out.println("Ż��");
		
		System.out.println("-----------------------------");
		
		switch ( ���� ) {
			case 90 : System.out.println("A���");
			case 80 : System.out.println("B���");
			case 70 : System.out.println("C���");
			default : System.out.println("Ż��"); 
		}
		
		// ��2)
		int ��ư = 3;
		switch( ��ư ) {
			case 1 : System.out.println(" 1������ �̵� "); break;
			case 2 : System.out.println(" 2������ �̵� "); break;
			case 3 : System.out.println(" 3������ �̵� "); break;
			case 4 : System.out.println(" 4������ �̵� "); break;
			default : System.out.println(" ���� ");
		}
		
		// ��3)
		char ��� = 'A';
		switch( ��� ) {
		case 'A' : 
			case 'B' : System.out.println(" ��� ȸ�� "); break;
			case 'C' : 
			case 'D' : System.out.println(" �Ϲ� ȸ�� "); break;
			default : System.out.println(" �մ� ");
		
		} 
		
		// ��4)
		String  ���� = "����";
		switch( ���� ) { // ���������� ������ .equals ��� x
			case "����" : System.out.println("700����");
			case "����" : System.out.println("500����");
			default : System.out.println("300����");
		
		}
		
		// ����1 ) ����,����,���� ������ �Է¹޾�  
			// 	����� 90���̻��̸� A���
			//  80���̻��̸� B��� ������ Ż��
		Scanner scanner = new Scanner(System.in);
		System.out.print(" ���� "); int ���� = scanner.nextInt();
		System.out.print(" ���� "); int ���� = scanner.nextInt();
		System.out.print(" ���� "); int ���� = scanner.nextInt();
		int ��� = (����+����+����)/3;
		System.out.println(" ��� : " + ��� + " ������/10 : "+���/10 );
		switch( ���/10 ) { // 1�ڸ� ����
			case 9 : System.out.println("A���");
			case 8 : System.out.println("B���");
			default : System.out.println("Ż��");
		} 
		
		
		
		
		
		
		
		
		
	} // m e
} // c e
