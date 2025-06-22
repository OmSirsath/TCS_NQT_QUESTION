import java.util.Arrays;
import java.util.Scanner;
public class findMedian {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element in array :");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            
        }
        Arrays.sort(arr);
        if(arr.length%2!=0){
            int idx = arr.length/2;
            System.out.println("Median = " + arr[idx]);
        }
        else{
            int idx = arr.length/2;
            int mediun  = (arr[idx]+arr[idx-1])/2;
            System.out.println("Median = " + mediun);
        }

    }
}
