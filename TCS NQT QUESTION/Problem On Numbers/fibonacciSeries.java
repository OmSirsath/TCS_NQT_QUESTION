// The Fibonacci Series is a sequence of numbers in which each number is the sum of the two preceding ones, starting from 0 and 1.
// eg. 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …
import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        int n ,a = 0, b = 1,c;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();


        for(int i = 0; i<n; i++){
            System.out.println(a);
            c=a+b;
            a=b;  // value of b assign in a
            b=c;  //value of c assign in b
        }
    }
}