class Employee
{
    String name;
    String email;
    String designation;

    Employee(String name,String email,String designation)
    {
        this.name=name;
        this.email=email;
        this.designation= designation;

    }

    void details(){
        System.out.println("name: "+name+"email"+"designation"+designation);
    }
}
class MainClass8 
{
    public static void main(String[] args) 
    {
    System.out.println("main method ended");
    Employee e1=new Employee("kaialsh", "kailash@123", "software engineer");
    e1.details();
    } 
}

