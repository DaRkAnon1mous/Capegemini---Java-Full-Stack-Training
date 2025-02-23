import java.util.Scanner;

class Ticket{
    private int ticketid,price;
    private static int availTicket;
    public void setTicketId(int ticketid){
        this.ticketid=ticketid;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public static void setAvailTicket(int availTicket){
        Ticket.availTicket=availTicket;
    }
    public int getTicketId(){
        return ticketid;
    }
    public int getPrice(){
        return price;
    }
    public static int getAvailTicket(){
        return availTicket;
    }
    public int calculateT(int noTi){
        if(availTicket>=noTi){
            availTicket-=noTi;
            return price*noTi;
        }
        return -1;
    }
}




public class Movietickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name");
        String m = sc.nextLine();
        System.out.println("Enter no of bookings");
        int bo = sc.nextInt();
        System.out.println("Enter the available tickets");
        int av = sc.nextInt();
        Ticket.setAvailTicket(av);
        while(bo!=0){
            System.out.println("Enter the ticketid");
            int t1 = sc.nextInt();
            System.out.println("Enter the price");
            int pr = sc.nextInt();
            System.out.println("Enter the no of tickets");
            int nt = sc.nextInt();
            Ticket tt = new Ticket();
            tt.setTicketId(bo);
            tt.setPrice(pr);
            
            System.out.println("Available tickets:"+Ticket.getAvailTicket());
            int cost = tt.calculateT(nt);
            if(cost==-1){
                System.out.println("Tickets are not available");
            }else if(Ticket.getAvailTicket()==0){
                System.out.println("Total amount:"+cost);
                System.out.println("House full");
                break;
            }else{
                System.out.println("Total amount:"+cost);
                System.out.println("Total amount:"+Ticket.getAvailTicket());
            }
            }



        }

    }

