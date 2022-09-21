package practice;

import java.util.ArrayList;
import java.util.List;

//class car{
//	
//	String name;
//	public car(String name, int price, int model, int year) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.model = model;
//		this.year = year;
//	}
//	@Override
//	public String toString() {
//		return "car [name=" + name + ", price=" + price + ", model=" + model + ", year=" + year + "]";
//	}
//	int price;
//	int model;
//	int year;
//}

// Generics
//class Test1<T,U>{
//	T o1;
//	U o2;
//	
//	Test1(T o1, U o2){
//		this.o1=o1;
//		this.o2=o2;
//	}
//	public void print() {
//		System.out.println(o1);
//		System.out.println(o2);
//
//	}
//	
//}

class Dimension<T>{
	private T length;
	private T width;
	private T height;
	public Dimension(T length,T width, T height) {
		super();
		this.length=length;
		this.width=width;
		this.height=height;
	}
}


public class StreamMapFunction {
	
//	static <T> void genericDisplay(T element)
//	 {
//		 System.out.println(element.getClass().getName()+"="+ element);
//	 }
	
	public static void main(String[] args) {
		
		
		Dimension dm= new Dimension(22, 20, 21);
//		genericDisplay(3456);
//		genericDisplay("String");
//		genericDisplay(34.56);
	}
}
		
//		Test1<String,Integer> obj = new Test1<String, Integer>("Hello",10);
//		obj.print();
//		
//		List<car> carList = new ArrayList<car>();
//		
//		carList.add(new car("azy",7000,78,2011));
//		carList.add(new car("bzy",8000,78,2012));
//		carList.add(new car("czy",8000,78,2013));
//		carList.add(new car("dzy",9000,78,2013));
//		
//		carList.stream()
//				.filter(car->car.price<=8000)
//				.map(car-> car.name)
//				.forEach(System.out::println);
//		
//		carList.stream()
//				.map(car->car.price)
//				.forEach(System.out::println);
//
//	}
//
//	private static void genericDisplay(int i) {
//		// TODO Auto-generated method stub
//		
//	}
//
//}
