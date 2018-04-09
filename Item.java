public class Item
{
   public String description;
   public double price;
   
   //Constructor that initializes the description and price of an item
   //@param an item's description
   //@param an item's price
   public Item(String doowee, double rondo)
   {
      description = doowee;
      price = rondo;
   }
   
   //Method that returns an item's description
   //@return the item's description
   public String getDescription()
   {
      return description;
   }

   //Method that returns an item's price
   //@return the item's price
   public double getPrice()
   {
      return price;
   }
}