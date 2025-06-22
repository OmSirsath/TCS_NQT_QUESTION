import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        System.out.println("Enter the value of c :");
        c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" Is the greater number :");
            }
            else{
                System.out.println(c+" Is the greater number :");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" Is the greater number :");
            }
            else{
                System.out.println(c+" Is the greater number :");
            }
        }
    }
}
