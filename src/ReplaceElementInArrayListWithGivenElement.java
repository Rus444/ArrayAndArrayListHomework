import java.util.ArrayList;
import java.util.List;

public class ReplaceElementInArrayListWithGivenElement {
    public static void main(String[] args) {

        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Apple");
        fruitList.add("Orange");
        fruitList.add("Banana");
        fruitList.add("Mango");

        System.out.println("The original fruit list is:\t\t" + fruitList);

        fruitList.set(2, "Passion Fruit"); // add at 2nd index

        System.out.println("The amended fruit list is:\t\t" + fruitList);
    }
}
