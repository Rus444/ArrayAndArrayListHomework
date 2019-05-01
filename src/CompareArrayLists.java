import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List 1: "+c1);

        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List 2: " +c2);

        //Storing the comparison output in ArrayList<String>
        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println("Does List 1 contain List 2?");
        System.out.println(c3);

    }
}
