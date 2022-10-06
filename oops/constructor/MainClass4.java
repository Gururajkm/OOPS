

class Pen
{
    String brand;
    String color;
    double price;

      Pen(String args1, String args2,double args3)
        {
            brand =args1;
            color=args2;
            price=args3;
        }
        void details()
        {
            System.out.println("brand :"+brand+"color "+color+" priec :"+ price);
        }
    
}

class MainClass4 {
     public static void main(String[] args) {
        System.out.println("main method started");
        Pen p1=new Pen("cello","blue",25.00);
        p1.details();
        Pen p2=new Pen("renolds","black",35.00);
        p2.details();
        System.out.println("main method endedd");
     }
}
