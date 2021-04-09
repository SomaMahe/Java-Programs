public class DecimalCompare {
    /*
    Method areEqualByThreeDecimalPlaces with two parameters of type double.
    Method return boolean and it needs to return true if two double numbers are
    the same up to three decimal places. Otherwise, return false.
     */
    public static boolean areEqualByThreeDecimalPlaces(double dvalue1, double dvalue2){

        /*
        check if one value is negative ,the other one positive. In that case, return False)
         */
        if(dvalue1 > 0 && dvalue2 < 0 || dvalue1 < 0 && dvalue2 > 0)
        {
            return false;
        }

        /* 1.converting to whole value by multiplying with 1000 (since need to check 3 decimal points)
         */
        double d1Whole = dvalue1 *1000;
        double d2Whole = dvalue2 *1000;
        /*
           2.Type casting to int
         */
        int intVal1 =(int)d1Whole;
        int intVal2 =(int)d2Whole;

        /* If both values are equal, return True;
         */
        return intVal1 == intVal2;


    }

    }

