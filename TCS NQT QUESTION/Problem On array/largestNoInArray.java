//Write a program to print a largest element in array
import java.util.Scanner;
public class largestNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int arr[] = new int[5];
        System.out.println("Enter the array element :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Largest no in array is :" + max) ;

        
    }
}
