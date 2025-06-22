// A leap year is a year that has 366 days instead of the usual 365 days.
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        int y;
        System.out.println("Enter the any year :");
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        if(y%100==0 && y%400==0 || y%400!=0 && y%4==0){
            System.out.println("It is leap year ");
        }
        else{
            System.out.println("It is not leap year ");
        }
    }
}
