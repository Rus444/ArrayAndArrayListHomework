import java.util.Arrays;
import java.util.Scanner;

public class EqualityOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want in Array1: ");
        int len1 = scanner.nextInt();
        String myArray1[] = new String[len1];

        for (int i = 0; i < len1; i++) {
            System.out.println("Please enter String number " + (i + 1) + ": ");
            myArray1[i] = scanner.next();
        }

        System.out.print("Please enter the number of elements you want in Array2: ");
        int len2 = scanner.nextInt();
        String myArray2[] = new String[len2];

        for (int i = 0; i < len2; i++) {
            System.out.println("Please enter String number " + (i + 1) + ": ");
            myArray2[i] = scanner.next();
        }

        System.out.print("Please enter the number of elements you want in Array3: ");
        int len3 = scanner.nextInt();
        String myArray3[] = new String[len3];

        for (int i = 0; i < len3; i++) {
            System.out.println("Please enter String number " + (i + 1) + ": ");
            myArray3[i] = scanner.next();
        }

        System.out.println("This is your original Array1: " + Arrays.toString(myArray1));
        System.out.println("This is your original Array2: " + Arrays.toString(myArray2));
        System.out.println("This is your original Array3: " + Arrays.toString(myArray3));

        System.out.println("Is Array1 equals to Array2 : " +
                Arrays.equals(myArray1, myArray2));
        System.out.println("Is Array1 equals to Array3 : " +
                Arrays.equals(myArray1, myArray3));
        System.out.println("Is Array2 equals to Array3 : " +
                Arrays.equals(myArray2, myArray3));
    }
}
