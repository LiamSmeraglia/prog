import java.util.Random;
public class Lottery
{
   public int[] calledNumbers;
   public int numCount;
   
   //Constructor that initializes the array of selected numbers and the # of numbers
   public Lottery()
   {
      calledNumbers = new int[6];
      numCount = 0;
   }
   
   //Method that determines whether or not a number is already in the array
   //@param the number that the user wants to check
   //@return whether or not the number is unique
   private boolean isUnique(int number)
   {
      boolean unique = true;
      
      for (int x : calledNumbers)
      { 
         if (number == x)
            unique = false;
      }
      
      return unique;
   }
   
   //method that generates a number, checks it for uniqueness, and adds it to the array
   public void getNumber()
   {
      if (numCount<6)
      {
         boolean goof = true;
         int num = 0;
         Random rand = new Random();
         
         while (goof)
         {
            num = rand.nextInt(48) + 1;
            if (isUnique(num))
               goof = false;
         }
         calledNumbers[numCount]=num;
         numCount++;
      }
   }
   
   //method that returns a string containing the winning numbers
   //@return a string including the winning numbers
   public String toString()
   {
      String numbers = "";
      for (int x : calledNumbers)
      {
         numbers = numbers + x + " ";
      }
      
      return "NJ Pick-6 Lottery Winning Numbers:\n" + numbers;
   }
}