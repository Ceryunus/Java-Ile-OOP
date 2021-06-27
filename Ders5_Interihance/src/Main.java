public class Main {
	
	public static void main(String[] args) {

	Employee employee =new Employee("Yunus","bilisim", 0);
	employee.ShowInfos();
	InheritEmployee employee2 = new InheritEmployee("Emre","Programlama",0);
	employee2.ShowInfos();
	employee2.riseSalary(552);
	System.out.println(employee2.getSalary());

	
	}
}
