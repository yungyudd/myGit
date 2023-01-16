package jdbc.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.DB;

//DAO (Data Access Object)
public class MemberDAO {
	//회원정보 삭제
	public static int memeberDelete(String userid) {
		Connection conn = null;
		PreparedStatement pst = null;
		int rows=0;
		try {
			conn = DB.oraConn();
			String sql = "delete from member where userid = ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, userid);
			rows = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pst != null) pst.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return rows;
	}

}
