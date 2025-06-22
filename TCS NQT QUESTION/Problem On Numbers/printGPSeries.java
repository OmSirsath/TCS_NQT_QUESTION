//A Geometric Progression is a sequence where each term is found by multiplying the previous term by a fixed number (called the common ratio).

import java.util.Scanner;

public class printGPSeries {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,r,n;
        System.out.println("Enter the term : ");
        a = sc.nextInt();
        System.out.println("Enter the common ratio :");
        r = sc.nextInt();
        System.out.println("Enter the number of term :");
        n = sc.nextInt();
        int term = a,sum  = 0;
        System.out.println("Geometric Progression Series is :");
        for(int i = 0; i<n; i++){
            System.out.println(term);
            term = term * r;
            sum = sum + term;

        }
        System.out.println(sum);

    }
}
