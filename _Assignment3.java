public class _Assignment3 {

    public static void main(String[] args) {

// Key takeaway : order of exceptions should be from specific to general
        try{
            int a=1/0;
        }
        catch(NullPointerException e){
            System.out.println("Caught Null Pointer Exception");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught ArrayIndexOutOfBoundsException Exception");
        }
// incorrect way
  /*      catch(Exception e){
            System.out.println("Caught Exception");
        }*/
        catch(ArithmeticException e){
            System.out.println("Caught Exception");
        }
        //correct way
        catch(Exception e){
            System.out.println("Caught Exception");
        }



    }
}
