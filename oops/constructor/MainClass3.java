class Demo3
{
    int x;
    int y;
    //constructor with parameter
    Demo3(int arg1,int arg2)
    {
        System.out.println(" running Demo2 constructor");
        //initializing instance variables
        x=arg1;
        y=arg2;
    }
}



public class MainClass3 {
    public static void main(String[] args) {
        System.out.println("main method statred");
        Demo3 d1=new Demo3(25, 35);
        System.out.println("x value is"+d1.x);
        System.out.println("y value is "+d1.y);

        System.out.println("........................");
        Demo3 d2=new Demo3(35, 45);
        System.out.println("x value is"+d2.x);
        System.out.println("y value is "+d2.y);
        System.out.println("main method ended");
    }
}
