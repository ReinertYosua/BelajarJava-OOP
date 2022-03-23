package GenericInheritance;

import java.util.ArrayList;
import java.util.Collection;

class A{

}

class B extends A{
	
}

public class GenericsWildCard {

	static void printData(ArrayList< ? extends Number > c) {
		//Upper Bound
		for(Number o: c) {
			System.out.println(o);
		}
	}
	
	static void printOnlyInteger(ArrayList<? super Integer> c) {
		//Lower Bound
		for(Object o: c) {
			System.out.println(o);
		}
	}
	
	static void printDataArray(ArrayList<?> c) {
		//Unbounded
		for(Object o: c) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>a = new ArrayList<Integer>(5);
		ArrayList<Double>b = new ArrayList<Double>(5);
		ArrayList<Float> c = new ArrayList<Float>(5);
		ArrayList<String> d = new ArrayList<String>(5);
		ArrayList<Object> e = new ArrayList<Object>(5);
		ArrayList<? extends A> f = new ArrayList<A>();

		a.add(1);
		a.add(3);
		a.add(45);
		a.add(100);
		a.add(392);
		
		b.add(34.2);
		b.add(45.2);
		b.add(100.34);
		
		c.add((float) 45.56);
		c.add((float) 56.89);
		
		d.add("a");
		
		e.add(89);
		e.add(123.45);
		printData(a);
		printData(b);
		printData(c);
		printOnlyInteger(e);
		printDataArray(a);
		printDataArray(b);
		printDataArray(c);
		printDataArray(d);
		
		int day =0;
		switch(day) {
		case 1 -> {
			System.out.println("Monday");
			break;
		}
		case 2 -> {
			System.out.println("Tuesday");
			break;
		}
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
	}
	
	//Generic WildCard dibagi menjadi 3
	//UpperBound Wildcard -> Melonggarkan Batasan pada Variable
	//LowerBound Wildcard -> Diperketat batasan
	//Unbounded Wildcard -> Sangat dilonggarkan

}
