import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    static void reverse(int a[], int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        /*printing the reversed array*/
        System.out.print("\nThis is the reversed array: " + Arrays.toString(b));
    }

    public static void main(String[] args) {
        int len, myArray[];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want in array: ");
        len = scanner.nextInt();
        myArray = new int[len];
        System.out.println("Please enter your " + len + " elements");
        for (int i = 0; i < len; i++) {
            myArray[i] = scanner.nextInt();
        }
        System.out.println("This is your original array: " + Arrays.toString(myArray));
        reverse(myArray, myArray.length);
    }
}
