package Final;

public class Bajaj extends Bike {
	private String model;
	private int bikeno;
	public Bajaj(String brand,String color,int price,String model,int bikeno){
		super(brand,color,price);
	  this.model=model;
	  this.bikeno=bikeno;
    
}
	public String toString() {
		return "Model="+model+"Bikeno="+bikeno+super.toString(); 
	}
}
