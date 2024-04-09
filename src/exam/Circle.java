package exam;

public class Circle {
	
	static final double PI=3.14;
	
	int x,y;
	double r;
	
	
	public Circle(int x, int y, double r) {
		
		this.x=x;
		this.y=y;
		this.r=r;
	}
		
		double area() {
			return PI*r*r;
			
		
	}
		
		Circle move(int dx, int dy) {
			
			x +=dx; //x=x+dx
			y +=dy;
			return this;
			
		}

}
