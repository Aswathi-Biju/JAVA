package project;
class Shape{
	public int area(int s) {
		System.out.print("Square Area: ");
		return s*s;
	}
	public float area(float r) {
		System.out.print("Circle Area: ");
		return 3.14f*r*r;
	}
	public int area(int l, int b) {
		System.out.print("Rectangle Area: ");
		return l*b;
	}
	public int volume(int l, int b, int h) {
		System.out.print("Cuboid Volume: ");
		return l*b*h;
	}
	public int volume(int c) {
		System.out.print("Cube Volume: ");
		return c*c*c;
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Shape Shape = new Shape();
		System.out.println(Shape.area(10)+"cm^2");
		System.out.println(Shape.area(10f)+"cm^2");
		System.out.println(Shape.area(10,20)+"cm^2");
		System.out.println(Shape.volume(10,20,5)+"cm^3");
		System.out.println(Shape.volume(10)+"cm^3");
	}
}
