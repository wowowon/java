package Day07;

import javax.print.DocFlavor.STRING;

public class Book {

	
	// 1. �ʵ�
	String ISBN;	// ISBN [������ = �ĺ��� ] 
	String bname;	// ������
	String bwriter;	// �۰�
	boolean brental;	// �����뿩����
	String mid; // �뿩�� ID
	
	// 2. ������
		// 1. �������[�⺻������] : �޼ҵ�ȣ���
	public Book() {}
		// 2. ������[����ʵ�޴»�����] : �������

	public Book(String iSBN, String bname, String bwriter, boolean brental, String mid) {
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brental = brental;
		this.mid = mid;
	}
	
	// 3. �޼ҵ�
		// 1.�����˻�
	void �����˻�() {
		
		}
	
		// 2.�������
	void �������() {
		System.out.println("---------------������� ������---------------");
		System.out.println("ISBN\t������\t�ۻ�\t�뿩���ɿ���");
		for( Book temp : Day07_05_BookApplication.books) {
			if(temp != null) { // ������ �����ϸ�
			if (temp.brental ) // �ش絵���� �����뿩���ΰ� true �̸�
				System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩����" );
			else // �ش絵���� �����뿩���ΰ� false 
				System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩��" );
			}
		  }
		}
		
		// 3.�����뿩
	void �����뿩( String loginid) {
		System.out.println("---------------�����뿩 ������---------------");
		System.out.println(" ���� ISBN : "); String isbn = Day07_05_BookApplication.scanner.next();
		for( Book temp : Day07_05_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn) && temp.brental ) {
				System.out.println(" �˸�)) �ش� ���� �뿩�� �����մϴ�.");
			}else {
				System.out.println(" �˸�)) �ش絵�� �뿩�� �����Դϴ� . [ �뿩�Ұ� ]");
				return;
			}
		} 
	}

		// 4.�����ݳ�
	void �����ݳ�() {
		System.out.println("---------------�����ݳ� ������---------------");
		�����뿩���( loginid );
		System.out.println(" ���� ISBN "); String isbn = Day07_05_BookApplication.scanner.next();
	}
		// * ���� �α��� �� ȸ���� �뿩���� ���� ���
	void �����뿩���( String loginid ) {
		System.out.println("---------------������� ������---------------");
		System.out.println("ISBN\t������\t�ۻ�\t�뿩���ɿ���");
		for( Book temp : Day07_05_BookApplication.books) {
			
			if( temp != null && temp.mid.equals(loginid)) 
					System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩����" );
				
	  }
	}
		// 5.�������
	void �������() {
		System.out.println("---------------������� ������---------------");
		// 1.�Է¹޾�
		System.out.println(" iSBN :"); String isbn = Day07_05_BookApplication.scanner.next();
		System.out.println(" ������ : "); String bname = Day07_05_BookApplication.scanner.next();
		System.out.println(" �۰� : "); String bwriter = Day07_05_BookApplication.scanner.next();
		
		//*�ߺ�üũ[isbn]
				for( Book temp : Day07_05_BookApplication.books ) {
					if(  temp !=null && temp.ISBN.equals(isbn) ) {
						System.out.println(" �˸�]] ���� ������� ISBN �Դϴ�. [ ��Ͻ��� ]");
						return; // ������� �޼ҵ� ���� ( ��Ͻ��� )
					}
				}
		
		// 2.��üȭ [ �����뿩���� = true , �뿩ȸ�� = null ]
		Book book = new Book(isbn, bname, bwriter, true , null );
		// 3. �迭 ����[�ֱ�]
		int i =0; // �ݺ�Ƚ�� [ �ε��� ]
		for( Book temp : Day07_05_BookApplication.books ) {
			if(temp == null) {
				Day07_05_BookApplication.books[i]=book;
				System.out.println(" �˸�)) ��������� �Ǿ����ϴ�. ");
				return; // ������� �޼ҵ� ���� (��ϼ���)
			}
			i++; // �ε��� ����
		}
	}
		// 6.��������
	void ��������() {
		System.out.println("---------------�������� ������---------------");
	}
}