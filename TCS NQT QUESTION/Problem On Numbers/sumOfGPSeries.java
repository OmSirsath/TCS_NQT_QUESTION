//A Geometric Progression (GP) is a sequence of numbers where each term is obtained by multiplying the previous term by a fixed number called the common ratio (r).
import java.util.Scanner;

public class sumOfGPSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int a,n,r;
        System.out.println("Enter the first term :");
        a = sc.nextInt();
        System.out.println("Enterthe common ratio :");
        r = sc.nextInt();
        System.out.println("Enter the range :");
        n = sc.nextInt();
        int term = a;
        int sum = 0;
        for(int i = 0; i<=n; i++){
            System.out.println(term);
            sum = sum + term;
            term = term * r;
        }
        System.out.println("Geometroic progression series is : " + sum);

    }
}
