package Day09;

public class Stundent extends people {

	// 1. �ʵ�
	public int studentNO; // �л���ȣ
	// 2. ������
	public Stundent ( String name , String ssn , 
			int studentNo ) {
		// �θ�Ŭ������ ��� �ʵ� �ʱ�ȭ[���ֱ�]
		// 1. �ʵ忡 ����
		// this.name = name;
		// this.ssn = ssn;
		// 2. �����ڿ� ����
		super(name , ssn);
		this.studentNO =studentNo;
	}
	// 3. �޼ҵ�
}
