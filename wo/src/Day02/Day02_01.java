// Ȯ����� ctrl + shifr+ (+) (-)
// �׸� , ��Ʈ ���� ����
// �ּ�ó��[ �ڵ� ���� ] 1. // 2. /*   */

package Day02; // ��Ű���̸�

public class Day02_01 { // Ŭ���� ����
	
	// 1. ��� �ڵ��ۼ��� Ŭ���� {} �ȿ��� �ۼ��Ѵ�.
	// 2. ������ �ڵ�� main �Լ� {} �ȿ��� �ۼ��Ѵ�. [ ������ : �ڵ� �о��ִ� ��� ]
	// 3. �ڵ��ϼ� : 1~3���� ��Ʈ�� + �����̽��� 
	// 4 .{ } �ȿ��� tab
	
	// �޸� : ��ǻ�� �����ϴ� ���� [ RAM ] : �ڿ�
	
	//����
		//1. ������ 1�� �����ϴ� �޸� ���� [ ������� ]
		//2 . ���� ���� [ �ڷ��� ������ ; ]
		//3. ���� �ʱ�ȭ(ó����) [ �ڷ��� ������ = ������; ]
		//4. ���� ȣ�� [ ������ ]
	// �뷬 ����
		// 0 Ȥ�� 1 -> 1��Ʈ
		// 01010101 -> 8��Ʈ -> 1����Ʈ
		// 1024����Ʈ -> kb -> 1024kb -> 1mb -> 1024mb -> 1gb
	
	// �ڷ���	
		// 1. �޸� �Ʋ�����
		// boolean : 1��Ʈ : �� , ����
		// char : 2����Ʈ 	: ���� 1�� [ �ƽ�Ű�ڵ�(c���) -> �����ڵ�(java)
		// byte : 1����Ʈ		: ���� +-128
		// short : 2����Ʈ	: ���� +-3������
		// int : 4����Ʈ		: ���� +-20������
		// iong : 8����Ʈ		: ���� +-20���̻�
		// float : 4����Ʈ	: �Ǽ�(�Ҽ���) 8�ڸ� ǥ�� ����
 		// double : 8 ����Ʈ : �Ǽ�(�Ҽ���) 18�ڸ� ǥ�� ����
	
	public static void main(String[] args) {
	
		//P.35 ����1
		int value = 10; // 1. ���� ����� �ʱ�ȭ
		//  int : +-20�������� �����͸� �����Ҽ� �ִ� ����
			// value[�ƹ��ų�] : ������ �̸� ( �����ڰ� �����ϱ� ���ؼ� )
				// = : ������ �����Ͱ� �������� ����[����]
		// * ����  10�� int�� value ������ ����
		int result = value +10;
		// int : +-20�������� �����͸� �����Ҽ� �ִ� ����
			// reult[�ƹ��ų�] : ������ �̸�
				// ����ȣ��[�ҷ�����] + 10
				// 10+ 10
		
		System.out.println(result); // ����Լ�( ������ )
	}

} // Ŭ���� �� 