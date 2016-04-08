package es.unileon.prg1.dateExercise;

public class Date {
		
		private int day;
		private int month;
		private int year;
		
	public Date() {
		
		this.day=1;
		this.month=1;
		this.month=2077;		
		
	}
	
	public Date(int day, int month, int year) {
		
		this.day=day;
		this.month=month;
		this.year=year;
		
	}
	
	public int getDay(){
		
		return this.day;
		
	}
	
	public int getMonth(){
		
		return this.month;
		
	}
	
	public int getYear(){
		
		return this.year;
		
	}
	
	public void setDay(int day){
		
		this.day=day;
		
	}
	
	public void setMonth(int month){
		
		this.month=month;
		
	}
	
	public void setyear(int year){
		
		this.year=year;
			
	}
	 	
	public boolean isSameDay(Date day){
		
		boolean isSameDay= this.day==day.getDay();
		
		return isSameDay;
						
	}
	
	public boolean isSameMonth(Date month){
	
		this.month==month.getMonth();
		
		return isSameMonth;
		
	}
	
	
	public String monthName(){
		
		String monthReturn=null;
		
		switch (this.month) {
				
			case 1: monthReturn="January";
				break;
			case 2: monthReturn="February";
				break;
			case 3: monthReturn="March";
				break;
			case 4: monthReturn="April";
				break;
			case 5: monthReturn="May";
				break;
			case 6: monthReturn="June";
				break;
			case 7: monthReturn="July";
				break;
			case 8: monthReturn="August";
				break;
			case 9: monthReturn="September";
				break;
			case 10: monthReturn="October";
				break;
			case 11: monthReturn="November";
				break;
			case 12: monthReturn="December";
				break;
				
		}
		
		return monthReturn;
		
	}
	
/*	public 
		
		if ((this.day<0)||(this.day>31)){
		
			// falta
		
		}
	
	public
	
		if((this.month<0)||(this.month>12)){
		
			//falta
		
		}
		   
	public 	
		
		if(this.year<0){
		
			//falta
		
		}else{
			
		}
*/	
	public String seasonYear(int season){
	
		String seasonReturn=null;
		
		switch (season) {
			
			case 1: 
			case 2: 
			case 3: seasonReturn="Winter";
				break;
				
			case 4:
			case 5:
			case 6: seasonReturn="Spring";
				break;
				
			case 7:
			case 8:
			case 9: seasonReturn="Summer";
				break;
			
			case 10:
			case 11:
			case 12: seasonReturn="Autumn/Fall";
				break;
				
			
		}
		
		return seasonReturn;
		
	}
	
	public int monthLeft(int monthLeft){
	
			monthLeft=0;
			for(int i=this.month;i<12;i++){
				
				monthLeft=monthLeft+1;
				
			}
		return monthLeft;
	}
		
	
	
	
		
	
}