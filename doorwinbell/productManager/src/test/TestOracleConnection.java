package test;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestOracleConnection {
	public static void main(String[] args) {
		new TestOracleConnection().dbConnect();
	}

	public void dbConnect() {
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
			prop.load(new FileReader("resources/dbdriver.properties"));
			
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("user"), prop.getProperty("passwd"));
			
			if(conn == null) {
				System.out.println("연결 실패! : " + conn);
			}else { 
				System.out.println("연결 성공! : " + conn);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
