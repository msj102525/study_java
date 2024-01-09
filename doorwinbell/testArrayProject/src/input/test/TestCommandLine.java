package input.test;

public class TestCommandLine {

	public static void main(String[] args) {
		//

		if (args.length == 5) {
			String name = args[0];
			char gender = args[1].charAt(0);
			int age = Integer.parseInt(args[2]);
			double height = Double.parseDouble(args[3]);
			double weight = Double.parseDouble(args[4]);
			
			System.out.println(name);
			System.out.println(gender);
			System.out.println(age);
			System.out.println(height);
			System.out.println(weight);.
		}else {
			System.out.println("전달값 부족");
		}

		
	}

}
