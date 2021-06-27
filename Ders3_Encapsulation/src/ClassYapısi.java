public class ClassYapýsi {
	public static void main(String[] args) {

		Car car1 = new Car();
		// Private olan fields i getter ve setter methodu kullanarak anack eriþebiliyoruz :S
		// buna encapsilatoun diyoruz direk tolarak eriþemiyoruz çünkü baþka programcýlar bizim tanýmladýðýmýz
		// class ýn özelliklreini bilmek zorunda deðil örnek olarak kapý sayýsý tek tek sayi olamamalý diyebilmek icin
		// mecburen bu alaný private yapýp set door fonksiyonunun icine if bloðu ile
		// bunu engelleyebilriz ve daha düzenli bir kod yazmýþ oluruz !
		car1.setColor("Gümüþ");
		car1.setDoors(3);
		car1.setEngine(1.6);
		car1.setModel("Renault Megane");
		System.out.println(car1.getColor());
		car1.start();
		car1.stop();

	}

}
