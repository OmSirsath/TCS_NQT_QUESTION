import java.util.Scanner;
public class averegeOfTheAllElement {
    public static void main(String[] args) {
       int arr[] = new int[5];
       int sum = 0;
       int avarege = 0;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array element :");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
            sum = arr[i] + sum;
            avarege = sum/arr.length;
        }
        System.out.println("Average of array element is " +  avarege);

    }
}
