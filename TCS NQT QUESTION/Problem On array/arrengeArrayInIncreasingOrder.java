import java.util.Scanner;
public class arrengeArrayInIncreasingOrder {
    public static void main(String[] args) {
        int arr[] =new int[5];  // integer type array
        Scanner sc = new Scanner(System.in);   // this is the Scanner class object  for input
        System.out.println("Enter the array element :");
        for(int i = 0; i<arr.length; i++){   //this forloop is used for insert the element
             arr[i] = sc.nextInt(); // take array input

        }
        
        for(int i = 0; i<arr.length; i++){ //select the element
            for(int j = i+1; j<5; j++){ // this loop used for sorting in asending order
                if(arr[i]>arr[j]){
                    //Swapping logic
                    int temp  = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                }
            }
        }
        System.out.println("Arrenge array element is :");
        for(int i = 0; i<arr.length;i++){    //this forloop is used for print the element
            System.out.println(arr[i] +" ");
        }

    }
}
