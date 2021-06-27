public class Product {
	private String name;
	private int stock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Product(String name, int stock) {
		super();
		this.name = name;
		this.stock = stock;
	}
	

}
