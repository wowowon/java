package Day09;

public class Day09_02 {

	
	public static void main(String[] args) {
		
		// ���
			// �θ𿡰� �����޴°�
			// ���� : �θ�-> �ڽ� ���� // ���α׷��� : �ڽ�----> �θ� ����
			// extends : �����ϴ� [ ����ϴ� ] 
			// ���� : ���� ���� [ ���� �ִ� Ŭ������ �����ؼ� ���ο� Ŭ���� ���� ]
			// �θ�Ŭ���� 1�� ���� / �ڽ��� ������ ����
		
		// p. 290 ~ 292 ����
		// 1. ����Ŭ������ ��ü ����
		DmbCellphone dmbCellphone = new DmbCellphone("�ڹ���", "����", 10);
		
		// 2. ����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�ʵ�]����
		System.out.println(" �� : " + dmbCellphone.model);
		System.out.println(" ���� : " + dmbCellphone.color);
		
		// 3. ����Ŭ������ ������� ��ü�� ���� �������
		System.out.println(" ä�� : " + dmbCellphone.channel);
		
		// 4. ����Ŭ������ ������� ��ü�� ����Ŭ������ ���[�޼ҵ�]����
		dmbCellphone.poweron(); // ����Ŭ������ ����� �޼ҵ� [ ȣ�� ���� ]
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiverVoice("�ȳ��ϼ���! ���� ȫ�浿�Դϴ�.");
		dmbCellphone.sendVoice(" ��~~ �� �ݰ����ϴ�.");
		dmbCellphone.hangup();
		
		// 5. ����Ŭ������ ������� ��ü�� ���� �������
		dmbCellphone.turnonDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
