import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String a[]){
        ArrayList<String> nameList = new ArrayList<String>();

        //Adding elements to the ArrayList
        nameList.add("Alex");
        nameList.add("Bhavin");
        nameList.add("Adrian");
        nameList.add("Sergio");
        System.out.println("The Original ArrayList:\t\t\t\t\t"+nameList);

        ArrayList<String> newNameList = (ArrayList<String>)nameList.clone();
        System.out.println("Shallow copy of ArrayList:\t\t\t\t"+ newNameList);

        //add and remove on original ArrayList
        nameList.add("Chris");
        nameList.remove("Bhavin");

        //Display of both ArrayLists after add & remove
        System.out.println("The Original ArrayList after changing:\t"+nameList);
        System.out.println("Cloned ArrayList:\t\t\t\t\t\t"+newNameList);
    }
}
