import java.util.*;
/**
 * This class mimics a Browser of the website Wine Direct or 
 * A potential Buyer. There are two types of browsers those who have an ID and those who do not
 * Inorder to become a buyer browser must be 18 years of age 
 * Details must also be submited for website to give random Id
 * 
 * @author (Omotola Shogunle Group 2) 
 * @version (16-11-2016)
 */
public class Browser
{
    // browser's year of Birth
    private int yearOfBirth;
    //browser's email address
    private String email;
    //browser's shop ID
    private int iD;
    //Checks browser status
    private boolean isBuyer;
    //pointer to wine Website
    private Website website;
    //pointer to case of Wine
    //private WineCase wineCase;
    //Arraylist of type Basket
    private ArrayList<WineCase> basket;
    //ArrayList of type Website
    private ArrayList<Website> newWebsite;
    /**
     * Constructor for browsers who do not have an ID yet
     * Details of new browsers should be entered in specified fields
     */
    public Browser(String mailAddress, int birthYear)
    {
        yearOfBirth = birthYear;
        email = mailAddress;
        iD = 0;
        isBuyer = false;
        website = null;
        //wineCase = null;
        basket = new ArrayList<>();
        newWebsite = new ArrayList<>();
    }
    
    /**
     * Constructor for browsers with an ID
     * This browser has been allocated an iD therefore browser's buyer status is true.
     * This constructor also has added functionality allowing buyers get as many wineCases
     * As required. WineDirect has expanded to other websites browser can chose what website 
     * They would like to browsing
     */
    public Browser()
    {
        yearOfBirth = 1994;
        email = "omo@gmail.com";
        iD = 678;
        isBuyer = true;
        website = null;
        //wineCase = null;
        basket = new ArrayList<>();
        newWebsite = new ArrayList<>();
    }

    /**
     * Method returns address of website buyer is surfing
     */
    public Website getWebsite()
    {
        return website;
    }
    
//     /**
//      * WineDirects subsidairy websites
//      */
//     public ArrayList getWebsite1()
//     {
//         return newWebsite;
//     }
    
    /**
     * This method returns the size of our basket
     * That is the amount of objects(WineCases)thats stored in the ArrayList basket
     */
    public int noOfItemsInBasket()
    {
        return basket.size();
    }
    
    /**
     * This method returns year of birth for buyer 
     */
    public int getBirthYear()
    {
        return yearOfBirth; 
    }
    
    /**
     * Returns email address of buyer 
     */
    public String getEmail()
    {
        return email; 
    }
    
    /**
     * This method returns uniqueID of buyer 
     */
    public int getID()
    {
        return iD; 
    }
    
    /**
     * This method tells if the current browser is a buyer or a browser 
     */
    public boolean getBuyerStatus()
    {
        return isBuyer; 
    }
    
    /**
     * sets buyers unique Id, this method is called by the website class
     * Inorder to administer random ID to buyer
     */
     public void setID(int newID)
    {
        iD = newID; 
    }
    
    /**
     * sets the website for which browser purchases wine from.
     */
    public void setWebsite(Website newWebsite)
    {
        website = newWebsite; 
    }
    
//     public void setWebsite(ArrayList website)
//     {
//         newWebsite = website;
//     }
//  
//      /**
//      * Method returns address for wine case selected by buyer.
//      * This address shows information about the wine case selected by buyer
//      */
//     public WineCase getWineCase()
//     {
//         return wineCase;
//     }
//     
    /**
     * Returns the list of items in our Basket
     * This method returns detailed information of whats contained in our basket
     */
    public ArrayList getBasket()
    {
        return basket;
    }
    
    /**
     * Allows browsers purchase wine case provided that they are buyers
     * Only one wineCase can be selected at a time when browser is login
     */
    public void selectWineCase(WineCase wineCase)
    {
        if(isBuyer == true)
        {
         basket.add(wineCase);
        }
        else
        {
            System.out.println("Winecase cannot be selected unless logged in");
        }
    }
    
    /**
     * This method is called whenever browsers login and have a unique iD to become buyers 
     * This changes their status to true else buyer status remains false
     */
    public void setBuyerStatus(boolean newBuyer)
    {
         isBuyer = newBuyer;
    }
    
    /**
     * This allows buyers to output information of specific Items in 
     * The basket. Information is retrieved based on positions 
     * Of Items in the basket
     */
    public void wineCaseInBasket (int index)
    {
        WineCase wineCase;
        if(index>=0 && index < basket.size())
        {
            wineCase = basket.get(index);
            System.out.println(wineCase);
        }
    }
    
    /**
     * Prints details of whats in buyers basket to the terminal
     */
    public void showBasket()
    {
        int counter = 0;
        while(counter < basket.size())
        {
            wineCaseInBasket(counter);
            counter++;
        }
    }
    
    /**
     * Removes unwanted items from basket based on the items position
     */
    public void putWineCaseBack(int item)
    {
        wineCaseInBasket(item);
        if(item>=0 && item < basket.size())
        {
            basket.remove(item);
        }
        showBasket();
        System.out.println("Your basket has been updated");
    }
    
    /**
     * If reference number of an items in the basket match the search string 
     * Typed into the as a paramater its taken off from the basket 
     * If not a value -1 is returned indicating reference number not found
     */
    public int putWineCaseBack(String searchRef)
    {
        int index = 0;
        boolean found = false;
        while(index < basket.size() && !found)
        {
            WineCase wineCase = basket.get(index);
            if(wineCase.toString().contains(searchRef))
            {
                basket.remove(index);
                found = true;
            }
            else {
                index++;
                found = false;
            }
        }
        if(!found){
            //Reference number not found
            return -1;
        }
        else{
            //Return position of next available item
            return index;
        }
    }
    
    /**
     * Buyers are able to sort whats in their basket by 
     * putting an argument that over budget than what they are 
     * Will to spend. If over budget item/items are removed
     */
    public void putExpensiveWineCasesBack(double price)
    {
      int index = 0;
      while(index < basket.size())
      {
          WineCase wineCase = basket.get(index);
          if(wineCase.getPrice()>= price)
          {
              basket.remove(index);
            }
            else{
                index++;
            }
        }
      showBasket();
      System.out.println("Your basket has been updated");
    }
    
    /**
     * Finally buyer can pay for wine 
     * This method is called at checkout in the Website class 
     * This method has a self referencing method to indicate what website browser is currently in
     */
    public void payForWine()
    {
            if(isBuyer == true && !basket.isEmpty() && website !=null)
            {
                website.checkout(this);
                //website.checkout2(this);
            }
            else if (isBuyer == false ){
                   System.out.println("Login to purchase wine");
            }
            else if (basket.isEmpty()){
                System.out.println(" WineCase has not been added to basket");
            }
            else if (website == null){
                System.out.println("You havent logged into any website");
            }
    }
}
