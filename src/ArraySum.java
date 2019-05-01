import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        //declare integer noOfElemsInArray and set integer sum to 0
        int noOfElemsInArray, sum=0;
        //create object of the Scanner class
        Scanner scanner=new Scanner(System.in);
        //request user input for the number of elements in the array
        System.out.println("Please enter the number of elements you want in array: ");
        //scan and store the user-input value
        noOfElemsInArray=scanner.nextInt();
        //initializ array of integers
        int myArr[]=new int[noOfElemsInArray];
        //request user input for all elements
        System.out.println("Please enter all elements of the array: ");
        //for loop to scan and add all elements of the array
        for (int i = 0; i < noOfElemsInArray; i++) {
            myArr[i]=scanner.nextInt();
            sum=sum+myArr[i];
        }
        System.out.println("Your array elements are: " + Arrays.toString(myArr));
        System.out.println("The sum of all elements in the above array is: "+sum);
    }
}
