import java.util.Arrays;
import java.util.Scanner;

public class SortNumericAndStringArray {
    public static void main(String[] args) {
        int noOfElemsInNumArray, noOfElemsInStringArray;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements you want in your NUMERIC array: ");
        noOfElemsInNumArray = scanner.nextInt();
        int myNumArray[] = new int[noOfElemsInNumArray];
        System.out.println("Please enter all " + noOfElemsInNumArray + " elements of your NUMERIC array you want to sort");
        for (int i = 0; i < noOfElemsInNumArray; i++) {
            myNumArray[i] = scanner.nextInt();
        }

        System.out.println("Your original NUMERIC array: " + Arrays.toString(myNumArray));
        Arrays.sort(myNumArray);
        System.out.println("Sorted NUMERIC array in ascending order: " + Arrays.toString(myNumArray));
        System.out.println(" ");

        System.out.print("Please enter the number of elements you want in your String array: ");
        noOfElemsInStringArray = scanner.nextInt();
        String myStringArray[] = new String[noOfElemsInStringArray];
        System.out.println("Please enter all " + noOfElemsInStringArray + " elements of your String array you want to sort: ");
        for (int i = 0; i < noOfElemsInStringArray; i++) {
            myStringArray[i] = scanner.next();
        }

        System.out.println("Your original STRING array: " + Arrays.toString(myStringArray));
        Arrays.sort(myStringArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Sorted STRING array in alphabetical order: " + Arrays.toString(myStringArray));
    }
}
