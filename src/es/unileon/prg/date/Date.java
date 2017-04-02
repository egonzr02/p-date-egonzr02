//Archivo: MainDate.java
//Alumno: Elena Gonzalez Rodriguez

package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date (int day, int month, int year) {
		
		this.year = year;
		
		this.month = month;
			
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

	void setDay(int day){
		this.day = day;
	}

	void setMonth(int month){
		this.month = month;
	}

	void setYear(int year){
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
		return ((this.year == another.year) && (this.month == another.month) && (this.day == another.day));
	}

	public String NameMonth (int month){
		
		String monthName;

		switch (this.month){
			
			case 1: monthName = "January";
				break;
			case 2: monthName = "February";
				break;
			case 3: monthName = "March";
				break;
			case 4: monthName = "April";
				break;
			case 5: monthName = "May";
				break;
			case 6: monthName = "June";
				break;
			case 7: monthName = "July";
				break;
			case 8: monthName = "August";
				break;
			case 9: monthName = "September";
				break;
			case 10: monthName = "October";
				break;
			case 11: monthName = "November";
				break;
			case 12: monthName = "December";
				break;
		}
		return this.NameMonth(this.month);
	} 

	public String Season (int month){
			
		String seasonMonth;
		switch (this.month){
			
			case 12: 
			case 1: 
			case 2: seasonMonth = "Winter";
				break;
			case 3:
			case 4:
			case 5: seasonMonth = "Spring";
				break;
			case 6:
			case 7:
			case 8: seasonMonth = "Summer";
				break;
			case 9:
			case 10:
			case 11: seasonMonth = "Aumtumn";
				break;
		}
		return this.Season(this.month);
	}	

	public int getNumDaysMonth ( int month){
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













