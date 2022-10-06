class Demo6
{
    int x=100;//non static variable

    void display(){
        int x= 200;//local variable
        System.out.println("loacal variable x value is "+x);
        System.out.println("non static variable x value is  "+this.x);
    }

    
}
class MainClass7 {
    public static void main(String[] args) {
        Demo6 d1=new Demo6();
        d1.display();
    }

   

