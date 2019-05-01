import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {
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

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if ((myArray[i] == myArray[j]) && (i != j)) {
                    System.out.println("Duplicate Element : " + myArray[j]);
                }
            }
        }
    }
}
