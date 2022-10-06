class Demo4
{
    int x=10;
    int y=20;
}

class MainClass4 {
    public static void main(String[] args) {
        System.out.println("main method started");
        Demo4 d1=new Demo4();
        //object address is assigned to d1
        Demo4 d2= new Demo4();
        //object address is assigned to d2
        System.out.println(d1);//printing refrence variable
        System.out.println(d2);
        System.out.println("main method ended");
    }
}
