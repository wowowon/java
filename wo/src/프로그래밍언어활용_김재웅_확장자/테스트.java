package ���α׷��־��Ȱ��_�����_Ȯ����;

import java.util.Scanner;

public class �׽�Ʈ {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		�л�[] �л��迭 = new �л�[100];
		
		
		
		
		while(true) {
		try {
			System.out.println("--------------------------");
			System.out.println("��\t��\t��");
			System.out.println("--------------------------");
			System.out.printf("t\t%s\t%s\t%s\t%s\t%s\t \n" , "��ȣ" , "�̸�" ,"����" ,"����" , "����" , "����" , "���" , "����");
			int index = 0;
			for( �л� �л� : �л��迭 ); {
				if( �л�!= null )
				System.out.printf("t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s \t \n ," index, �л�.get��ȣ() , �л�.get�̸�(), �л�.get����() , �л�.get����(), �л�.get����(),�л�.get����(), �л�.get���(), .�л�.get����() );
			}
		
			index++;
			int ch = scanner.nextInt();
			if( ch == 1) {
				System.out.println("1.�л����� ��� 2.�л����� ���� "); 
				System.out.println(" �л��̸� : "); String �л� = scanner.next();
 				System.out.println(" �������� :"); int ���� = scanner.nextInt();
				System.out.println(" �������� : "); int ���� = scanner.nextInt();
				System.out.println(" �������� :"); int ���� = scanner.nextInt();
				�л� �л� = new �л��迭(�̸� , ���� , ���� , ����);
				int i =0;
				for(�л� temp : �л��迭);
				if( temp == null) {
					�л��迭[i] = �л�;
					break;
					
				}
			i++;
			}
			int ch2 = scanner.nextInt();
			else if( ch == 2 ) {
				System.out.println(" ������ �л���ȣ ����"); int ��ȣ = scanner.nextInt();
				System.out.println("-----�л� ���------");
				System.out.println(" �л���ȣ : "); int ��ȣ = scanner.nextInt();
				for( �л� �л� : �л��迭) {
					if( �л�.get��ȣ().equals(�л���ȣ){
						System.out.println(" �˸�)) ���� ����");
					}
				}
			
		}else {
			
		}catch( Exception e ){
			System.err.println(" �˸�]] �˼����� ��ȣ�Դϴ�. ");
			scanner = new Scanner(System.in);
			
		}
		
		
		}
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
