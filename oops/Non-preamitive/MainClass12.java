class BankAccount{
    int bankbalance;
    void viewbalance()
    {
        System.out.println("view balance"+bankbalance);

    }
    void deposit(int n)
    {
        bankbalance=bankbalance+n;
        System.out.println("deposit amount"+n);
        
    }
    void withdraw( int n)
    {
        System.out.println("withdraw amount"+ n);
        if(n<=bankbalance)
        {
            bankbalance=bankbalance-n;
            System.out.println(" withdarw suscessful");
        }
        else{
            System.out.println("insufficient balance");
        }
    }

}


class MainClass12 {
    public static void main(String[] args) {
        System.out.println("main method started");
         BankAccount b1=new BankAccount();
         b1.bankbalance=10000;
         b1.viewbalance();
         b1.deposit(5000);
         b1.viewbalance();
         b1.withdraw(5000);
         b1.withdraw(10000);
         b1.viewbalance();
        System.out.println("main method endedd");
    }
}
