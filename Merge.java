import java.util.*;

public class Merge {
    public static void main(String ar[]) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of array 1 : \n");
        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the element of array 2 : \n");
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("hh");
        int arr3[] = new int[10];
        int x = 0;
        System.out.println("The element of array 3 : \n");
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                arr3[i] = arr1[i];
            } else if (i >= 5 && i < 10) {
                arr3[i] = arr2[x];
                x++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
}
