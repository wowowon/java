package Day11;

import java.util.Scanner;

public class Day11_04 { // c s
	
	/*
	 *  ��ȸ���� �Խ��� + ��� ���α׷� [ ����ó�� , ����ó�� , ����Ʈ ]
	 * 		// [m]�Խù� Ŭ����
	 * 				 // ���� , ���� , �н����� , �ۼ��� , �ۼ��� , ��ȸ�� , �ۼ�����Ʈ
	 * 		// [m]��� Ŭ����
	 * 				// ���� , �н����� , �ۼ��� , �ۼ���
	 * 		// [c]��Ʈ�ѷ� Ŭ����
	 * 				// 1.�Խù���� 2. �Խù����� 3.�Խù����� 4.���� 5.���� 6.��۾���
	 * 				// 7.�Խù����� 8.�Խù��ҷ����� 9.������� 10.��ۺҷ�����
	 * 		// [v]Day11_04_ BoardApp Ŭ����
	 * 				// ����� [ �Է¹޾� ��Ʈ�ѷ����� �Է¹��� �� ���� ]
	 */

	public static void main(String[] args) { // m s
		
		Scanner scanner = new Scanner(System.in);
		Controller.load(); // 2. ���� [ ��� �Խù�] �ҷ�����
		while(true) {
			try { // ���ܹ߻� : ����ڰ� �����Է½� ���ܹ߻� -> catch �̵�
				
				// ��� �Խù� ���
				System.out.printf("%s\t%10s\t%5s\t%10s\t%2s\t \n","��ȣ","����","�ۼ���","�ۼ���","��ȸ��");
				int i =0; // ����Ʈ�� �ε���
				for( Board board : Controller.boadList) {
					System.out.printf("%2s\t%10s\t%10s\t%10s\t%2s\t \n", i , board.getTitle() ,
							board.getWriter() ,board.getDate() , board.getViewcount() );
					i++;
				}
			System.out.println("1.���� 2.���� ���� : ");
			int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println("*** �Խù� ��� ***");
					// nextLine() : �������� �Է°��� [ ����! : nextLine �տ� �ϴ� next �ϳ��� ��� ]
					// �ذ��� : �Ϲ�next �� nextLine ���̿� nextLine()
				scanner.nextLine();
				System.out.print(" ���� : ");		String ���� = scanner.nextLine();
				System.out.print(" ���� : ");		String ���� = scanner.nextLine();
				System.out.println(" �ۼ��� : "); String �ۼ��� = scanner.next();
				System.out.println(" ��й�ȣ[����/������] : "); String ��й�ȣ = scanner.next();
				Controller.write( ���� , ���� , �ۼ��� , ��й�ȣ ); // �μ� ����
			}
			else if ( ch == 2) {
				// �ش� �Խù� ��ȣ[�ε���] �� �Է¹޾� �Խù����� ��� ���
				System.out.println(" �Խù� ��ȣ "); int index = scanner.nextInt();
				// �ش� �ε��� ���
				Board temp = Controller.boadList.get(index); // �ش� �ε����� ��ü�� �ӽ� ��ü [ �ڵ� ���̱� ]
				System.out.println("*** �Խù� ����***");
				System.out.println(" ���� : " + temp.getTitle() );
				System.out.println(" �ۼ��� : " + temp.getWriter() + " �ۼ��� : "+ temp.getDate()+"��ȸ�� : "+ temp.getViewcount()  );
				System.out.println(" ���� : " + temp.getContent());
				// ������ [ ���� ]
				// �޴�
				System.out.println(" 1.�ڷΰ��� 2.���� 3.���� 4.��۾��� ���� : "); int ch2 =scanner.nextInt();
				if (ch2 == 1) {}
				else if ( ch2 == 2 ) {
					System.out.println(" �� �Խù� �н����� : "); String password = scanner.next(); 
					scanner.nextLine(); // [ �Ϲ�next ������ nextLine ����ϰ� �Ǹ� �����߻� [ ���� ��� ] 
					System.out.print(" ���� ���� : ");			String title = scanner.nextLine();
					System.out.print(" ���� ���� : ");			String content = scanner.nextLine();
					boolean result =  Controller.update( index , password , title , content ); // ������ �ε�����ȣ,�н�����,����������,�����ҳ��� =>  �μ� 
					if( result ) System.err.println(" �˸�]] ���� ���� ");
					else System.err.println(" �˸�]] ���� ����[ �н����� �ٸ��ϴ�.] ");
				}
				else if ( ch2 == 3 ) {
					System.out.println(" �� �Խù� �н����� : "); String password = scanner.next(); 
					boolean result =  Controller.delete( index , password); // ������ �ε�����ȣ,�н����� => �μ�
					if( result ) System.err.println(" �˸�]] ���� ���� ");
					else System.err.println(" �˸�]] ���� ���� ( �н����尡 �ٸ��ϴ�.) ");
				}
				else if( ch2 == 4 ) { 
					Controller.replytwrite(); // �ε�����ȣ, ��۳��� , ����н����� ,����ۼ���  => �μ� 
				}
				else { }
			}
			else {}
		}catch( Exception e ) {
			System.err.println(" �޽���]] ����Ҽ� ���� ��ȣ �Դϴ�. [ �ٽ��Է� ] ");
			scanner = new Scanner(System.in); // �ٽ� �޸��Ҵ�[ ���� ���빰 ����� ] 
		}
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	} // m e
} // c e
