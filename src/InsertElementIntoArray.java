import java.util.Scanner;

public class InsertElementIntoArray {
    public static void main(String[] args) {
        int len, pos, x;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want in array: ");
        len = scanner.nextInt();
        int arr[] = new int[len + 1];
        System.out.println("Please enter all elements for your array: ");
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Please enter the position you want to insert the element into: ");
        pos = scanner.nextInt();
        if (pos > len + 1) {
            System.out.println("Position " + pos + " is out of bounds of this array.");
        } else {
            System.out.print("Please enter the element you want to insert: ");
            x = scanner.nextInt();
            for (int i = (len - 1); i >= (pos - 1); i--) {
                arr[i + 1] = arr[i];
            }
            arr[pos - 1] = x;
            System.out.print("Your array after inserting: ");
            for (int i = 0; i < len; i++) {
                System.out.print(arr[i] + ",");
            }
            System.out.print(arr[len]);
        }
    }
}