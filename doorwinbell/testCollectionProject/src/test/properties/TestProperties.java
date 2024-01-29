package test.properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		// Properties 사용 테스트
		// 어플리케이션의 설정 값들을 파일에 저장하고, 실행시 읽어들여서 프로그램에 적용하는 용도로 주로 사용함
		Properties prop = new Properties();
		
		prop.setProperty("driver", "oracle.jdvc.driver.OracleDriver");
		prop.setProperty("url", "jdbc:oracle:thin@127.0.0.1:1521:xe");
		prop.setProperty("user", "studendt");
		prop.setProperty("passwd", "student");
		
		System.out.println(prop);
		
		// 파일에 출력 저장
		try {
			prop.store(new FileOutputStream("db_setting.dat"), "jdbc_oracle_connection_setting");
			prop.store(new FileWriter("db_setting.txt"), "jdbc_oracle_connection_setting");
			prop.storeToXML(new FileOutputStream("db_setting.xml"),"jdbc_oracle_connection_setting","utf-8");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
