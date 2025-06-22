import java.util.Scanner;
public class sumOfArrayElement {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array element :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Array Element :");
        for(int i = 0; i<arr.length; i++){ 
            System.out.println(arr[i] + " ");
            sum =  arr[i] + sum;

        }
        System.out.println("Addition of array element is :" + sum);
    }
}
