class MyProgram2 {
    public static void main(String args[])
    {
        System.out.println("Printing from main");
        MyProgram2 obj;
        obj= new MyProgram2();
        obj.func();
    }

    private void func()
    {
        System.out.println("Printing from function");
    }
}
