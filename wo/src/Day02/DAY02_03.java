package Day02;

import java.util.Scanner;

public class DAY02_03 { // c s
	public static void main(String[] args) { // m s
		// * �Է� -> ���� -> ��� -> ���
		// 1 . �Է� ��ü �����. [ �ڷ��� �ҹ��� , Ŭ������ �빮�� ] 
		Scanner scanner = new Scanner(System.in);
		
		// 2 . �Է¹��� ���� ������ �����Ѵ�. [ �Է°�ü�� �Է¹��������� ���� �����Ͱ� ����� ]
		System.out.println("�⺻�� �Է� : ");		
		int �⺻�� = scanner.nextInt();		// �Է°�ü��.nextint() : int�� ������ ��������
											//�Է°�ü��.next() : ���ڿ� ������ ��������
		System.out.println("���� �Է� :");			
		int ���� = scanner.nextInt();
		// 3. ������ ����(���) �Ѵ�
		int ���� = (int)(�⺻��*0.1);	//	int*double �Ŀ� int������ ��ȯ ������ȯ(ĳ����)
		int �Ǽ��ɾ� = �⺻�� + ���� - ����;	// 100% : 1	10% : 0.1
		
		// 4 . ����Ѵ�.
		System.out.println("ȸ������ �Ǽ��ɾ� : " + �Ǽ��ɾ� );
						//		���ڿ�		+ ������ ( ������ ������ ȣ�� )
						// + : 1. ���Ῥ���� ��� 2.���ϱ� ���
	} // m e
} // c e
