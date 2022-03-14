package Day09;

public class Stundent extends people {

	// 1. 필드
	public int studentNO; // 학생번호
	// 2. 생성자
	public Stundent ( String name , String ssn , 
			int studentNo ) {
		// 부모클래스내 멤버 필드 초기화[값넣기]
		// 1. 필드에 접근
		// this.name = name;
		// this.ssn = ssn;
		// 2. 생성자에 접근
		super(name , ssn);
		this.studentNO =studentNo;
	}
	// 3. 메소드
}
