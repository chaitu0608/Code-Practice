import java.util.*;
public class stringvectors{
    public static void main(String[] args) {
        Vector list = new Vector();
        list.add("Ram");
        list.add("Sham");
        list.add(23);
        System.out.println("The list is " + list);
        list.add(1,76);
        System.out.println(list);
    }
}
