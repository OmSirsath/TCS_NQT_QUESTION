import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = n; i>0; i--){
            System.out.println(i);
        }
    }
}