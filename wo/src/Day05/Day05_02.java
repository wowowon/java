package Day05;

import java.util.Scanner;

public class Day05_02 { // c s

	
	public static void main(String[] args) { // m s

		
		// 회원제 방문록 프로그램 [ 2차원배열 ]
			// 1. 초기메뉴 [ 1. 회원가입 2. 로그인 ]
					// 1. 회원가입 [ 아이디 , 비밀번호 , 이름 ]
					// 2. [ 아이디 , 비밀번호 동일하면 로그인 성공 ]
			// 2. 로그인 성공 시 메뉴 [ 1. 방문록 쓰기 2. 로그아웃 ]
					// 1 . 방문록쓰기 [ 제목 , 내용 , 작성자(로그인 된 아이디 ) ]
					// 2. 로그아웃 [ 초기메뉴로 돌아가기 ] 
		
		// 준비
		Scanner scanner = new Scanner(System.in); // 입력객체
				// 회원 100명 [id , pw , name ] 저장 배열
		String[][] memberlist = new String[100][3]; // 100행 3열 => 회원당 1행 저장 1열 id 2열 pw 3열 name
		// 방문록 100개[title,contents,writer] 저장 배열
		String[][] boardlist = new String[100][3]; // 게시물당 1행
		
		// 무한루프 [종료x]
		while(true) { // while start
			
			
			System.out.println("---------회원제 방문록---------- ");
			System.out.println("--------------------------------");
			System.out.println(" 1. 회원가입 2. 로그인");
			System.out.println("선텍 : "); int ch = scanner.nextInt();
			
			if( ch == 1 ) { // 회원가입
				System.out.println("-----------회원가입---------");
				System.out.println(" 아이디 입력 : "); String id = scanner.next();
				System.out.println(" 비밀번호 입력 : "); String pw = scanner.next();
				System.out.println(" 이름 입력 : "); String name = scanner.next();
				// String 3개 변수를 입력받아 memberlist 배열에 저장
					// 1. 빈 공간[정수 = 0실수 = 0.0 객체 = nu11]을 찾아 저장. 빈 공간이 없으면 회원 수 초과
					// 2. 아이디 중복체크
				boolean idcheck = true;
				for(int d = 0; d<memberlist.length; d++) {
					if (memberlist[d][0] != null &&memberlist[d][0].equals(id)) {
						System.out.println(" id 중복. 재입력 ");
						idcheck = false; // 저장 안되게 false로 변경
						break;
					}
					if (idcheck == true) {
						for( int i = 0; i<memberlist.length; i++) {
							if(memberlist[i][0] == null) { // i번째 행 id가 비어있으면
								memberlist[i][0] = id;
								memberlist[i][1] = pw;
								memberlist[i][2] = name;
								
						break;
					} //if 2 end

						} // for2 end
						
					} // if end
				} //for end
				System.out.println("회원가입 완료");
			}// if end
			else if( ch == 2 ) {
				System.out.println("-------- 로그인 페이지 ---------");
				System.out.print(" MEMBER ID : "); 			String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : "); 	String password = scanner.next();
				
				boolean logincheck = false; // 로그인 성공 초기값 
				for( int i =0 ; i<memberlist.length ; i++ ) { // 배열내 데이터가 입력받은 id와 password가 동일하면 로그인처리
					
					if( memberlist[i][0] !=null && memberlist[i][0].equals( id ) &&
							memberlist[i][1].equals(password) ) { // i번째 행에 id와 password 가 입력받은 값과 equals 같으면
							// null 은 객체가 아니기 때문에 equals 가 불가능 => == 가능
						System.err.println(" 알림]] 로그인 성공 ");
						logincheck = true; // 로그인 성공 값 저장 
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 로그인 성공시 코드 					
						while(true) { // 로그인시 메뉴 무한루프 [ 종료 : 로그아웃 ] 
							System.out.println("------------------------");
							System.out.println("--------- 방문록 ---------");
							System.out.println("번호\t작성자\t제목\t내용");
								// 모든 방문록 출력 
								for( int j = 0 ; j<boardlist.length ; j++  ) { // 게시물 배열 반복문 처리 
									if( boardlist[j][0] != null ) { // 게시물이 없는 인덱스는 제외 
										System.out.printf("%d\t%s\t%s\t%s \n" , 
												j , 
												boardlist[j][2] , 
												boardlist[j][0] , 
												boardlist[j][1] );
									}
								}
							System.out.print("1.방문록남기기 2.로그아웃 선택 : "); int ch2 = scanner.nextInt();
							
							if( ch2 == 1 ) {
								System.out.println("-------------- 글쓰기 -------------");
								System.out.print(" title : ");		String title = scanner.next(); // 제목 
								System.out.print(" content : ");	String content = scanner.next(); // 네용 
								// 저장 
								for( int j = 0 ; j<boardlist.length ; j++ ) {
									if( boardlist[j][0] == null  ) { // 배열내 j번째 인덱스 게시물이 공백이면
										boardlist[j][0] = title;
										boardlist[j][1] = content;
										boardlist[j][2] = id; // 로그인시 사용된 id를 대입
										System.err.println(" 알림]] 방문록이 작성되었습니다.");
										break;
									}
								}
							}
							else if( ch2 == 2 ) {
								System.err.println(" 알림]] 로그아웃 ");
								break; // 가장 가까운 반복문 탈출 [ 로그인시 메뉴 while 탈출 ]
							}
							else { System.err.println(" 알림]] 알수 없는 번호입니다.!!"); }
							
						} // 회원 메뉴 while end 
						
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	로그인 성공시 코드 end 
						
					} // if end = login end  
				} // for end 
				// 로그인시 실패시
				if( logincheck == false ) System.err.println(" 알림]] 회원정보가 없거나 다릅니다.");
				
			} // ch==2 if end 
			else { System.err.println(" 알림]] 알수 없는 번호입니다.!!"); }
			
		} // while 1 end = 초기 메뉴 end 
	} // m e 
} // c e 

