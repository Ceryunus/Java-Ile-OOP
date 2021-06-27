
public abstract class AbstractDatabase {

	public void add() {
		System.out.println("Eklendi .. .. .. ");
	}

	public void delete() {
		System.out.println("Silindi .. .. .. ");
	}

	abstract void get();
	abstract void insert();

}
