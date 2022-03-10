package Day05;

import java.util.Scanner;

public class Day05_04 { // c s
	
	public static void main(String[] args) { // m s
		
		/*
		사용문법 1. 입출력 2.변수/자료형/연산  3.제어/반복 4.제어/반복 5.배열
		* 도서 대여 console 프로그램
		1. 배열 변수
			1. 회원 [ 아이디(중복x) , 비밀번호 ]
			2. 도서 [ 도서명(중복x) , 도서대여여부(대여가능,대여중) , 대여인(로그인시 아이디) ]
		2. 초기메뉴
			1.회원가입 2.로그인 
				1.회원가입시 아이디 중복체크 
				2.로그인 성공시 로그인메뉴 , 로그인 실패시 로그인실패 출력 
		3. 로그인시 메뉴 
			1. 도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃
	 			1. 도서검색시 도서명이 일치하면 도서명과 도서대여여부 출력
				2. 도서목록시 모든 도서명 출력 
				3. 도서대여시 도서대여여부가 가능할때 도서대여 처리
				4. 도서반납시 본인이 대여한 도서만 반납 처리 
				5. 로그아웃 초기메뉴로 
		4. 로그인시 아이디가 admin 이면 관리자메뉴 
			1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃
				1. 도서등록시 도서명을 입력받아 도서 등록처리
				2. 도서목록시 모든 도서명 출력 
				3. 도서삭제시 삭제할 도서명을 입력받아 동일한 도서명 삭제[ null ]
				4. 로그아웃시 초기메뉴로 
		*/
		
		
		Scanner scanner = new Scanner(System.in);
		String[][] memberlist = new String[100][2];
		String[][] booklist = new String[100][3];
		
		while(true) {
			System.out.println("------------------------");
			System.out.println("-------도서 대여---------");
			System.out.println(" 1. 회원가입 2. 로그인 선택 : "); int ch = scanner.nextInt();
			
			if (ch == 1) {
				//회원가입페이지
				System.out.println("--------회원가입 페이지---------");
				System.out.println("Member ID : "); String id = scanner.next();
				System.out.println("Member Password : "); String password = scanner.next();
				
				//아이디 중복체크 [기존 회원의 id와 동일하면 회원가입 불가]
				boolean idcheck =true;
				for ( int i = 0; i<memberlist.length; i++ ) {
					if (memberlist[i][0] != null && memberlist[i][0].equals(id)) {
						//i번째 행에 똑같은 id가 있으면
						//i번째 각 열에 데이터 저장 불가
						System.err.println(">>> 이미 존재하는 아이디입니다.");
						idcheck = false;
						break; 
					}//if end
				}//for end
				
				//저장
				if(idcheck == true) {//if 1 -> idcheck가 true일 때만 회원가입
					
					for ( int i = 0; i<memberlist.length; i++ ) {//for1 확인
						if (memberlist[i][0] == null) {//if2 저장
							//i번째 행에 id가 없으면 (빈공간이면) 
							memberlist [i][0] =id;
							memberlist [i][1] =password;
							//i번째 각 열에 데이터 저장
							System.out.println(">>> 회원가입 완료");
							break; //저장했으면 끝
						}//if2 end
					}//for1 end
				}//if1 end
		
			}else if ( ch == 2){
				System.out.println("------------로그인 페이지----------");
				System.out.println("Member id : "); String id = scanner.next();
				System.out.println("Member password : "); String password = scanner.next();
				
				boolean logincheck = false;
				
				for( int i =0; i<memberlist.length; i++) {
					if( memberlist[i][0] != null && memberlist[i][0].equals(id) && memberlist[i][0].equals(password) ) {
						System.out.println(" 로그인 성공");
						logincheck = true;
					}
				}
			}
		
			while(true) {
				System.out.println("------------------------");
				System.out.println("--------도서 대여 목록---------");
				System.out.println(" 1. 도서 검색 2. 도서 목록 3. 도서 대여 4. 도서 반납 5. 로그아웃 "); int ch2 = scanner.nextInt();
				
				if(ch2 == 1) {	//도서 검색
					System.out.println("도서명을 검색하세요 : ");		String 검색 = scanner.next();
					
					for(int i=0; i<booklist.length; i++) {
						if(booklist[i][0] != null && booklist[i][0].equals(검색)) {
							System.err.println("도서명\t도서대여여부\t대여자");
							System.out.println("----------------------");
							System.out.printf("%s\t%s\t%s\n\n", booklist[i][0],booklist[i][1],booklist[i][2]);
							break;
						}//if end
						
						else {
							System.out.println("도서가 없습니다");
							break;
						}//도서없음 else end
					}//for end
				}//ch2==1 if end
			}
		
			else if(ch2 == 2) {
					System.out.println(" 도서목록 : "); String 목록 = scanner.next();
					System.out.println(" 번호\t도서명\t대여여부\t대여자");
					for(int i=0; i<booklist.length; i++ ) {
						if(booklist[i][0] !=null && booklist[i][0].equals(목록)) {
							System.out.println("\"%d\\t%s\\t%s\\t%s\\n\\n\", j,booklist[j][0],booklist[j][1],booklist[j][2]");
							
						}
					}
				}
		
		
		
			else if( ch2 == 3) {
				System.out.println(" 대여할 도서를 선택하시오"); String 대여 = scanner.next();
				
			}
		
		
		
		
			else if( ch2 == 4) {}
			else if( ch2 == 5) {}
			else {
				System.err.println("잘못된 입력입니다");
				break;
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		} // while 종료
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // m e
	

} // c e