package Day09;

public class Car {

	// 1. �ʵ� [ ���� , ��ü , �������� ]
	Tire frontLeftTire = new Tire("�տ���" , 6);
	Tire frontRightTire = new Tire("�տ�����" , 2);
	Tire backLeftTire = new Tire("�ڿ���" , 3);
	Tire backLRightTire = new Tire("�ڿ�����" , 4);
// Ŭ������ ��ü�� = new ������ ( ŸƼ����ġ , Ÿ�̾� ����);	
	// 2. ������
	
	// 3. �޼ҵ�
	int run() { // �ڵ��� ȸ�� [ ��� Ÿ�̾ü�� 1ȸ�� ȸ�� ] �޼ҵ�
		System.out.println(" �ڵ����� �޸��ϴ�");
		if( frontLeftTire.roll() == false ) { stop(); return 1; }
		// Ÿ�̾ ȸ���� �ߴµ�  �����  false  �̸� ��ũ
		// true �̸� ���� ����
		if( frontRightTire.roll() == false ) { stop(); return 2; }
		if( backLeftTire.roll() == false ) { stop(); return 3; }
		if( backLRightTire.roll() == false ) { stop(); return 4; }
		return 0;
	}
	//
	void stop() {
		System.out.println(" �ڵ����� ����ϴ�. ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}