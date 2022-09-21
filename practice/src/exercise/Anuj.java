package exercise;
import java.util.*;


class Area{
	int Length;
	int Breadth;
	void setDim(int Length,int Breadth) {
		this.Breadth= Breadth;
		this.Length=Length;
		
	}
	public void getArea(){
		int area=  Length*Breadth;	
		System.out.println(area);
		//return area;	
	}
	

	
}
class Student {
	  String name;
	  int roll_no;
	}


public class Anuj {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		int Length= sc.nextInt();
//		int Breadth = sc.nextInt();
//		
//		Area ab = new Area();
//		ab.setDim(Length, Breadth);
//		ab.getArea();
		
//	    Student s = new Student();
//	    s.name = sc.nextLine();
//	    s.roll_no = sc.nextInt();
//	    System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);
		
//		---------STACK-----------  FIRST IN LAST OUT
//		Stack<String> animals= new Stack<>();
//		animals.push("lion");
//		animals.push("cat");
//		animals.push("horse");
//		
//		System.out.println(animals);
//		
//		System.out.println(animals.peek());
//		animals.pop();
//		System.out.println(animals.peek());
			
		
//		---------QUEUE-------------
//		Queue<Integer> queue= new LinkedList<>();
//		queue.offer(40);
//		queue.offer(12);
//		queue.offer(24);
//		queue.offer(36);
//		
//		System.out.println(queue);
//		System.out.println(queue.poll());
//		System.out.println(queue);
		
//		--------PRIORITY QUEUE--------- GIVES PRIORITY TO THE SHORT ELEMENT
//		Queue<Integer>queuee= new PriorityQueue<>();
//		queuee.offer(40);
//		queuee.offer(12);
//		queuee.offer(24);
//		queuee.offer(36);
//		
//		System.out.println(queuee);
//		System.out.println(queuee.poll());
		
		
//		------------ARRAY DEQUE-------------  INSERT ANYWHERE PUT PULL
//		ArrayDeque<Integer> adq = new ArrayDeque<>();
//		adq.offer(23);
//		adq.offer(12);
//		adq.offer(45);
//		adq.offer(95);
//		adq.offer(67);
//		System.out.println(adq);
//		
//		System.out.println(adq.peek());	 // look for the first element
//		System.out.println(adq.peekFirst()); // look for the first element/ sameeeeeeeeee
//		System.out.println(adq.poll());			// remove first
//		System.out.println(adq.pollFirst());		//remove first
//		System.out.println(adq.pollLast());				// remove last
		
		
//		-----------HASHSET------------ Does not allow duplicate elements
		
//		Set<Integer> set = new HashSet<>();
//		set.add(32);
//		set.add(2);
//		set.add(54);
//		set.add(21);
//		set.add(65);
//		
//	
//		System.out.println(set);
//		System.out.println(set.remove(54));
//		System.out.println(set);
//		System.out.println(set.contains(100));
//		System.out.println(set.isEmpty());
//		System.out.println(set.size());
//		set.clear();
//		System.out.println(set);
//		
//		Map<String,Integer> hm= new HashMap<>();
//		hm.put("rous", 55);
//		hm.put("keni", 29);
//		hm.put("tyler", 62);
//		hm.put("zues", 55);
//		hm.put("frank", 78);
//		
//		System.out.println(hm);
//		System.out.println(hm.get("rous"));
//		
//		Set<String> keys = hm.keySet();
//		System.out.println(keys);
//		
//		for(String key: hm.keySet())
//		{
//			Integer value = hm.get(key);
//			System.out.println(key+" " +value);
//		}
//		
		
//		-----------ARRAY LIST--------------
		ArrayList<String> language = new ArrayList<String>();
		language.add("Java");
		language.add("python");
		language.add("Javascript");
		language.add(1,"hello");
		
		System.out.println(language);
		String languageName[]= language.toArray(new String[language.size()]);
		for(String prt:languageName) {
			System.out.println(prt);
		}
//		
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

	private static void getArea() {
		// TODO Auto-generated method stub
		
	}

	private static void setDim(int length, int breadth) {
		// TODO Auto-generated method stub
		
	}

}
