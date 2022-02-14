package DateJava;

import java.util.Comparator;

public class Date {
	private int day;
	private int month;
	private int year;
	private String months[] = {"", "January", "February", "March", "April", "May", "June,", "July",
			"September", "October", "November", "December"};
	private String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private int dim[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Boolean isLeapYear(int year){
		if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0){
			return true;
		}
		return false;
	}
	
	public Boolean isValidDate(int day, int month, int year){
		if(day > 0 && day <= 31){
			if(month == 2 && this.isLeapYear(year)) dim[month] = 29;
			else if(month == 2) dim[month] = 28;
			if(day > dim[month]) return false;
		}
		if(month > 12 || month < 1){
			return false;
		}
		if(year < 1 || year > 9999){
			return false;
		}
		return true;
	}
	
	public String getDayOfWeek(int day, int month, int year){
		int century = year/100;
		int lastdigit = year%100;
		int cenRes = 0;
		if((century-1) % 4 == 0){
			cenRes = 4;
		} else if((century-1) % 4 == 1){
			cenRes = 2;
		} else if((century-1) % 4 == 2){
			cenRes = 0;
		} else if((century-1) % 4 == 3){
			cenRes = 6;
		}
		
//		System.out.println(cenRes + " " + lastdigit);
		
		int res = (cenRes + lastdigit);
		int curYear = lastdigit/4;
		
		res += curYear;
		//nonleap year
		int num[] = {0, 0 ,3 ,3 ,6, 1, 4, 6,2, 5, 0, 3, 5};
		//leap year
		int numl[] = {0, 6, 2, 3, 6, 1, 4, 6, 2, 5 ,0 ,3 ,5};
		
		if(this.isLeapYear(year)){
			res += numl[month];
		}
		if(!this.isLeapYear(year)){
			res += num[month];
		}
		
		res += day;
		
		res = res % 7;
		
		return days[res];
	}
	
	public Date(int day, int month, int year){
		setDate(day, month, year);
	}
	
	public void setDate(int day, int month, int year){
		if(isValidDate(day, month, year)){
			setYear(year);
			setMonth(month);
			setDay(day);
		} else {
			System.out.println("Not valid date!");
		}
	}
	
	public void setDay(int day){
		if(day > dim[month] || day < 0){
			System.out.println("Invalid day!");
		}
		this.day = day;
	}
	
	public void setMonth(int month){
		if(month < 1 || month > 12){
			System.out.println("Invalid month!");
		}
		this.month = month;
	}
	
	public void setYear(int year){
		if(year < 1 || year > 9999){
			System.out.println("Invalid year!");
		}
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public String toString() {
		return getDayOfWeek(day, month, year) + ", " + this.day + " " + months[this.month] + " " + this.year;
	}
	
	public Date nextDay() {
		int day = this.day + 1;
		int nowMonth = this.month;
		int nowYear = this.year;
		if(day > dim[nowMonth]){
			nowMonth = nowMonth + 1;
		}
		if(nowMonth > 12){
			nowYear = nowYear + 1;
		}
		
		Date date = new Date(day, nowMonth, nowYear);
		
		return date;
	}
	
	public Date nextMonth() {
		int day = this.day;
		int nowMonth = this.month + 1;
		int nowYear = this.year;
		if(nowMonth > 12){
			nowYear = nowYear + 1;
		}
		Date date = new Date(day, nowMonth, nowYear);
		return date;
	}
	
	public Date nextYear() {
		int day = this.day;
		int nowMonth = this.month;
		int nowYear = this.year + 1;
		if(nowYear > 9999){
			System.out.println("Year out of range!");
		}
		Date date = new Date(day, nowMonth, nowYear);
		return date;
	}
	
	public Date previousDay() {
		int day = this.day - 1;
		int nowMonth = this.month;
		int nowYear = this.year + 1;
		Date date = new Date(day, nowMonth, nowYear);
		return date;
	}
	
	public Date previousMonth(){
		int day = this.day;
		int nowMonth = this.month - 1;
		int nowYear = this.year;
		if(nowMonth < 1){
			nowYear = nowYear - 1;
		}
		Date date = new Date(day, nowMonth, nowYear);
		return date;
	}
	
	public Date previousYear() {
		int day = this.day;
		int nowMonth = this.month;
		int nowYear = this.year - 1;
		if(nowYear < 1){
			System.out.println("Year out of range!");
		}
		Date date = new Date(day, nowMonth, nowYear);
		return date;
	}

	public static Comparator<Date> DateCmp = new Comparator<Date>(){
		public int compare(Date date1, Date date2){
			if(date1.year != date2.year){
				return date1.year - date2.year;
			}
			
			if(date1.month != date2.month){
				return date1.month - date2.month;
			}
			
			return date1.day - date2.day;
		}
	};
}
