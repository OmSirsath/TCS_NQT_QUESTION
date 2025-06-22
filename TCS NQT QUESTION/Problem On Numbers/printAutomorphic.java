import java.util.Scanner;

public class printAutomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n = sc.nextInt();


        System.out.println("Automorphic number between 1 to " + n + "are :");

        for(int i = 1; i<=n; i++){
            int square = i*i;
            int temp= i;
            boolean isAutomorphic = true;

        
        while(temp != 0){
            if(temp % 10 != square % 10){
                isAutomorphic = false;
                break;
            }
            temp = temp / 10;
            square = square / 10;
        }
        if(isAutomorphic){
            System.out.println(i);
        }
    }

       

    }
}
