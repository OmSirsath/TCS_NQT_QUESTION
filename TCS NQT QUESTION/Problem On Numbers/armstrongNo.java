//For an n-digit number, if the sum of its digits each raised to the power n is equal to the number itself, then it is an Armstrong number.
//153 → 3 digits 1^3+5^3+3^3 = 1+125+27 = 153 
import java.util.Scanner;
public class armstrongNo {
    public static void main(String[] args) {
        int n,arm  = 0,c;
        System.out.println("Enter any number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;  // c variable use for comparision purpose
        while(n>0){
            int rem = n % 10;
            arm = (rem * rem * rem)+arm;
            n = n /10;
         }
         if(c==arm){
            System.out.println("It is armstrong number :");
         }
         else{
            System.out.println("It is not armstrong number :");
         }


    }
}
