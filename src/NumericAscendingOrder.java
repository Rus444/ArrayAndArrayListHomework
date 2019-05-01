import java.util.Scanner;
//This task was NOT part of the homework
public class NumericAscendingOrder {
    public static void main(String[] args) {
        //declare integer variables noOfElemsInArray and temp
        int noOfElemsInArray, temp;
        //create object of a Scanner class
        Scanner scanner = new Scanner(System.in);
        //request user input for a number of elements in array
        System.out.print("Please enter the number of elements you want in array: ");
        //scan and store user input in noOfElemsInArray
        noOfElemsInArray = scanner.nextInt();
        int a[] = new int[noOfElemsInArray];
        //request user input for array elements
        System.out.println("Please enter all " + noOfElemsInArray + " elements of your array");
        //for loop to take in all elements
        for (int i = 0; i < noOfElemsInArray; i++) {
            a[i] = scanner.nextInt();
        }
        //nested for loop to compare every array element with
        //the next element and sort in ascending order
        for (int i = 0; i < noOfElemsInArray; i++) {
            for (int j = i + 1; j < noOfElemsInArray; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        //print elements in ascending order separated by comma, except the last one
        System.out.print("Your array in ascending order:");
        for (int i = 0; i < noOfElemsInArray - 1; i++) {
            System.out.print(a[i] + ",");
        }
        //print last element of the array
        System.out.print(a[noOfElemsInArray - 1]);
    }
}