// An automorphic number is an integer whose square ends with the given integer,
// eg. (25)^2 = 625.(Ending with 25 That is called as automorphic number )

import java.util.Scanner;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();

        int square = n*n;
        boolean isautomorphic = true;

        while(n != 0){
            if(n % 10 != square % 10){
                isautomorphic = false;
                break;
            }
            n = n / 10;
            square = square / 10;
        }

        if(isautomorphic){
            System.out.println("It is automorphic ");
        }
        else{
            System.out.println("It is not automorphic");
        }
 
    }
}
