 class Person {
    static int sage;
    int nage;
    static{
        sage=21;
    }
    {
        nage=16;
    }
    {
        nage=22;
    }
    static{
        sage=24;
        System.out.println(sage);
    }
        public static void main(String[] args) {
            System.out.println("the dimple age is"+sage);
            System.out.println("programm start");
            Person p=new Person();
            System.out.println("the yash age is "+p.nage);
        }
        static{
            sage=18;
        }
    
}
