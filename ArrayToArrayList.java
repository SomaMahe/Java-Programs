
import java.util.*;

    public class ArrayToArrayList {
        public static void main(String[] args) {
// 1. First Method using Arrays.asList(array_name)
            /* Array Declaration and initialization*/
            String citynames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

            /*Array to ArrayList conversion*/
            ArrayList<String> citylist= new ArrayList<String>(Arrays.asList(citynames));

            /*Adding new elements to the converted List*/
            citylist.add("New City2");
            citylist.add("New City3");
            citylist.remove("Bhopal");

            /*Final ArrayList content display using for*/
            for (String str: citylist)
            {
                System.out.println(str);
            }

    // 2. Second method - using Collections.addAll(ArrayList,array_name)

            /* Array Declaration and initialization*/
            String array[]={"Hi", "Hello", "Howdy", "Bye"};

            /*ArrayList declaration*/
            ArrayList<String> arraylist= new ArrayList<String>();

            /*Conversion*/
            Collections.addAll(arraylist, array);
            /*Adding new elements to the converted List*/
            arraylist.add("String1");
            arraylist.add("String2");

            /*Display array list*/
            for (String str: arraylist)
            {
                System.out.println(str);
            }
     // Method 3: Manual way of adding array elements to arrayList

            /*ArrayList declaration*/
            ArrayList<String> arraylist1= new ArrayList<String>();

            /*Initialized Array*/
            String array1[] = {"Text1","Text2","Text3","Text4"};

            /*array.length returns the current number of
             * elements present in array*/
            for(int i =0;i<array1.length;i++)
            {

                /* We are adding each array's element to the ArrayList*/
                arraylist1.add(array1[i]);
            }

            /*ArrayList content*/
            for(String str: arraylist1)
            {
                System.out.println(str);
            }
        }
    }
