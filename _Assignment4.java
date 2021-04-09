public class _Assignment4 {
    //Key takeaway - Final method cannot be overridden in subclass
    //incorrect way
  /*  public final void test(){
        System.out.println("in test final");
    }*/

    //correct way
    public  void test(){
        System.out.println("in test final");
    }
}


class Exercise5 extends _Assignment4{

    public void test(){
        System.out.println("in test final");
    }

    public static void main(String[] args) {
        Exercise5 exercise5=new Exercise5();
        exercise5.test();
    }
}
