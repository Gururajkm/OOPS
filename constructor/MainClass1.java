class pen
{
    // attributes
    String brand;
    String color;
     double price;
    // constructor
    pen(String ag1,String arg2, double arg3)
     {
        brand=ag1;
        color=arg2;
        price=arg3;
           
//    behaviour
     void details()
{
    System.out.println("brand"+brand+"color"+color+"price"+price);

    }
    
}
}
class MainClass1
{
    public static void main(String[] args) 
    {
        System.out.println("main method started");
        pen p1=new pen("cello","black",25);
        p1.details();
        pen p2=new pen("reynolds","blue",30);
        p2.details();
        System.out.println("main method ended");
        }
         
     }
