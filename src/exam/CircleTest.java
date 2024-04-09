package exam;

public class CircleTest {

	public static void main(String[] args) {
		Circle c = new Circle(1, 2, 5);

		System.out.println(c.x);
		System.out.println(c.y);
		
		
		c=c.move(10, 10);
		
		System.out.println(c.x);
		System.out.println(c.y);

	}

}
