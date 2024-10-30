package studio7;

import edu.princeton.cs.introcs.StdDraw;

	public class Rectangle {
	
		private double length;
		private double width;
		
		public Rectangle(double length, double width) {
			if (length < 0 ||  width < 0) {
				throw new IllegalArgumentException("Must give a positive non-zero value for lenght and width.");
			}
			this.length = length;
			this.width = width;
		}
	public double getArea() {
		return length * width;
}
	public double getPerimeter() {
		return 2 * length + 2 * width;
	}
	public boolean isSmallerThan(Rectangle other) {
		return this.getArea() < other.getArea();
	}
	public boolean isSquare(Rectangle other) {
		return Math.abs(length - width) == 0;
	}
	public void draw(double x, double y) {
		double halfLength = length / 2.0;
		double halfWidth = width / 2.0;
		
		StdDraw.rectangle(x,  y,  halfLength, halfWidth);
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public String toString() {
		return String.format();
	}
}
