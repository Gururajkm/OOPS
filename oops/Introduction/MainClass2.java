
 class Demo2 {
    int y=10;
    void disp()
    {
        System.out.println("running disp() method");
    }

}
class MainClass2
{
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("y value is"+new Demo2().y);
        new Demo2().disp();
        System.out.println("main method ended");
    }
}

