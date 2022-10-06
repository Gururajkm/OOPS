class Demo2
{
    int x=10;
    int y=20;
}

class MainClass2 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo2 d1= new Demo2();
        d1.x=50;
        d1.y=75;
        System.out.println("first object: x valie is "+d1.x+ "and y value is "+d1.y);
        Demo2 d2 =new Demo2();
        System.out.println("second object: x value is "+d2.x + "and y value is "+d2.y);
        System.out.println("main method ended");
    }
}
