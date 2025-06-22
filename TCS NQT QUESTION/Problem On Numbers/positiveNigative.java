import java.util.Scanner;

public class positiveNigative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();

        if(n>=0){
            System.out.println("It is positive number ");
        }
        else{
            System.out.println("It is negative number :");
        }

    }
}
