
 package practice;
import java.util.*;



abstract class book{
	String title;
	abstract void settitle(String s);
	String gettitle() {
		return title;
	}
	
}

class mybooks extends book{
	@Override
	void settitle(String s) {
		this.title=s;
	}
}

class adder{
	
	void print() {
		System.out.println("printing class 1");
	}
	
	
	
}

class subtractor{
	int a;
	int b;
	subtractor(int a, int b){
		this.a=a;
		this.b=b;
	}
//	public static int vall() {
//		int a=5;
//		int b = 0;
//		return a/b;
		
	//}
}

class NewAdder extends adder {
	 String name;
	 int b;

	NewAdder(String name , int b){
		this.name=name;
		this.b=b;
	}
	
	
}


public class Alist {

	void print() {
		System.out.println("hello");
	}
	
	public static int green(int a, int b) {
		return a+b;
	
		
	}
	
	static class MyCalculator implements AdvancedArithmetic{
	    @Override
	    public int divisor_sum(int n){
	        int value=0;
	        for(int i=1; i<=n; i++){
	            if(n%i==0){
	                value+=i;
	            }
	        }
	        return value;
	    }
	    
	    
	}
	
	class ByCalculator {
	    /*
	    * Create the method long power(int, int) here.
	    */
	    long power(int n, int p) throws Exception{
	        if(n==0 && p==0){
	            throw new Exception("n and p should not be zero.");
	        }
	        else if(n<0||p<0){
	            throw new Exception("n or p should not be negative.");
	        }
	        return (long)Math.pow(n,p);
	    }
	}
	
	 public static final MyCalculator my_calculator = new MyCalculator();
	    public static final Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
//	  System.out.println( green(5,6));
//	  
//	  	//adder a;
//	  	adder a=new adder();
//	  	a.print();
//	  	NewAdder nw = new NewAdder("abas" ,5);
//	  	System.out.println(nw.b);
//	  	System.out.println(nw.name + nw.b);
//	  
//	  	mybooks bk = new mybooks();
//	  	bk.settitle("james");
//	  	bk.gettitle();
//	  	System.out.print(bk.gettitle());
//	 
//	  	MyCalculator my_calculator = new MyCalculator();
//        System.out.print("I implemented: ");
//        my_calculator.divisor_sum(50);
//        System.out.print( my_calculator.divisor_sum(6));
//        
//        while (in .hasNextInt()) {
//            int n = in .nextInt();
//            int p = in .nextInt();
//            
//            try {
//           //   System.out.println(my_calculator.pow(n, p));
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//        }
//        	subtractor sb= new subtractor(5,6);
//        	System.out.println(sb.a);
//        
        	try {
        		int d =0;
        		int n=20;
        		int fraction= n/d;
//        		int g[]= {1};
//        		g[20]=100;
        	
        	}
        	catch(Exception e) {
        		System.out.println(e);
        	}
        	finally {
        		System.out.println(" remaining code exe");
        	}
    }
        
	  	
	}

	


