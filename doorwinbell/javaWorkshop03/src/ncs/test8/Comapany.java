package ncs.test8;

public class Comapany {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales", 1200);

		System.out.println("name |" + " departmment |" + " salray |" + " tax ");
		
		for (Employee employee : employees) {
			System.out.println(employee.getName() +"        "+ employee.getDepartment() +"      " + employee.getSalary());
			employee.incentive(100);
		}
		System.out.println("=======================");
		System.out.println("name |" + " departmment |" + " salray |" + " tax ");
		
		for (Employee employee : employees) {
			System.out.println(employee.getName() +"    |    "+ employee.getDepartment() +"   |   " + employee.getSalary() +" | " +employee.tax());
		}
		

	}

}
