import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        int n ,p ,result = 1;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Enter the value of power : ");
        p = sc.nextInt();


        for(int i = 1; i<=p; i++){
            result=n*result;
        }
        System.out.println(result);
    }
}
