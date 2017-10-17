import java.util.Random;
import java.util.*;
/**
 * Website class mimics a website names Wine Direct
 * Which sells cases of wine to its buyers 
 * Every 10th buyer gets a 10% discount
 * 
 * @author (Omotola Shogunle) 
 * @version (16-11-2016)
 */
public class Website
{
    //number of buyers who log in to the website
    private int hits;
    //Amount of money take at checkout
    private double salesTotal;
    //Maximum number of WineCases to be stored in basket
    private int maxNumberOfWineCases;
    //Number of buyers logon to website
    private ArrayList<Browser> buyer; 

    /**
     * Default Constructor for testing purposes only
     */
    public Website(int noOfhits)
    {
        hits = noOfhits;
        salesTotal = 0;
        maxNumberOfWineCases = 6;
        buyer = new ArrayList<>();
    }
    
    /**
     * This shows the number of buyers who log into the website
     * And sales total shows the amount of money taken at check out 
     */
    public Website()
    {
        hits = 0;
        salesTotal = 0;
        maxNumberOfWineCases = 6;
        buyer = new ArrayList<>();
    }
    
    /****
     * For Testing purposes only
     */
    public void setHits(int newHits)
    {
        hits= newHits;
    }
    
    public int getHits()
    {
        return hits; // returns the number of buyers who log into the website 
    }
    
    public double getSalesTotal()
    {
        return salesTotal; // returns the amount at checkout
    }
    
    public int getMaxNoOfWineCases ()
    {
        return maxNumberOfWineCases;// returns the maximum number of wineCases allowed to be purchased at any one time
    }
    
    /**
     * This method allows different browsers to be logged in at any one time
     * Its private and called in buyer login when all credentials are met
     * to becoming a buyer
     */
    private void logBuyer(Browser newBuyer)
    {
        buyer.add(newBuyer);
    }
    
    /**
     * Prints individual details of buyers that are logged in 
     * Website.\n means new line
     */
    public void getLoggedIn()
    {
        for(Browser browser : buyer)
        {
            System.out.println("############################"+
            "\nDetails of buyer :"+browser.getID()+
            "\n"+browser.getBirthYear()+ 
            "\n"+browser.getEmail()
            );
        }
    }
    
    /**
     * This method transforms broswers to buyers by loginning them into the Website
     * And setting a unique Id for the buyers 
     * This also changes buyer status
     * Buyer must be 18 years of age before they can purchase alcohol 
     */
    public void becomeBuyer(Browser browser)
    {
      if(2016-browser.getBirthYear()>= 18)
      {
        Random randomID = new Random();
        browser.setID(randomID.nextInt(999) + 1);
        browser.setBuyerStatus(true);
        buyerLogin(browser);
       }
       else
       {
           System.out.println("You have to be 18 years of age to purchase alcohol");
        }
    }
    
    /**
     * Checks to see that buyer has less than or the same amount of wineCases
     * As stated to be the maximum allowed in basket. This method is called in checkout
     */
    private boolean basketOverFull(ArrayList<WineCase> basket)
    {   
        if(basket.size() < maxNumberOfWineCases)
        {
            return true;
        }
        else{
            return false; 
        }
    }
    
    /**
     * This method is called by the buyer when they pay for the wine case in the browser class
     * If buyer has atleast 5 wineCases in their basket a 10% discount is applied to their total bill
     * Otherwise transaction is completed without discount
     */
    public void checkout(Browser buyer)
    {
       //WineCase wineCase = buyer.getWineCase();
       double runningTotal = 0;
       ArrayList<WineCase> basket = buyer.getBasket();
       if(basket.size()>= 5 && basketOverFull(basket)== false)
        {
         //System.out.println("Congratulations you are the "+hits+"th buyer a 10% discount has been added to your bill"+
         System.out.println("Congratulations you have selected up to " +basket.size()+ "  wineCases a 10% discount has been added to your bill"+
         "\nWine Direct: Serving customer "+buyer.getID());
         System.out.printf("   Your Basket contains:\n");
         for(WineCase wineCase: basket)
         {
             runningTotal+=wineCase.getPrice()*0.9;
             salesTotal+=wineCase.getPrice()*0.9;
             System.out.printf("\t%-20s%s%6.2f%n",wineCase.getDes(),"£",wineCase.getPrice());
         }
         System.out.println("");
         System.out.printf("%-28s%s%6.2f", "The total cost is","£",runningTotal);
        }
        else if(basketOverFull(basket) == true)
        {
         System.out.println("Wine Direct: Serving customer "+buyer.getID());
         System.out.printf("   Your Basket contains:\n");
         for(WineCase wineCase: basket)
         {
             runningTotal+=wineCase.getPrice();
             salesTotal+=wineCase.getPrice();
             System.out.printf("\t%-20s%s%6.2f%n",wineCase.getDes(),"£",wineCase.getPrice());
         }
         System.out.println("");
         System.out.printf("%-28s%s%6.2f", "The total cost is","£",runningTotal);
        }
        else{
          System.out.println("The maximum number of wineCases you can have in the basket is "+maxNumberOfWineCases);
        }
        basket.clear();
        buyer.setWebsite(null);
    }
    
//     public void checkout2(Browser buyer)
//     {
//         int index = 0;
//         int counter = 1;
//         ArrayList<WineCase> basket = buyer.getBasket();
//         for (WineCase wineCase : basket)
//         {
//             basket.get(index);
//             while (index < basket.size())
//             {
//                 if(basket.get(index).equals(basket.get(index)))
//                 {
//                     counter++;
//                     System.out.println(+counter+ "cases of "+wineCase.getDes()+ "at" +wineCase.getPrice());
//                     basket.remove(index);
//                 }
//                 index++;
//             }
//         }
//     }
    
    /**
     * Allows buyers tp log into the website 
     * These buyers already have an ID 
     */
    public void buyerLogin(Browser browser)
    {
        if(browser.getBuyerStatus()== true)
        {
        //If we have an arrayList of websites we would be setting the website based on the position.
        browser.setWebsite(this);
        hits = hits+1;
        logBuyer(browser);
        System.out.println("");
        System.out.println("Wine Direct welcomes buyer "+browser.getID()+", you are now logged in");
       }
       else
       {
           System.out.println("Become buyer to have access to website");
        }
    }
    
    /**
     * This method checks the wineCase class for the amount for discounted wine 
     * Prints out a congratulatory message.
     */
    private boolean checkHitDiscount()
    {
           if(hits%10 == 0)
           {
               return true;
            }
            else
            {
                return false;
            }
    }
}
