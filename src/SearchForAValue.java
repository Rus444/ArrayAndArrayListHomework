import java.util.Scanner;

public class SearchForAValue {
    public static void main(String[] args) {
        //declare the variables for number of elements in the array, element to locate and array
        int count, no, numToLocate, myArray[];
        //create object of the Scanner class
        Scanner scanner = new Scanner(System.in);
        //request user input for a number of elements in the array
        System.out.println("Please enter the number of elements you want in your array: ");
        //scan the value and and set it as the number of elements of the array
        no = scanner.nextInt();
        myArray = new int[no];
        //request user input for all elements of the array
        System.out.println("Please enter your " + no + " integers: ");
        //scan and store all array values from user input
        for (count = 0; count < no; count++)
            myArray[count] = scanner.nextInt();
        //request user input for value to be searched for and store it in search variable
        System.out.println("Enter the value you want to find");
        numToLocate = scanner.nextInt();
        //for all elements of the array compare them with the value to be located
        //and print a respective message if the value is found
        boolean found = false;
        for (count = 0; count < no; count++) {
            if (myArray[count] == numToLocate) {
                found = true;
                System.out.println(numToLocate + " is present at location " + (count + 1) + ".");
            }
        }
        //if all elements of the array have been compared with the searched for value
        //and it's not found, then print the respective message
        if (!found)
            System.out.println(numToLocate + " isn't present in this array.");
    }
}