package bai2;

public class Circle implements IShape{
	private double radius;

	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 2*Math.PI*this.radius;
	}

	@Override
	public double getPerimeter() {
		return this.radius*this.radius*Math.PI;
	}
	
	
}
