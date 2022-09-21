package exercise;

class A {
	public void m() {
		System.out.println("Printing the method m of class A");
	}
			public void n() {
				System.out.println("Printing the method n of class A");
	 }
	
}
 class B extends  A {
	 public void m() {
		 System.out.println("Printing the method m of class B");
		 
	 }
	
 }
public class TEST01 {
	public static void main(String[] args) {
		
		//B b = new A();
		//b.m();
	
	}
}







//A a = new B();
//a.m();   // Using  method of class B
//a.n();   // using method of class A

//A x = new A(); // This will call the method of class A
//x.m();
//x.n();


//	public void n() {
//		 System.out.println("Printing the method n of class B");
//}

