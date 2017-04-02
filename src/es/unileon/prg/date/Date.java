//Archivo: Date.java
//Alumno: Elena Gonzalez Rodriguez

 

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


    //A method that prints if two dates are the same year

    public boolean isSameYear (Date another ){
        return this.year == another.year;
    }


    //A method that prints if two dates are the same month  
        
    public boolean isSameMonth (Date another ){
        return this.month == another.month;
    }


    //A method that prints if two dates are the same day

    public boolean isSameDay (Date another ){
        return this.day == another.day;
    }


    //A method that prints if two dates are the same

    public boolean isSame (Date another ){
        return ((this.year == another.year) && (this.month == another.month) && (this.day == another.day));
    }


    //A method that prints the name of the month

    public String nameMonth (){
        
        String monthName = "";

        switch (month){
            
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
        return monthName;
    } 

    //A method that prints the season of the month

    public String season (){
            
        String seasonMonth = "";
        switch (month){
            
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
        return seasonMonth;
    }   

    //A moethod that             prints the number of days the month has

    public int getNumDaysMonth (int month){
        int numDays = 0;
    
        switch (month){
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
        return numDays;
    }



    //A method that prints all dates until the end of the month

    public void dateUntilEndMonth (){

        for (int i = this.day; i <= getNumDaysMonth(this.month); i++ ) {

            System.out.print(i + " ");
            
        }
        System.out.println(" ");
    }


    //A method that prints all months until the end of the year

    public void monthsUntilEnd (){

        for (int i = this.month; i <= 12; i++ ) {
            String month = "";

            switch (i){
            
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            }

            System.out.print(month + " ");

            //Si no repetia codigo imprime siempre el mes de marzo
            
        }
        System.out.println(" ");    

    }


    //A method that prints the months with the same amount of days

    public  void printMonthSameAmountDays(){

        for (int i = 1; i <= 12 ; i++) {
            if (getNumDaysMonth(i) == getNumDaysMonth(this.month)){
               String month = "";

            switch (i){
            
            case 1: month = "January";
                break;
            case 2: month = "February";
                break;
            case 3: month = "March";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "August";
                break;
            case 9: month = "September";
                break;
            case 10: month = "October";
                break;
            case 11: month = "November";
                break;
            case 12: month = "December";
                break;
            }

            System.out.print(month + " ");

            //Si no repetia codigo imprime siempre el mes de marzo
            }
        }
        System.out.println(" ");
    }
    
    //A method that counts the number of days since the first day of the year

    public int countDaysYear (){

        int month, year, counter = 0;
        for (int i = 1; i < this.month; i++ ) {
            
            counter = counter + getNumDaysMonth(i);     
        }
        counter = counter + this.day;

        return counter;
    }
        //A method that counts the number of attempts needed to generate a random date equals to the one given

    public int countAttemptsRandomDateWhile(){

        int randMonth = 0, randDay = 0, randYear = 0, counter = 0;

        while (!this.isSame(new Date(randDay, randMonth, randYear))) {
            randMonth = (int) (Math.random()*12 + 1);
            randDay = (int) (Math.random()*this.getNumDaysMonth(randMonth) + 1);
            randYear = this.year;
            counter = counter + 1;

        }
        return counter;
    }
    
    
        public int countAttemptsRandomDateDoWhile(){

        int randMonth = 0, randDay = 0, randYear = 0, counter = 0;

        do {
            randMonth = (int) (Math.random()*12 + 1);
            randDay = (int) (Math.random()*this.getNumDaysMonth(randMonth) + 1);
            randYear = this.year;
            counter = counter + 1;

        } while (!this.isSame(new Date(randDay, randMonth, randYear)));
        return counter;
    }
    
    //A method tha prints the day of the week of the given date
    public void dayOfTheWeek(){
        
        if (countDaysYear() % 7 == 0){
            System.out.println("Monday");
        }
        if (countDaysYear() % 7 == 1){
            System.out.println("Tuesday");
        }
        if (countDaysYear() % 7 == 2){
            System.out.println("Wednesday");
        }
        if (countDaysYear() % 7 == 3){
            System.out.println("Thursday");
        }
        if (countDaysYear() % 7 == 4){
            System.out.println("Friday");
        }
        if (countDaysYear() % 7 == 5){
            System.out.println("Saturday");
        }
        if (countDaysYear() % 7 == 6){
            System.out.println("Sunday");
        }
       
    }
}















