import java.util.Random;
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

    /**
     * Default Constructor for testing purposes only
     */
    public Website(int noOfhits)
    {
        hits = noOfhits;
        salesTotal = 0;
    }
    
    /**
     * This shows the number of buyers who log into the website
     * And sales total shows the amount of money taken at check out 
     */
    public Website()
    {
        hits = 0;
        salesTotal = 0;
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
     * This method is called by the buyer when they pay for the wine case in the browser class
     * If they are the 10th,20th 30th and so on buyer they get a 10% discount
     * Otherwise transaction is completed without discount
     */
    public void checkout(Browser buyer)
    {
        WineCase wineCase = buyer.getWineCase();
        if(checkHitDiscount()== true)
        {
         double discount =  0.9 * wineCase.getPrice();
         salesTotal = salesTotal + discount;
         System.out.println("Congratulations you are the "+hits+"th buyer a 10% discount has been added to your bill");
         System.out.println("Transaction Details :You Purchased "+wineCase.getDes()+" at £"+discount+" for "+wineCase.getNoOfBottles()+" bottles");
         System.out.println("You are now logged off");
        }
        else
        {
            System.out.println("Transaction complete");
            System.out.println("Transaction Details :You Purchased "+wineCase.getDes()+" at £"+wineCase.getPrice()+" for "+wineCase.getNoOfBottles()+" bottles");
            System.out.println("You are now logged off");
            salesTotal = salesTotal + wineCase.getPrice();
        }
        buyer.setWebsite(null);
    }
    
    /**
     * Allows buyers tp log into the website 
     * These buyers already have an ID 
     */
    public void buyerLogin(Browser browser)
    {
        if(browser.getBuyerStatus()== true)
        {
        browser.setWebsite(this);
        hits = hits+1;
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
