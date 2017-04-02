//Archivo: MainDate.java
//Alumno: Elena Gonzalez Rodriguez

package es.unileon.prg.date;

public class MainDate {

	public static void main(String args[]){

		Date today;

			today = new Date (28,03,2017);
		System.out.println(today);
			

		Date yesterday;
		
			yesterday = new Date (27,03,2017);
		System.out.println(yesterday);
	
		System.out.println(today.isSameYear(yesterday));

		System.out.println(today.isSameMonth(yesterday));

		System.out.println(today.isSameDay(yesterday));

		System.out.println(today.isSame(yesterday));

		//today.NameMonth();
		
		//today.Season();
	
		//System.out.println(today.getNumDaysMonth());
		
	}


}
