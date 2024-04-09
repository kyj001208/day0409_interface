package ex;

interface Shape {

	double calculateArea();//넓이
	double around(); //둘레

}

class Rectangle implements Shape {// 사각형

	private double width;
	private double height;
	

	public Rectangle(double width, double height) {// 초기화 하기위해 생성자 호출
		this.width = width; //가로
		this.height = height; //세로
		

	}

	@Override
	public double calculateArea() { //메서드 완성

		return width * height; // 가로 * 세로
	}

	@Override
	public double around() { //둘레 메서드 
		
		return (width*2)+(height*2);
	}

}

class Circle implements Shape {// 원

	private double radius; // 멤버 필드


	public Circle(double radius) {// 외부멤버필드를 가져오기 위해 생성자 호출

		this.radius = radius;//반지름
	}

	@Override
	public double calculateArea() {

		return Math.PI * radius * radius;
	}

	@Override
	public double around() {
		
		 return 2*Math.PI*radius;
	}

}

public class InterTest04 {

	public static void main(String[] args) {

		Shape shape = null;
		shape = new Rectangle(2, 3); //사각형
		
		System.out.println("사각형의 넓이 : " + shape.calculateArea());
		System.out.println("사각형의 둘레 : " + shape.around());
		
		
		shape = new Circle(10); //원
		System.out.println("원의 넓이 : " + shape.calculateArea());
		System.out.println("원의 둘레 : " + shape.around());

	}

}
