import java.util.*;

public class Secondlargest {

    // static int largestno(int arr[]) {
    // int max = arr[0];
    // for (int i = 0; i < 10; i++) {
    // if (max < arr[i]) {
    // max = arr[i];
    // }
    // }
    // return max;
    // }

    static void seclargestno(int arr[]) {
        int max = arr[0];
        int secMax = -1;

        for (int l = 0; l < 10; l++) {
            if (max < arr[l]) {
                secMax = max;
                max = arr[l];
            } else if (secMax < arr[l] && arr[l] != max) {
                secMax = arr[l];
            }
        }
        System.out.println("Second largest number :-  " + secMax);
    }

    public static void main(String ar[]) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array : \n");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // System.out.println("Element of array is : \n");
        // for (int i = 0; i < 10; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // int x = largestno(arr);

        // System.out.println("larget element is : " + x);

        seclargestno(arr);

    }

}
