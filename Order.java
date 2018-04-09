public class Order
{
   public Item product;
   public int quantity;
   
   //Constructor that initializes the item and quantity of the order
   //@param item that is ordered
   //@param quanitiy that is ordered
   public Order(Item chocolate, int billy)
   {
      product = chocolate;
      quantity = billy;
   }
   
   //Method that returns the total price of the order
   //@param total price of the order
   public double getTotalPrice()
   {
      return product.getPrice() * quantity;
   }
   
   //Method that returns the quantity ordered
   //@return quantity ordered
   public int getQuantity()
   {
      return quantity;
   }
   
   //Method that returns the item that is ordered
   //@return item ordered
   public Item getProduct()
   {
      return product;
   }
   
   //Method that prints out a description of the order
   //@return description of the order
   public String toString()
   {
      return product.getDescription() + "\t\t" + product.getPrice() + "\t\t" + quantity + "\t\t" + getTotalPrice();
   }
}