import java.util.Scanner;

public class maxMinDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        int maxDigit = 0;
        int minDigit = 9;

        while(num >0){
         int digit = num % 10;

         if(digit > maxDigit){
            maxDigit = digit;
         }
         if(digit < minDigit){
            minDigit = digit;
         }
          num = num / 10;
        }

        System.out.println("maximum digit :" + maxDigit);
        System.out.println("minimum Digit :" + minDigit);

    }
}
