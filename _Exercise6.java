public interface _Exercise6 {

    static void test() {
        System.out.println("test");
    }

    /*void test5() {
        System.out.println("test");
    }*/
    // The above code will throw error as it is not static or default.
    // Methods in interface should not have definition except for Static and default methods .
    // SO rewriting method as default/static ,otherwise remove method definition

    default void test5() {
        System.out.println("test");
    }

    void test3();

    abstract void test4();


    default int defaultMethod(){
        System.out.println("test2");
        return 1;
    }

}