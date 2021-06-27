public class Dog extends Animals {
	public Dog(String name) {
		super(name);
	}
	@Override
	public void Speak() {
		System.out.println(getName()+" Havlýyor...");
	}
	
	
	
}
