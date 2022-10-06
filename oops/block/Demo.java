class Demo{
    static int age;
    static{
        age=21;
    }
    static{
        age=18;
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("the dimple age is sweet"+age);
        System.err.println("program start");
    }
    static{
        age=16;
    }
}