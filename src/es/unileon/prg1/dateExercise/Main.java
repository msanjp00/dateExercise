package es.unileon.prg1.dateExercise;

public class Main{

	public static void main(String args[]){
		
		Date day = new Date(2,2,9999);
		Date comparision = new Date(2,2,9999);
		
		
		System.out.println(day.isSameDay(comparision));
		
		
		
	}

}