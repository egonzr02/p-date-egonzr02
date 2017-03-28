public class MainDate {
	public static void main(String args[]){

		Date today, tomorrow, yesterday;
		today = new Date (28,03,2017);
		//tomorrow = new Date (29,03,2017);
		yesterday = new Date (27,03,2017);
				
		System.out.println(today.isSameYear(yesterday));
		System.out.println(today.isSameMonth(yesterday));
		System.out.println(today.isSameDay(yesterday));
		System.out.println(today.isSame(yesterday));
		
	}


}
