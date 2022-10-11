class appregistration
{
    String username;
    String password;
    String email;
    long phone;

appregistration(String arg1,String arg2,String arg3)
{
   username=arg1;
   password=arg2;
     email=arg3;
 }
  appregistration(String arg1,String arg2,long arg3)
  {
   username=arg1;
   password=arg2;
   phone=arg3;
}
  void details()
  {
    System.out.println("username: "+username+" password: "+password+" email: "+email+" phone: "+phone);
  }
}
class MainClass6
 {
    public static void main(String[] args) 
    {
      System.out.println("main method started");
    appregistration reg1 =new appregistration("siddu:  ", "siddu123 ","sidduk0106@gmail.com" );
     reg1.details();
    appregistration reg2 =new appregistration("dhanu@gmail.com  ","dhanu@123  " , 9945370951l);
   reg2.details();
    System.out.println("main method ended");
}
}
