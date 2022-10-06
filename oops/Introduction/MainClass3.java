 class Demo3 {
    static int x=10;
    int y=25;

    static void test()
    {
        System.out.println("running test() method");
    }

    void disp()
    {
        System.out.println("runnig disp() method");
    }

}
class MainClass3
{
    public static void main(String[] args) {
        System.out.println("main method started");
        new Demo3().disp();
        System.out.println("main method ended");
    }
}
