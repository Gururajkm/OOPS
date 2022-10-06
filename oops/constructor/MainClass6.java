class AppRegistration{
    String username;
    String password;
    String email;
    long phone;

    AppRegistration(String arg1,String arg2,String arg3)
    {
        username=arg1;
        password=arg2;
        email=arg3;
        
    }

    AppRegistration(String arg1,String arg2,long arg3)
    {
        username=arg1;
        password=arg2;
        phone=arg3;
    }

    void detailes(){
        System.out.println("username "+username+"  password  "+password+"  email  "+email+"  phone  "+phone);
    }
}
class MainClass6 {
    public static void main(String[] args) {
        System.out.println("main method started");
        AppRegistration d1=new  AppRegistration( "kailash","kai@123","kailash@123");
        AppRegistration d2=new  AppRegistration( "kailash","kai@123",8880828185l);
        d1.detailes();
        d2.detailes();
        System.out.println("main method ended");
    }
}
