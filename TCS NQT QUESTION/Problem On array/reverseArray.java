import java.util.Scanner;
public class reverseArray {
     public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element :");
        for(int i = 0;  i<arr.length; i++){
                arr[i] = sc.nextInt();

        }
        
        System.out.println("Array element is : ");
        for(int i = 0;  i<arr.length; i++){
                System.out.println(arr[i]);
            
        }
        System.out.println("Array in reverse order : ");
        for(int i = arr.length-1;  i>=0; i--){
                System.out.print(" "+arr[i]);
            
        }
     }
}
