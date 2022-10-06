class Circle
{
    double radius;
    final static double pi=3.14;

    void daimeter()
    {
        double d1=2*radius;
        System.out.println("diameter is "+d1);
    }
    void area(){
        double a1=pi*radius*radius;
        System.out.println("area is "+a1);
    }
    void circumference()
    {
        double c1=pi*radius*radius;
        System.out.println("circumference is "+c1);
    }
}
class MainClass10 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Circle c1=new Circle();
        c1.radius=2.1;
        System.out.println("circle radius is "+c1.radius);
        c1.area();
        c1.daimeter();
        c1.circumference();
        System.out.println("..................................");

        Circle c2=new Circle();
        c2.radius=3.1;
        System.out.println("circle radius is "+c2.radius);
        c2.area();
        c2.daimeter();
        c2.circumference(); 

        System.out.println("main method ended");
    }
    
}
