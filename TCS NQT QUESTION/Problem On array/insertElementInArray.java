  import java.util.Scanner;
public class insertElementInArray {
    public static void main(String[] args) {
        int size,loc,item,i;  //location
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :");
        size = sc.nextInt();
        int arr[] = new int[size+1];
        System.out.println("Enter the "+size +" Array element :");
        for(i = 0; i<size; i++){  //tis loop is used for data input
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the index to insert at (0 to " + size + "): ");
        loc = sc.nextInt();

        if (loc < 0 || loc > size) {
            System.out.println("Invalid location!");
            return;
        }

        System.out.println("Enter the new item :");
        item = sc.nextInt();

        for(i = size; i>loc;i--){ // this for loop is used for decrease the  position of the array 
            arr[i] = arr[i-1];

        }
        arr[loc] = item;
        size++;
        for(i = 0; i<size ;i++){ // this for loop is used for print the array element 
            System.out.print(arr[i]+ " ");

        }

    }
}
