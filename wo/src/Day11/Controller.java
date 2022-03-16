package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class Controller {
	// 0. 게시물 리스트 [ 모든 게시물을 담는 리스트 ]
	public static ArrayList<Board> boadList = 
			new ArrayList<>();
	
	// 모든 메소드는 static
	
	
	// 1.쓰기메소드
	public static void write(String 제목 , String 내용 , String 작성자 , String 비밀번호 ) {
		// 1. 객체화 [ 변수가 4개 ---> 1개 객체 ]
		Board board = new Board(제목 , 내용 , 비밀번호 , 작성자);
		// 2. 리스트에 저장
		boadList.add(board);
		// 3. 파일에저장
		save();
	}
	// 2.수정메소드
	public static boolean update( int index , String password , String title , String content ) {
		if( password.equals(boadList.get(index).getPassword() ) ) {
			// 패스워드가 동일하면 수정처리
			boadList.get(index).setTitle(title);
			boadList.get(index).setContent(content);
			save(); // 파일 업데이트
			return true;
		}else {
			return false; 
		}
			
	}
								
	// 3.삭제메소드				// 현게시물번호[인덱스] 현게시물패스워드
	public static boolean delete( int index , String password) {
		if( password.equals(boadList.get(index).getPassword() ) ) {
		// 입력받은패스워드 와 해당 인덱스 게시물번호의 패스워드 동일하면
			boadList.remove(index); // 리스트.add(객체) : 추가 리스트.get(인덱스) : 호출 리스트.remove(인덱스) : 삭제
			save(); // 파일내에서 삭제된 리스트 업데이트
			return true; // 삭제가 성공했으면
		}else {
			return false; // 삭제가 실패했으면
		}
		
	}
	// 4.댓글쓰기메소드
	public static void replytwrite() {}
	// 5.게시물저장메소드
	public static void save() { // 리스트내 모든 게시물을 파일에 저장
		try {
		// 1. 파일출력 클래스
		FileOutputStream outputStream = new FileOutputStream("D:/java/게시물파일.txt");
		// 2. 파일에 작성할 내용 [ 리스트내 객체 1개씩 = 한줄씩 = 게시물 1개씩 = 객체 1개씩 ]
		for( Board board : boadList ) { // , : 필드구분용     \n : 객체구분용
			String 작성내용 = board.getTitle() +","+board.getContent()+","+
					board.getPassword()+","+board.getWriter()+","+
					board.getViewcount()+","+board.getDate()+"\n";
			
			// 3. 내용[문자열] -> 바이트열 변환  [ 외부통신(스트림) : 통신단위 : 바이트 ]
		outputStream.write( 작성내용.getBytes() ); // 4. 내보내기 [ write() ]
		}
		
	}
		catch( Exception e ) { System.out.println(" 알림]] 파일저장 실패( 관리자에게 문의)"); } 
	}
	// 8.게시물불러오기메소드 [ 프로그램 시작 ] 파일 ---> 리스트
	public static void load() {
		try {
		FileInputStream inputStream = new FileInputStream("D:/java/게시물파일.txt"); // 1. 파일입력클래스
		byte[] bytes = new byte[1000]; // 2. 바이트배열 선언
		inputStream.read(bytes); // 3. 모든 바이트 읽어와서 바이트에 저장
		String file = new String(bytes); // 4. 바이트 -> 문자열 변환
		String[] boards = file.split("\n"); // 5. 문자열 자르기 [ 한줄씩 [ \n ] -> 1개객체 ]
		int i =0;
		for( String temp : boards ){ // 배열내 문자열 하나씩 꺼내기
			if( i+1 == boards.length) break;
			String[] field = temp.split(",");// 6. 문자열 자르기 [ 한줄 [,] -> 각필드 ]
			Board board = new Board( field[0], field[1],
					field[2], field[3], Integer.parseInt(field[4]),field[5], null); // 7. 객체와
			boadList.add(board);// 8. 리스트 담기 
		}
	}catch( Exception e ) { System.err.println(" 알림]] 파일로드 실패( 관리자에게문의 )" + e); }
	
}
}
