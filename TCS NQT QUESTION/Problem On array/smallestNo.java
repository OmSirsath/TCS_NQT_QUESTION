//write aprogram to print a smallest no in array.
import java.util.Scanner;
public class smallestNo {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array element :");
        for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
        }
            int min=arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            System.out.println("smallest no in array is :"+ min);
    }
}
