package DateJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Tampil {
Scanner scan = new Scanner(System.in);
	
	ArrayList<Date> listdate = new ArrayList<Date>();
	
	public void addDate(){
		int inputDay = -1;
		int inputMonth = -1;
		int inputYear = -1;
		System.out.print("Input day: ");
		inputDay = scan.nextInt();
		System.out.print("Input month: ");
		inputMonth = scan.nextInt();
		System.out.print("Input year: ");
		inputYear = scan.nextInt();
		Date date = new Date(inputDay, inputMonth, inputYear);
		if(date.isValidDate(inputDay, inputMonth, inputYear)) {
			listdate.add(date);
			System.out.println("Input date success!");
		}
	}
	
	public void viewDate(){
		if(listdate.size() > 0){
			for(Date i : listdate){
				System.out.println(i.toString());
			}
		} else {
			System.out.println("No data found!");
		}
	}
	
	public void mainMenu() {
		int input = -1;
		do{
			System.out.println();
			System.out.println("Jumlah data: " + listdate.size());
			System.out.println("(1) Add date to list");
			System.out.println("(2) View all dates");
			System.out.println("(3) Sort Data");
			System.out.println("(4) Exit");
			System.out.print("Input >> ");
			try{
				input = scan.nextInt();
			} catch (Exception e){
				System.out.println("Please input integer!");
			}
			if(input == 1){
				addDate();
			} else if (input == 2){
				viewDate();
			} else if(input == 3){
				Collections.sort(listdate, Date.DateCmp);
				System.out.println("Sort successful!");
			}
		}while(input == -1 || input != 4);
	}
	
	public Tampil() {
		mainMenu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Tampil();
	}

}
