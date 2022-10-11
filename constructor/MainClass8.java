 class employee
{
   String name;
   String email;
   String designation;
    
employee(String  name,String email,String designation)
{
    this.name=name;
    this.email=email;
    this.designation=designation;
}

void details()
{
    System.out.println("name"+name+"email"+email+"designation"+designation);
}
}
class MainClass8 
{
    public static void main(String[] args)
     {
        System.out.println("main method started");
        employee e1=new employee("siddu","siddu@gmail.com","software engineer");
        e1.details();
        System.out.println("main method ended");
    }
}
