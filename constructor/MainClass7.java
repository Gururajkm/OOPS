class demo6
{
int x=100;//non-static variable//* 

void display()
{
    int x=200;//local variable
    System.out.println("local variable x value is"+x);
    System.out.println("non static variable x value is"+this.x);
}
}
class MainClass7
 {
    public static void main(String[] args)
     {
        System.out.println("main method started");
        demo6 d1=new demo6();
          d1 .display();
System.out.println("main method ended");
    }
}
