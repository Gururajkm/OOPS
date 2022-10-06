class Demo5
{
    int x=10;
    int y=20;
}
class MainClass5 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo5 d1=new Demo5();
        System.out.println("d1....>"+d1);
        d1.x=25;
        d1.y=35;
        d1= new Demo5();//re intialization of rfrence variable
        System.out.println("d1......>"+d1);
        System.out.println("x value is "+d1.x);
        System.out.println("y value is "+d1.y);
        System.out.println("main method ended");

    }
}
