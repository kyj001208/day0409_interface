package exam;

class A{
	
	int m=0;
	static void f() {}
	

}

public class P {
	
	public static void main(String[] args) {
		A a=new A();
		
		a.m=1;
		//A.m=1;
		a.f();
		A.f();
	}

}
