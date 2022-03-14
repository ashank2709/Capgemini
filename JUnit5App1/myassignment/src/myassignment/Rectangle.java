package myassignment;

public class Rectangle {
	
	private float length;
	private float width;
	
	public Rectangle() {
		length=5.6f;
		width = 3.6f;
	}
	
	public Rectangle (float length, float width) {
		length=1.0f;
		width=1.0f;
		
	}
	
	public float getLength() {
		return length;
	}
	
	public void setLength(float length) {
		this.length=length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width=width;
	}
	
	public  double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public String toString() {
		return "rectangle[length=30,width=40]";
	}

}
