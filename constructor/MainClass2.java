class employee
{
    // attributes
    String ename:
    int empno;
    String job;
    double salary;
//    constructor
        employee(String arg1,int arg2,String arg3,double arg4) 
              ename=arg1;
              empno=arg2;
              job=arg3;
              salary=arg4;
// behaviour
void details()
{
    System.out.println("ename"+ename+"empno"+empno+"job"+job+"salary"+salary);

}

}
class MainClass2 
{
    public static void main(String[] args)
     {
        System.out.println("main method started");
        employee e1=new employee("smith" ,"7760","manager",4000);
        e1.details();
    }
}
