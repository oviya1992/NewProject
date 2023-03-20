package Final;

public class Bike {
	private String brand;
	private String color;
	private int price;
	public Bike(String brand,String color,int price) {
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	public String toString() {
		return "Brand="+brand+"Color="+color+"price="+price;
	}
	
}
