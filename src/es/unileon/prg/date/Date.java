package es.unileon.prg.date;


public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) throws DateException{
		
		this.year = year;
		
		if (month >= 1 && month <= 12){
			this.month = month;
			
		}else{
			throw new DateException("Mes " +month+" NO valido, " + "valores posibles entre 1 y 12.");
		}
			
		this.day = day;
			
	}

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
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

	void setDay(int Day){
		this.day = day;
	}

	void setMonth(int Month){
		this.month = month;
	}

	void setYear(int Year){
		this.year = year;
	}

	public boolean isSameYear (Date another ){
		return this.year == another.year;
	}	
		
	public boolean isSameMonth (Date another ){
		return this.month == another.month;
	}

	public boolean isSameDay (Date another ){
		return this.day == another.day;
	}

	public boolean isSame (Date another ){
		return (today.isSameYear(another) && today.isSameMonth(another) && today.isSameDay(another));
	}

	private int NameMonth (int month){
		
		switch (this.month){
			case 1: System.out.println("January");
				break;
			case 2: System.out.println("February");
				break;
			case 3: System.out.println("March");
				break;
			case 4: System.out.println("April");
				break;
			case 5: System.out.println("May");
				break;
			case 6: System.out.println("June");
				break;
			case 7: System.out.println("July");
				break;
			case 8: System.out.println("August");
				break;
			case 9: System.out.println("September");
				break;
			case 10: System.out.println("October");
				break;
			case 11: System.out.println("November");
				break;
			case 12: System.out.println("December");
				break;
		}
		return this.NameMonth(this.month);
	} 

	private int Season (int month){
		
		switch (this.month){
			case 12: 
			case 1: 
			case 2: System.out.println("Winter");
				break;
			case 3:
			case 4:
			case 5: System.out.println("Spring");
				break;
			case 6:
			case 7:
			case 8: System.out.println("Summer");
				break;
			case 9:
			case 10:
			case 11: System.out.println("Aumtumn");
				break;
		}
		return Season(this.month);
	}	

	private int getNumDaysMonth(int month){
		int numDays = 0;
	
		switch (this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: numDays = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11: numDays = 30;
				break;
			case 2: numDays = 28;
				break;
		}
		return this.getNumDaysMonth(this.month);


	}

	
}













