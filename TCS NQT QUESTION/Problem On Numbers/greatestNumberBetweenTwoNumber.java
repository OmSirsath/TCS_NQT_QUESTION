import java.util.Scanner;

public class greatestNumberBetweenTwoNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();

        

        if(a>b){
            System.out.println(a+" ,a = Is the greater number");
        }
        else{
            System.out.println(b+ " ,b = Is the grater number");
        }
    }
}
