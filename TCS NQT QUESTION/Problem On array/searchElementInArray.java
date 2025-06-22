import java.util.Scanner;
public class searchElementInArray {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array element : ");

        for(int i = 0;  i<arr.length; i++){
             arr[i] = sc.nextInt();

        }
        System.out.println("Array element is :");
        for(int i  =0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Enter the search element :");
        int n = sc.nextInt();

        for(int i  =0; i<arr.length; i++){
            if(arr[i]==n){
                count++;
            }
        }
        if(count>0
        ){
            System.out.println("Item found");
        }
        else{
            System.out.println("Item not found");
        }
    }
}
