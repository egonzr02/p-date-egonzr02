public class Date {

	int day;
	int month;
	int year;
	
	public Date (int day, int month, int year){
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
		boolean isSameYear (Date another ){
			return this.year==another.year;
		}			
		boolean isSameMonth (Date another ){
			return this.month==another.month;
		}
		boolean isSameDay (Date another ){
			return this.day==another.day;
		}
		/**boolean isSame (Date another ){
			return this.date==another.date;
		}*/
}
