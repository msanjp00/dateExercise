package es.unileon.prg1.dateExercise;

public class Main{

	public static void main(String args[]){
		
		Date day = new Date(1,2,9799);
		Date month = new Date(2,2,9659);
		Date year = new Date(2,2,9799);
		Date comparision = new Date(2,2,9799);
		
		
		System.out.println(day.isSameDay(comparision));
		System.out.println(month.isSameMonth(comparision));
		System.out.println(year.isSameYear(comparision));
		
		
		
	}

}