public class _Assignment5 {


        public static final void test(){
            System.out.println("in test final");
        }

        public static void main(String[] args) {
            //incorrect way of calling the static method - using object
          // this.test();

            //correct way of calling the static method using class name
            _Assignment5.test();
        }
    }
