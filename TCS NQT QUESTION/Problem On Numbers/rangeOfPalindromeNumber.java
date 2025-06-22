import java.util.Scanner;
public class rangeOfPalindromeNumber {
    public static void main(String[] args) {
        int start,end;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting range :");
        start = sc.nextInt();
        System.out.println("Enter the ending range :");
        end = sc.nextInt();


        int count = 0;
        System.out.println("palindrome numbers are :");

        for(int i = start; i<end; i++){
            int num = i;
            int rev = 0;

            while(num>0){
                int r = num%10;
                rev = (rev * 10) + r;
                num = num / 10;

            }
            if(i==rev){
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Total palindrome number found : " + count);

    
    }
}
