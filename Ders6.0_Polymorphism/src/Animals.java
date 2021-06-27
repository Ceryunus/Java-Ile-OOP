class Animals{
	private String name;

	public String getName() {
		return name;
	}
	public String setName(String name) {
		return this.name=name;
	}
	
	public Animals(String name) {
		this.name=name;
	}
	public void Speak() {
		System.out.println(name +" Konuþuyor...");
		
	}
	
}