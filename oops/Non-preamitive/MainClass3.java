class Demo3
{
    int x=10;
    int y=20;
}

class MainClass3 {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println(new Demo3().x);
        System.out.println(new Demo3().y);
        System.out.println(new Demo3());
        System.out.println(new Demo3());
        System.out.println("main method ended");
    
    }
}
