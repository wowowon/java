package Day09;

public class Cellphone { // Ŭ���� ����

	// 1. �ʵ�
	String model;
	String color;
	// 2. ������
	
	// 3. �޼ҵ� [ void : ��ȯŸ�Ծ��� ( return ��������) ]
	void poweron() {System.out.println(" ������ �մϴ�");}
// ��ȯŸ�� �޼ҵ��(�μ�){�����ڵ�} // �μ�x��ȯx
	void poweroff() {System.out.println(" ������ ���ϴ�.");}
	void bell() {System.out.println(" ���� �︳�ϴ�.");}
	void sendVoice(String message) {System.out.println(" �ڱ� : " + message);}
// ��ȯx �޼ҵ�� ( �μ�o ) { } // �μ�o ��ȯx
	void receiverVoice( String message ) {System.out.println(" ���� : " + message);}
	void hangup() {System.out.println(" ��ȭ�� �����ϴ�. ");}































}

