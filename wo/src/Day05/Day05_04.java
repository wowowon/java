package Day05;

import java.util.Scanner;

public class Day05_04 { // c s
	
	public static void main(String[] args) { // m s
		
		/*
		��빮�� 1. ����� 2.����/�ڷ���/����  3.����/�ݺ� 4.����/�ݺ� 5.�迭
		* ���� �뿩 console ���α׷�
		1. �迭 ����
			1. ȸ�� [ ���̵�(�ߺ�x) , ��й�ȣ ]
			2. ���� [ ������(�ߺ�x) , �����뿩����(�뿩����,�뿩��) , �뿩��(�α��ν� ���̵�) ]
		2. �ʱ�޴�
			1.ȸ������ 2.�α��� 
				1.ȸ�����Խ� ���̵� �ߺ�üũ 
				2.�α��� ������ �α��θ޴� , �α��� ���н� �α��ν��� ��� 
		3. �α��ν� �޴� 
			1. �����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ�
	 			1. �����˻��� �������� ��ġ�ϸ� ������� �����뿩���� ���
				2. ������Ͻ� ��� ������ ��� 
				3. �����뿩�� �����뿩���ΰ� �����Ҷ� �����뿩 ó��
				4. �����ݳ��� ������ �뿩�� ������ �ݳ� ó�� 
				5. �α׾ƿ� �ʱ�޴��� 
		4. �α��ν� ���̵� admin �̸� �����ڸ޴� 
			1. ������� 2.������� 3.��������(����) 4.�α׾ƿ�
				1. ������Ͻ� �������� �Է¹޾� ���� ���ó��
				2. ������Ͻ� ��� ������ ��� 
				3. ���������� ������ �������� �Է¹޾� ������ ������ ����[ null ]
				4. �α׾ƿ��� �ʱ�޴��� 
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2];
		String[][] booklist = new String[100][3];
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("-------���� �뿩---------");
			System.out.println(" 1. ȸ������ 2. �α��� ���� : "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				//ȸ������������
				System.out.println("--------ȸ������ ������---------");
				System.out.println("Member ID : "); String id = scanner.next();
				System.out.println("Member Password : "); String password = scanner.next();
				
				//���̵� �ߺ�üũ [���� ȸ���� id�� �����ϸ� ȸ������ �Ұ�]
				boolean idcheck =true;
				for ( int i = 0; i<memberlist.length; i++ ) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						//i��° �࿡ �Ȱ��� id�� ������
						//i��° �� ���� ������ ���� �Ұ�
						System.err.println(">>> �̹� �����ϴ� ���̵��Դϴ�.");
						idcheck = false;
						break; 
					}//if end
				}//for end
				
				//����
				if(idcheck == true) {//if 1 -> idcheck�� true�� ���� ȸ������
					
					for ( int i = 0; i<memberlist.length; i++ ) {//for1 Ȯ��
						if (memberlist[i][0] == null) {//if2 ����
							//i��° �࿡ id�� ������ (������̸�) 
							memberlist [i][0] =id;
							memberlist [i][1] =password;
							//i��° �� ���� ������ ����
							System.out.println(">>> ȸ������ �Ϸ�");
							break; //���������� ��
						}//if2 end
					}//for1 end
				}//if1 end
		
			}else if ( ch == 2){
				System.out.println("------------�α��� ������----------");
				System.out.println("Member id : "); String id = scanner.next();
				System.out.println("Member password : "); String password = scanner.next();
				
				boolean logincheck = false;
				
				for( int i =0; i<memberlist.length; i++) {
					if( memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][0].equals(password) ) {
						System.out.println(" �α��� ����");
						logincheck = true;
					}
				}
			}
		
			while(true) {
				System.out.println("------------------------");
				System.out.println("--------���� �뿩 ���---------");
				System.out.println(" 1. ���� �˻� 2. ���� ��� 3. ���� �뿩 4. ���� �ݳ� 5. �α׾ƿ� "); int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {	//���� �˻�
					System.out.println("�������� �˻��ϼ��� : ");		String �˻� = scanner.next();
					
					for(int i=0; i<booklist.length; i++) {
						if(booklist[i][0] != null && booklist[i][0].equals(�˻�)) {
							System.err.println("������\t�����뿩����\t�뿩��");
							System.out.println("----------------------");
							System.out.printf("%s\t%s\t%s\n\n", booklist[i][0],booklist[i][1],booklist[i][2]);
							break;
						}//if end
						
						else {
							System.out.println("������ �����ϴ�");
							break;
						}//�������� else end
					}//for end
				}//ch2==1 if end
			}
		
			else if(ch2 == 2) {
					System.out.println(" ������� : "); String ��� = scanner.next();
					System.out.println(" ��ȣ\t������\t�뿩����\t�뿩��");
					for(int i=0; i<booklist.length; i++ ) {
						if(booklist[i][0] !=null && booklist[i][0].equals(���)) {
							System.out.println("\"%d\\t%s\\t%s\\t%s\\n\\n\", j,booklist[j][0],booklist[j][1],booklist[j][2]");
							
						}
					}
				}
		
		
		
			else if( ch2 == 3) {
				System.out.println(" �뿩�� ������ �����Ͻÿ�"); String �뿩 = scanner.next();
				
			}
		
		
		
		
			else if( ch2 == 4) {}
			else if( ch2 == 5) {}
			else {
				System.err.println("�߸��� �Է��Դϴ�");
				break;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} // while ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	

} // c e