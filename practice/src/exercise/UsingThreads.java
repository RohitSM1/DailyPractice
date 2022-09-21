package exercise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class MyTask implements Runnable{
	@Override
	public void run() {
		for(int doc=1; doc<=10; doc++) {
			System.out.println("@@Printing document #"+ doc+"printer 2");
		}
	}
}
  class function{
	  void doDivide(int a, int b) throws Exception{
		  float result = a/b;
		  System.out.println("Divisiojn of result is "+ result);
	}
			

  }



public class UsingThreads {

	public static void main(String[] args) {
		
//		Scanner inputDevice = new Scanner (System.in);
//		int numerator = inputDevice.nextInt();
//		int denominator = inputDevice.nextInt();
//		try {
//			new function().doDivide(numerator, denominator);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("exe");
//		}5
		
		// job 1
		System.out.println("==Application Started==");
		
//		MyTask obj = new MyTask();
	//	obj.start();
		
		Runnable r= new MyTask();
		Thread task= new Thread(r);
		task.start();
		for(int doc=1; doc<=10; doc++) {
			System.out.println("@@Printing document #"+ doc+"printer 1");
		}
		
		
		System.out.println("==Application Finished==");
		
//		ArrayList<String> language = new ArrayList<String>();
//		language.add("Java");
//		language.add("python");
//		language.add("Javascript");
//		language.add(1,"hello");
//		language.remove(2);
//	
//		ArrayList<String> language2= new ArrayList<String>();
//		language2.add("lava");
//		language2.add("plva");
//		language2.add("lka");
//		
//		
//		Collections.reverse(language);
//		//Collections.sort(language);
//		System.out.println(language);
//		System.out.println(language2);
//		
//		ArrayList<String> all = new ArrayList<>();
//		all.addAll(language);
//		all.addAll(language2);
//		System.out.println("hhhh"+ all);
//		
//		for(String lang:language) {
//			System.out.println(lang);
//		}
//		Collections.swap(language,0,2);
//		
//		String element = language.get(1);
//		System.out.println(element);
//		if(language.contains("hello")) {
//			System.out.println("found");
//		}
//		else {
//			System.out.println("not found");
//		}
//		
//		System.out.println(language);
//		System.out.println(language2);
	}

	
		

}
