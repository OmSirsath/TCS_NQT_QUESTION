import java.util.Scanner;

public class printAPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,d,n,term;
        System.out.println("Enter the first term :");
        a = sc.nextInt();
        System.out.println("Enter the difference :");
        d = sc.nextInt();
        System.out.println("Enter the number of terms :");
        n = sc.nextInt();

        System.out.println("The Arithmatic progression series is :");

        for(int i = 0; i<n; i++){
            term = a + i * d;
            System.out.println(term + " ");
        }

        

    }
}
