class Demo2
{
    int x;
    int y;

  Demo2()
  {
    System.out.println("rinning successfull constructor");
    x=10;
    y=20;
  }
}

  class MainClass2
  {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo2 d1=new Demo2();
        System.out.println("x value is"+d1.x);
        System.out.println("x value is"+d1.y);
        System.out.println("main method started");

    }
  }