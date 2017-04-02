//Archivo: MainDate.java
//Alumno: Elena Gonzalez Rodriguez

 

public class MainDate {

    public static void main(String args[]){

        Date today;

            today = new Date (28,03,2017);
        System.out.println("Today is: " + today);
            

        Date yesterday;
        
            yesterday = new Date (27,03,2017);
        System.out.println("Yesterday was:" + yesterday);
    
        System.out.println("Today is the same year than yesterday: " + today.isSameYear(yesterday));

        System.out.println("Today is the same month than yesterday: " + today.isSameMonth(yesterday));

        System.out.println("Today is the same day than yesterday: " + today.isSameDay(yesterday));

        System.out.println("Today is the same date than yesterday: " + today.isSame(yesterday));

        System.out.println("Today's month is: " + today.nameMonth());
        
        System.out.println("Today's season is: " +  today.season());
            
        System.out.println("Days until the end of the month starting today: ");
        today.dateUntilEndMonth();
        
        System.out.println("Months until the end of the year starting today: ");
        today.monthsUntilEnd();
        
        System.out.println("Months with the same amount of days: ");
        today.printMonthSameAmountDays();
        
        System.out.println("Number of days since the first day of the year: " + today.countDaysYear());
        
        System.out.println("Number of attempts at generating the same date as today: ");
        System.out.println(today.countAttemptsRandomDateDoWhile());
        
        System.out.println(today.countAttemptsRandomDateWhile());
        
        System.out.println("The day of the week is: ");        
        today.dayOfTheWeek();

        
    }


}
