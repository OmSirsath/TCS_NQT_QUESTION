import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        int n;
        int count = 0;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is prime no.");
        }
        else{
            System.out.println("it is not prime no.");
        }
    }
}