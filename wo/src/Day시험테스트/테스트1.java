package Day�����׽�Ʈ;

import java.util.Scanner;

public class �׽�Ʈ1 {

	
	public static void main(String[] args) {
		
		�л�[] �л��迭 = new �л�[100];
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("------------------------------------------------------------");
				System.out.println("\t\t��\t��\tǥ\t\t\t");
				System.out.println("\" ��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("----------------------------------------------------------");		
				int index = 0;
				for( �л� �л� : �л��迭 )
					if( �л� != null ) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f \n" , �л�.get��ȣ() , �л�.get�̸�() , �л�.get����(),
								�л�.get����() , �л�.get����() , �л�.get����() , �л�.get���() , �л�.get����());
					index++;
					}
				System.out.println("----------------------------");
				System.out.println(" 1. �л����� ��� 2. �л����� ���� : ");		
				int ch = scanner.nextInt();
				if( ch == 1) {
				System.out.print(" �̸��� �Է��ϼ��� : "); String �̸� = scanner.next();
				System.out.print(" ���������� �Է��ϼ��� : "); int ���� = scanner.nextInt();
				System.out.print(" ���������� �Է��ϼ��� : "); int ���� = scanner.nextInt();
				System.out.print(" ���������� �Է��ϼ��� : "); int ���� = scanner.nextInt();
					
					int ���� = ����+����+����; 
					double ��� = (double)����/3;
					
					�л� �л� = new �л� (�̸�,����,����,����);
					int i =0;
					for( �л� temp : �л��迭 ) {
						if( temp == null) {
							�л��迭[i] = �л�;
							break;
						}
					}
				i++;
				} // �л����
				else if( ch == 2) {
					System.out.println(" ������ �л��� ���ÿ�"); String �̸� = scanner.next();
					for( �л� �л� : �л��迭 ) {
						if( �л�.get�̸�().equals(�л���)) {
							�л��迭.remove(�л�);
							break;
						}
					}
				} // �л� ����
				else {}
			}
		catch(Exception e ) {
			System.out.println(" �޽���)) ");
		}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
