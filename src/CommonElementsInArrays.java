import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want in Array1: ");
        int len1 = scanner.nextInt();
        String myArray1[] = new String[len1];

        for (int i = 0; i < len1; i++) {
            System.out.println("Please enter String number " +(i+1)+": " );
            myArray1[i] = scanner.next();
        }

        System.out.print("Please enter the number of elements you want in Array2: ");
        int len2 = scanner.nextInt();
        String myArray2[] = new String[len2];

        for (int i = 0; i < len2; i++) {
            System.out.println("Please enter String number " +(i+1)+": " );
            myArray2[i] = scanner.next();
        }

        System.out.println("This is your original Array1: " + Arrays.toString(myArray1));
        System.out.println("This is your original Array2: " + Arrays.toString(myArray2));

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < myArray1.length; i++) {
            for (int j = 0; j < myArray2.length; j++) {
                if (myArray1[i].equals(myArray2[j])) {
                    set.add(myArray1[i]);
                }
            }
        }

        System.out.println("Common element : " + (set));     //OUTPUT : [THREE, FOUR, FIVE]
    }
}
