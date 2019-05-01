import java.util.Arrays;
import java.util.Scanner;

public class IndexOfAnElement {
    public static void main(String[] args) {
        //declare the variables for size of the array, element and array
        int len, elem, myArray[];
        //create object of the Scanner class
        Scanner scanner = new Scanner(System.in);
        //request user input for a number of elements in the array
        System.out.print("Please enter the number of elements you want in your array: ");
        //scan the value and and set it as the number of elements of the array
        len = scanner.nextInt();
        myArray = new int[len];
        //request user input for all elements of the array
        System.out.println("Please enter your " + len + " integers: ");
        //scan and store all array values from user input
        int ind;
        for (ind = 0; ind < len; ind++)
            myArray[ind] = scanner.nextInt();
        //print the array
        System.out.println("This is your original array: " + Arrays.toString(myArray));
        //request user input for value to be searched for and store it in search variable
        System.out.println("Now enter the element of the above array whose index you want to identify: ");
        elem = scanner.nextInt();
        //for all elements of the array compare them with the user-entered
        //value and print it's index location in the array
        boolean found = false;
        for (ind = 0; ind < len; ind++) {
            if (myArray[ind] == elem) {
                found = true;
                System.out.println("Index of the element " + elem + " is " + ind + ".");
            }
        }
        //if all elements of the array have been compared with the user-entered value
        //and it's not present in this array, then print the respective message
        if (!found)
            System.out.println(elem + " isn't present in this array.");
    }
}
