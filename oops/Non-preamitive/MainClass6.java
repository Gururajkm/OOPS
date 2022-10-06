class Demo6
{
    //non-static variable
    int x=10;
    int y=20;
}
class MainClass6 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo6 d1= new Demo6();
        Demo6 d2=d1;

        System.out.println("d1......>"+d1);
        System.out.println("d2.....>"+d2);
        d1.x=100;
        d1.y=200;
        System.out.println("x value using d1 is"+d1.x);
        System.out.println("x value using d1 is"+d1.y);

        System.out.println("x value using d1 is"+d2.x);
        System.out.println("x value using d1 is"+d2.y);
        System.out.println("main method ended");


    }
}
