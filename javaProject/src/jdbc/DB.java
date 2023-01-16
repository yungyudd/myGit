package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	public static Connection oraConn() {
		Connection conn = null;
		try {
			FileInputStream fis = new FileInputStream("C:\\driver\\oracle.prop");
			//key와 value를 세트로 저장
			Properties pro = new Properties();
			pro.load(fis);
			String url = pro.getProperty("url");
			String id = pro.getProperty("id");
			String passwd = pro.getProperty("pwd");
			//DB접속
			conn = DriverManager.getConnection(url, id, passwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

}
