package es.unileon.prg1.dateExercise;

public class Main{

	public static void main(String args[]){
		
		Date day = new Date(1,2,9799);
		Date month = new Date(2,2,9659);
		Date year = new Date(2,2,9799);
		Date comparision = new Date(2,2,9799);
		Date printDate = new Date(5,5,1997);
		Date whatDay = new Date(2,3,1950);
		Date fecha1 = new Date(3,2,1993);
		Date fecha2 = new Date(3,3,1993);
		
		System.out.println(day.isSameDay(comparision));
		System.out.println(month.isSameMonth(comparision));
		System.out.println(year.isSameYear(comparision));
		System.out.println(fecha2.isSame(fecha1));
		
		System.out.println(printDate.printDate());
		
		System.out.println(whatDay.dateEndMonth());
		
		System.out.println(fecha1.printAllMonthOf());
		
		
		
	}

}