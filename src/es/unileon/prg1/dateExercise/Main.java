package es.unileon.prg1.dateExercise;

public class Main{

	public static void main(String args[]){
		
		Date day = new Date(1,2,9799);
		Date month = new Date(2,2,9659);
		Date year = new Date(2,2,9799);
		Date comparision = new Date(2,2,9799);
		Date printDate = new Date(5,5,1997);
		Date whatDay = new Date(2,3,1950);
		
		
		System.out.println(day.isSameDay(comparision));
		System.out.println(month.isSameMonth(comparision));
		System.out.println(year.isSameYear(comparision));
		
		System.out.println(printDate.printDate());
		
		System.out.println(whatDay.dateEndMonth());
		
	}

}