public class Customer
{
   public String name;
   public String address;
   
   //Constructor that initializes the customer's name and address
   //@param name
   //@param first line of address
   //@param second line of address
   public Customer(String gummo, String kooda, String keke)
   {
      name = gummo;
      address = kooda + "\n" + keke;
   }
   
   //Method that returns the customer's name
   //@return customer's name
   public String getName()
   {
      return name;
   }
   
   //Method that returns the customer's address
   //@return customer's address
   public String getAddress()
   {
      return address;
   }
   
   //Method that prints out a description of the customer
   //@return the customers name and address
   public String toString()
   {
      return name + "\n" + address + "\n";
   }
}