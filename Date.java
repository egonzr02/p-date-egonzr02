public class Date {

	private int day;
        private int month;
	private int year;
	
	public Date (int day, int month, int year){
	
		this.day = day;
		this.month = month;
		this.year = year;
	}
		public boolean isSameYear (Date another ){
			return this.year==another.year;
		}			
		public boolean isSameMonth (Date another ){
			return this.month==another.month;
		}
		public boolean isSameDay (Date another ){
			return this.day==another.day;
		}
		/**public boolean isSame (Date another ){
			return this.day==another.date;
		}*/
}

