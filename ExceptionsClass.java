public class ExceptionsClass {

    public static void main(String[] args) {

        try{
            test("automation");
        }
        catch (Exception e){
            System.out.println("Exception");
        }


    }

    public static int test(String name) throws NullPointerException,ArithmeticException{
        name=null;
        System.out.println("Null value");

        if(name.equals("Java")){
            System.out.println("Java");
        }
        System.out.println("Divide by zero");

        return 1/0;
    }
}