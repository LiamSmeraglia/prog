public class InvoiceTester
{
   public static void main(String[] args)
   {
      Customer brisket = new Customer("Sam's Small Appliances", "100 Main Street", "Anytown, CA 98765");
      
      Item biscuits = new Item("Toaster\t", 29.95);
      Item cornBread = new Item("Hair dryer", 24.95);
      Item bananaPudding = new Item("Car vacuum", 19.99);
      
      Order yeet = new Order(biscuits, 3);
      Order deez = new Order(cornBread, 1);
      Order nuts = new Order(bananaPudding, 2);
      
      Invoice ohMy = new Invoice(brisket);
      ohMy.addOrder(yeet);
      ohMy.addOrder(deez);
      ohMy.addOrder(nuts);
      
      System.out.println(ohMy);
   }
}