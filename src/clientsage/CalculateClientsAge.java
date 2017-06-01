package clientsage;

import java.util.GregorianCalendar;
import java.util.Scanner;
//import java.text.SimpleDateFormat;
import java.util.Calendar;
 
public class CalculateClientsAge {
 
/**
* Month Representations
*/
static final int JAN = 0;
static final int FEB = 1;
static final int MAR = 2;
static final int APR = 3;
static final int MAY = 4;
static final int JUN = 5;
static final int JUL = 6;
static final int AUG = 7;
static final int SEP = 8;
static final int OCT = 9;
static final int NOV = 10;
static final int DEC = 11;
 
public static void main(String[] args) {
      
    int d, m, y;
    String response;
   
    Scanner input = new Scanner(System.in);
   
 //do{
       do{
              System.out.println("Enter your birth day: ");
              d = input.nextInt();
              System.out.println("Enter your birth month: ");
              m = input.nextInt();
              System.out.println("Enter your birth year: ");
              y = input.nextInt();
      
              System.out.println("You were born in " + m +"/"+d+"/"+y + ". You are currently "
       + calculateMyAge(y, m, d) + " years old.");
 
       System.out.println("Would you like to enter details for another client? (Y/N): ");
       response = input.next();
      
       if (response.equalsIgnoreCase("n")){
              System.out.println("Thanks for using the age calculator!");
       }
 
       }while (response.equalsIgnoreCase("y"));
//       System.out.println("The number of days in " + Month + " are: " +  numDays + ".");
       //  System.out.println("Want to enter another month? (Y/N)");
        // yes = sc.next();
  //}while (yes.equalsIgnoreCase("y")); 
 
//System.out.println(y, m, d);
}
 
/**
*
* @param year --> Birth Year
* @param month --> Birth Month
* @param day --> Birth Day
* @return --> Calculated Age
*/
private static int calculateMyAge(int year, int month, int day) {
 
       Calendar birthCal = new GregorianCalendar(year, month, day);
 
       Calendar nowCal = new GregorianCalendar();
 
       int age = nowCal.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
 
       boolean isMonthGreater = birthCal.get(Calendar.MONTH) >= nowCal
                     .get(Calendar.MONTH);
 
       boolean isMonthSameButDayGreater = birthCal.get(Calendar.MONTH) == nowCal
                     .get(Calendar.MONTH)
                     && birthCal.get(Calendar.DAY_OF_MONTH) > nowCal
                     .get(Calendar.DAY_OF_MONTH);
 
       if (isMonthGreater || isMonthSameButDayGreater) {
              age=age-1;
       }
              return age;
       }
 
}
 