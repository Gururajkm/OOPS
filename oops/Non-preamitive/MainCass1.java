class Demo1
{
     int x=10;
     void test()
     {
        System.out.println("running test() method");
     }
}
class MainCalass1
{
    public static void main(String[] args) {
        System.out.println(" main method started");
        //declare non-premitive or refrence varible
        Demo1 d1;
        //initializing fefrence varible
        d1=new Demo1();
        //Assigning object to d1
        // or
        //d1 is name to object
        System.out.println("x value is  a  "+d1.x);
        d1.test();
        System.out.println("modiyfing x value");
        d1.x=20;
        System.out.println("x value is   "+d1.x);
    }
}