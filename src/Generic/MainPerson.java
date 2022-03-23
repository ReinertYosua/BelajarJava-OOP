package Generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class MainPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] authors = {
			new Person("Agung", "Joko"),
			new Person("Zaki", "Budi"),
			new Person("Echa", "Alex"),
			new Person("Dina", "Natalia"),
			new Person("Tono", "Joko"),
		};
		
		Arrays.sort(authors);
	
		for(Person at : authors) {
			System.out.println(at);
		}
		
		Person[] cariPeople= {
			new Person("Echa", "Alex"),
			new Person("Zaki", "Budi"),
		};
		
		char charArr[] = {'a','f','g','b'};
		Arrays.sort(charArr);
		System.out.println(charArr);
		char charKey = 'b';
		System.out.println("Found in index; "+Arrays.binarySearch(charArr, charKey));
		
		System.out.println("===Cari People===");
		int index = 0;
		for(Person cp : cariPeople) {
			index = Arrays.binarySearch(authors, cp);
			//System.out.println(index);
			if(index>=0) {
				System.out.println(cp+" ada di index: "+index);
			}else {
				System.out.println("Not found");
			}
		}
			
	}

}
