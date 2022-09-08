
public class Circle {
	double radius, area;
	public Circle(double radius) {
		this.radius=radius;
	}
	
	public double area() {
		return 3.14*this.radius*this.radius;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle o = new Circle(3);
		System.out.println(o.area());

	}

}
