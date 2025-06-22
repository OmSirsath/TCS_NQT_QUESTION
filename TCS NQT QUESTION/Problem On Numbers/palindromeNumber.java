// A palindrome number is a number that remains the same when its digits are reversed.
// 121 → reversed = 121 ✅
import java.util.Scanner;

public class palindromeNumber {

    public static void main(String[] args) {
        int n; 
        int s = 0;
        System.out.println("Enter the any number :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int c = n;  // this is used for the comparision 
        while (n>0) {
            int r=n%10;
            s=(s*10)+r; // this is the logic of palindrom number 
            n=n/10;
        }
        if(c==s){
            System.out.println("It is the palindrom number :");
        }
        else{
            System.out.println("It is not palindrom number :");
        }
    }
}