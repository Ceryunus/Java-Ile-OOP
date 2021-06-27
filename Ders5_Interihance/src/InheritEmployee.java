
public class InheritEmployee extends Employee{
	
	
	
	private int amount;
	public InheritEmployee(String name, String departman, int salary) {
		super(name, departman, salary);
		
	}
	public void riseSalary(int amount) {
		this.amount=amount;
		int salary=getSalary();
		setSalary(salary+this.amount);
		System.out.println("Yapýlan zam : "+ this.amount);
		System.out.println("Güncel maaþ : "+ getSalary());
	}
	

}
