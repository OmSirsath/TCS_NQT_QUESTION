// The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
// n!=n×(n−1)×(n−2)×⋯×2×1
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n,fact = 1;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for(int i = 1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
   