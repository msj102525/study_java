//package practice4;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Properties;
//
//public class TestProperties {
//
//	public static void main(String[] args) {
//		TestProperties ts = new TestProperties();
//		ts.saveFile();
//		ts.readFile();
//	}
//
//	public void saveFile() {
//		Properties prop = new Properties();
//
//		prop.setProperty("driver", "oracle.jdvc.driver.OracleDriver");
//		prop.setProperty("url", "jdbc:oracle:thin@127.0.0.1:1521:xe");
//		prop.setProperty("user", "studendt");
//		prop.setProperty("passwd", "student");
//
//		try {
//			prop.store(new FileOutputStream("db_setting.dat"), "jdbc_oracle_connection_setting");
//			prop.store(new FileWriter("db_setting.txt"), "jdbc_oracle_connection_setting");
//			prop.storeToXML(new FileOutputStream("db_setting.xml"), "jdbc_oracle_connection_setting", "utf-8");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Student[] readFile() {
//		Properties properties = new Properties();
//		try (FileInputStream fis = new FileInputStream("score.txt")) {
//			properties.load(fis);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		String[] snoArray = properties.getProperty("sno").split(", ");
//		String[] snameArray = properties.getProperty("sname").split(", ");
//		String[] korArray = properties.getProperty("kor").split(", ");
//		String[] engArray = properties.getProperty("eng").split(", ");
//		String[] matArray = properties.getProperty("mat").split(", ");
//
//		Student[] students = new Student[snoArray.length];
//		for (int i = 0; i < snoArray.length; i++) {
//			int sno = Integer.parseInt(snoArray[i]);
//			String sname = snameArray[i];
//			int kor = Integer.parseInt(korArray[i]);
//			int eng = Integer.parseInt(engArray[i]);
//			int mat = Integer.parseInt(matArray[i]);
//			int tot = kor + eng + mat;
//			int avg = tot / 3;
//
//			students[i] = new Student(sno, sname, kor, eng, mat, tot, avg);
//		}
//		return students;
//	}
//
//	public void printConsole(Student[] sr) {
//		for (Student student : sr) {
//			System.out.println(student);
//		}
//
//		int korSum = 0, engSum = 0, matSum = 0;
//		for (Student student : sr) {
//			korSum += student.getKor();
//			engSum += student.getEng();
//			matSum += student.getMat();
//		}
//
//		System.out.println("국어 합계: " + korSum);
//		System.out.println("영어 합계: " + engSum);
//		System.out.println("수학 합계: " + matSum);
//
//		double korAvg = (double) korSum / sr.length;
//		double engAvg = (double) engSum / sr.length;
//		double matAvg = (double) matSum / sr.length;
//
//		System.out.println("국어 평균: " + korAvg);
//		System.out.println("영어 평균: " + engAvg);
//		System.out.println("수학 평균: " + matAvg);
//	}
//
//	public void saveXMLFile(Student[] sr) {
//		// XML 파일에 저장하는 로직을 구현
//		// 여기서는 단순 출력으로 대체
//		System.out.println("Saving to XML file...");
//		for (Student student : sr) {
//			System.out.println(student);
//		}
//	}
//}
