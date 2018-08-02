package bean;

public class Car {

	private String color;
	
	private String price;
	
	private String local;

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
