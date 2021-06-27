public class Car {
	// Fields Prooerties : Arabanýn Özellikeri
	private String color;
	private String model;
	private double engine;
	private int doors;

	public void setColor(String color) {
		this.color = color;

	}

	public String getColor() {
		return this.color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getEngine() {
		return engine;
	}

	public void setEngine(double engine) {
		this.engine = engine;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		if (doors==2 || doors==4) {
			this.doors = doors;
		}
		else {
			System.out.println("Kapý sayisi 2 veya 4 olabilir");
		}
	}

	public void start() {

		System.out.println(this.model + " modelli araç çalýþtý");

	}

	public void stop() {

		System.out.println(this.model + " modelli araç durduruldu");
	}

}
