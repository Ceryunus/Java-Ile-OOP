public class ClassYap�si {
	public static void main(String[] args) {

		Car car1 = new Car();
		// Private olan fields i getter ve setter methodu kullanarak anack eri�ebiliyoruz :S
		// buna encapsilatoun diyoruz direk tolarak eri�emiyoruz ��nk� ba�ka programc�lar bizim tan�mlad���m�z
		// class �n �zelliklreini bilmek zorunda de�il �rnek olarak kap� say�s� tek tek sayi olamamal� diyebilmek icin
		// mecburen bu alan� private yap�p set door fonksiyonunun icine if blo�u ile
		// bunu engelleyebilriz ve daha d�zenli bir kod yazm�� oluruz !
		car1.setColor("G�m��");
		car1.setDoors(3);
		car1.setEngine(1.6);
		car1.setModel("Renault Megane");
		System.out.println(car1.getColor());
		car1.start();
		car1.stop();

	}

}
