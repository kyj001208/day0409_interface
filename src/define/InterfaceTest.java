package define;

public interface InterfaceTest {
	
	int a=10; 
	int MAX_VALUE=100;
	
	public static void main(String[] args) {
		
		System.out.println(InterfaceTest.a);
		System.out.println(a);
		
		InterfaceTest obj= new InterfaceTest() {};
		
		System.out.println(obj.a);
	
		
	}

}
