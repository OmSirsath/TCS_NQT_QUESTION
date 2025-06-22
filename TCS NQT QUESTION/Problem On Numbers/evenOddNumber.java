// even number means thsose number are divisible by 2 called as even number 
// eg. 0,2,4,8.
import java.util.Scanner;

public class evenOddNumber {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n :");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        if(n%2==0){
            System.out.println("It is even number ");
        }
        else{
            System.out.println("It is odd number ");
        }
       
}
}
