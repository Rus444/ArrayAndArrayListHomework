import java.util.ArrayList;
import java.util.List;

public class IndexOfElementInArrayList {
    public static void main(String[] args) {
        List aList = new ArrayList();
        aList.add("Orange");
        aList.add("Apple");
        aList.add("Peach");
        aList.add("Guava");
        aList.add("Mango");
        System.out.println("The original array is:\t\t\t\t\t\t\t"+aList);
        System.out.println("The index of the element Apple in FruitList is: " +
                aList.indexOf("Apple"));
    }
}
