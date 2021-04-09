

class ExerciseException {
    public static void main(String[] args) {
        test();

    }

    public static void test() {
        try{
            IllegalStateExceptionClass.test();
        }
        catch(IllegalStateException e){
            System.out.println("IllegalStateException");
        }
    }


}


public class IllegalStateExceptionClass{

    public static void test() throws IllegalStateException {
        throw new IllegalStateException();
    }
}