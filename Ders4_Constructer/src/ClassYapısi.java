public class ClassYapısi {
	public static void main(String[] args) {

		// bir önceki derste kinden daha kolay bir şekilde objeyi tanımlayabilmek icin
		// constructer kullanılır ve işlevsellik kazanılınır.
		Car car1 = new Car("Kirmizi","Toyota Yaris",1.2,4);
		car1.ShowInfo();
		Car car2 =new Car();
		car2.ShowInfo();

	}

}
