package define;

interface AAA{
	
	void display();
	
}
public  class Dog implements Animal,AAA {

	@Override
	public void sound() {
		
		System.out.println("멍멍");
		
	}

	@Override
	public void display() {
		System.out.println("야옹");
		
	}
	
	

}
