//movie
class OnlinTicket
{
   int no_of_tickets;
   void viewavailableseats(){
    System.out.println("available seats"+no_of_tickets);
   }

   void bookingtickets(int n)
   {
    System.out.println("booking"+n);
    if(n<no_of_tickets)
    {
        no_of_tickets=no_of_tickets-n;
        System.out.println("booked success");
    }
    else{
        System.out.println("failed");
    }

   }

   void canceltickets(int n)
   {
    System.out.println("booking"+n+"tickets");
    no_of_tickets=no_of_tickets+n;
   }
}
class MainClass11 {
    public static void main(String[] args) {
        System.out.println("main method ended");
        OnlinTicket tc1=new OnlinTicket();
        tc1.no_of_tickets=100;
        tc1.viewavailableseats();
        tc1.bookingtickets( 10);
        tc1.bookingtickets(20);
        tc1.viewavailableseats();
        tc1.canceltickets(10);
        tc1.viewavailableseats();
        System.out.println("main method ended");

    }
}
