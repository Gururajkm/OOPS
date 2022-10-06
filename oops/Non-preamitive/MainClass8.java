class NoteBook
{
    String brand;
    int pages;
    double price;
}
class MainClass8 {
    public static void main(String[] args) {
        System.out.println("main emthod started");
        NoteBook n1=new NoteBook();
        n1.brand="classmate";
        n1.pages=200;
        n1.price=50.00;
        System.out.println("brand: "+n1.brand  +"  pages: "+n1.pages +"  price: Rs"+n1.price);
        NoteBook n2=new NoteBook();
        n2.brand="page edge";
        n2.pages=100;
        n2.price=25.00;
        System.out.println("brand: "+n2.brand  +"  pages: "+n2.pages  +"  price: Rs"+n2.price);
        System.out.println("main method ended");
       
    }
}
