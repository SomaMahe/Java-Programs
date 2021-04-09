
import java.util.*;
    public class SortArrayList
    {
        public static void main(String args[])
        {
// creating object of ArrayList class
            ArrayList<String> list = new ArrayList<String>();
// adding elements to the ArrayList
            list.add("Java");
            list.add("CPP");
            list.add("Python");
            list.add("BASIC");

// printing the unsorted ArrayList
            System.out.println("Before Sorting: "+ list);
// Sorting ArrayList in ascending Order
            Collections.sort(list);
// printing the sorted ArrayList
            System.out.println("After Sorting: "+ list);

// using Collection.reverseOrder() for descending order
            Collections.sort(list, Collections.reverseOrder());
            System.out.println("Reverse order"+list);
        }
    }
