package bean;

public class Car {

	private String color;
	
	private String price;
	
	private String local;
	
	private String eclipse;
	
	private String local_1;

	private String eclipse_1;
	

	private String local_2;
	
	private String local_3;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + "]";
	}
}
