package Final;

public class Pen {
	String brand;
	String color;
	int price;
	public Pen(String brand,String color,int price)
	{
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
public String toString() {
	return "Brand="+brand+"Color="+color+"price="+price;
			
}
}
