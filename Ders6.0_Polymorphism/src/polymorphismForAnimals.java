public class polymorphismForAnimals {
	
	public static void animalSpeak(Animals animal) {
		animal.Speak();
	}

	public static void main(String[] args) {
	
		
		
		Animals animal = new Animals("MyAnimal");
		Bird bird = new Bird("Mavi�");
		Dog dog=new Dog("Karaba�");
		
		animal.Speak();
		bird.Speak();
		dog.Speak();
		
		
		Animals kopek =new Dog("Garip Kont");
		kopek.Speak();
		
		
		animalSpeak(new Dog("Ate�"));
		
		

	}
}
