 class Demo1 {
    static int x=10;
    static void test()
    {
        System.out.println("running test() method");
    }
}
class MainClass1
{
    public static void main(String[] args) {
        System.out.println("main method strted");
        System.out.println("x value is"+Demo1.x);
        Demo1.test();
        Demo1.x=20;
        System.out.println("x value is "+Demo1.x);
        System.out.println("main method ended");
    }
}
