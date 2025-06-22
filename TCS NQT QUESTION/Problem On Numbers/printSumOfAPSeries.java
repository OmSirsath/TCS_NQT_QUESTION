// Arithmetic Progression (AP) is a sequence of numbers in which the difference between any two consecutive terms is constant.

import java.util.Scanner;

public class printSumOfAPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,d,n,term;
        System.out.println("Enter the term :");
        a = sc.nextInt();
        System.out.println("Enter the difference :");
        d = sc.nextInt();
        System.out.println("Enter the number of term :");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            term = a + i * d;
            System.out.println(term);
        }
    
    }
}
