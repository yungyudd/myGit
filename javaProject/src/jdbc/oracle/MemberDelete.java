package jdbc.oracle;

import java.util.Scanner;

public class MemberDelete {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print("삭제할 아이디를 입력하세요: ");
		String userid = sc.next();
		sc.close();
		int rows = MemberDAO.memeberDelete(userid);
		if(rows >0) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("삭제 실패");
		}
	}
}
