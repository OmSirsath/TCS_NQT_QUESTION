import java.util.Scanner;

public class sumNaturalNumber {
    public static void main(String[] args) {
        int n ,sum = 0;
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<=n; i++){
             sum=sum+i;
        }
        System.out.println(sum);
    }
}
