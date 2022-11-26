import java.util.ArrayList;
public class aryList {
    public static void main (String[] args){
        Integer i=10;
        ArrayList a = new ArrayList<>();  //creating objects with default constructor
        a.add(i);
        a.add("print me");
        System.out.println(a);

        ArrayList a2 = new ArrayList<>(a);  //passing a collection
        a2.add(90);
        System.out.println(a2);

       // specifying own size
       ArrayList arry = new ArrayList<>(22);
        arry.add("creation of own size arraylist");
        System.out.println(arry);


    }
}
