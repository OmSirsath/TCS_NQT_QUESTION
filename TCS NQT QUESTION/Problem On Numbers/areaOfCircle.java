import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        int area, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius :");
        r = sc.nextInt();

        area = (int) (3.14 * r * r);
         System.out.println(area);
    }
    
}
