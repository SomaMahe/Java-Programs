
    interface calculate
    {
        void cal(int item);
    }
    class Display implements calculate
    {
        int x;
        public void cal(int item)
        {
            x = item * item;
        }
    }
    class InterfaceClass
    {
        public static void main(String args[])
        {
            Display arr = new Display();
            arr.x = 0;
            arr.cal(2);
            System.out.print(arr.x);
        }
    }
