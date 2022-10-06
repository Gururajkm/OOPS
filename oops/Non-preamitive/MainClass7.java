class Pen{
    String brand; //non static varible;
    String color; //non static varible;
    double price; //non static varible;
}
class MainClass7 {
    public static void main(String[] args) {
        System.out.println("main emthod started");
        Pen p1=new Pen();
        p1.brand="cello";
        p1.color="black";
        p1.price=45.00;
        System.out.println("brand: "+p1.brand  +"  color: "+p1.color  +"  price: Rs"+p1.price);
        Pen p2=new Pen();
        p2.brand="renolds";
        p2.color="blue";
        p2.price=25.00;
        System.out.println("brand: "+p2.brand  +"  color: "+p2.color  +"  price: Rs"+p2.price);
        System.out.println("main method ended");
       
    }
}
