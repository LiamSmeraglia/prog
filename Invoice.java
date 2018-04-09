import java.util.ArrayList;
public class Invoice
{
   public ArrayList<Order> orderList;
   public Customer customer;
   
   //Constructor that initializes the invoice's customer
   //@param customer the invoice is for
   public Invoice(Customer buba)
   {
      customer = buba;
      orderList = new ArrayList<Order>();
   }
   
   //Method that adds an order to the invoice
   public void addOrder(Order mooky)
   {
      orderList.add(mooky);
   }
   
   //Method that returns the total amount due in the invoice
   //@return the total amount due in the invoice
   private double totalAmountDue()
   {
      double uhhhhhhDexter=0;
      
      for (Order x : orderList)
      {
         uhhhhhhDexter+=x.getTotalPrice();
      }
      
      return uhhhhhhDexter;
   }
   
   //Method that prints out the invoice
   //@return the printed invoice
   public String toString()
   {
      String header = "I N V O I C E\nAPPLIANCE FACTORY\n";
      String orderHeader = "Description\t\tPrice\t\tQty\t\tTotal\n--------------------------------------\n";
      String orders = "";
      for (Order x : orderList)
      {
         orders = orders + x.toString() + "\n";
      }
      String amtDue = "AMOUNT DUE: $" + totalAmountDue();
      return header + "\n" + customer.toString() + "\n" + orderHeader + orders + "\n" + amtDue;
   }
}