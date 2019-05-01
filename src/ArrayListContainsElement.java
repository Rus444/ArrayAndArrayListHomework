import java.util.ArrayList;

public class ArrayListContainsElement {
    public static void main(String[] args) {
        // creating an Empty Integer ArrayList
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        // using add() to initialize values
        // [1, 2, 3, 4]
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("The list is: "+arr);

        // use contains() to check if the element
        // 2 exits or not
        int elem1=2;
        boolean ans = arr.contains(elem1);

        if (ans==true)
            System.out.println("The list contains "+elem1);
        else
            System.out.println("The list does not contain "+elem1);

        // use contains() to check if the element
        // 5 exits or not
        int elem2=5;
        ans = arr.contains(elem2);

        if (ans==true)
            System.out.println("The list contains "+elem2);
        else
            System.out.println("The list does not contain "+elem2);
    }
}
