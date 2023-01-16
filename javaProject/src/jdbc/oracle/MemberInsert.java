package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import jdbc.DB;

public class MemberInsert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = DB.oraConn();
			Scanner sc = new Scanner(System.in);
			System.out.println("아이디: ");
			String userid = sc.next();
			System.out.println("비번: ");
			String passwd = sc.next();
			System.out.println("이름: ");
			String name = sc.next();
			sc.close();
			String sql = "insert into memeber (userid,passwd,name) values"+ "(?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, userid);
			pst.setString(2, passwd);
			pst.setString(3, name);
			pst.executeUpdate(); //insert,update,delete
			System.out.println("저장되었습니다.");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pst != null) pst.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}try {
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
