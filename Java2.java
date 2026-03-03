public class Java2 {
    void meth1()
    {
        System.out.println("method 1 called succesfully");
        int no1=100;
        int no2=200;
        System.out.println("Addition:"+(no1+no2));
    }
    void meth2()
    {
        System.out.println("Method 2 called succesfully");
        int no1=234;
        int no2=878;
        System.out.println("Substraction:"+(no1-no2));
    }
    void meth3()
    {
        System.out.println("Method 3 called succesfully");
        int no1=23;
        int no2=75;
        System.out.println("Multiplicaton:"+(no1*no2));
    }
    void meth4()
    {
        System.out.println("Method 4 called succesfully");
        int no1=34;
        int no2=17;
        System.out.println("Division:"+(no1/no2));
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Program started");
        new Java2().meth1();
        new Java2().meth2();
        new Java2().meth3();
        new Java2().meth4();
        System.out.println("Program Ends Here");
    }
}


