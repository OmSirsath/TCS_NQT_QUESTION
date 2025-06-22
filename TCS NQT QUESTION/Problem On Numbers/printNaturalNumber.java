import java.util.Scanner;

public class printNaturalNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
}
