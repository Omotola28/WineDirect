
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
    //pointer to case of Wine
    private WineCase wineCase;
    //pointer to wine Website
    private Website website;

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
        wineCase = null;
        website = null;
    }
    
    /**
     * Constructor for browsers with an ID
     * This browser has been allocated an iD therefore browser's buyer status is true.
     */
    public Browser()
    {
        yearOfBirth = 1994;
        email = "omo@gmail.com";
        iD = 678;
        isBuyer = true;
        wineCase=null;
        website = null;
    }
    
    /**
     * Method returns address for wine case selected by buyer.
     * This address shows information about the wine case selected by buyer
     */
    public WineCase getWineCase()
    {
        return wineCase;
    }
    
    /**
     * Method returns address of website browser ir buyer is surfing 
     * This address gives information about the noOfhits and salesTotal of website
     */
    public Website getWebsite()
    {
        return website;
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
    
    /**
     * Allows browsers purchase wine case provided that they are buyers
     * Only one wineCase can be selected at a time when browser is login
     */
    public void selectWineCase(WineCase wineCase1)
    {
        if(isBuyer == true)
        {
         wineCase = wineCase1;
         System.out.println("Buyer "+getID()+" has selected wine case ref number "+wineCase.getRefNo()+" of "+wineCase.getNoOfBottles()+ " " +wineCase.getDes()+" at £"+wineCase.getPrice()+"");
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
     * Finally buyer can pay for wine 
     * This method is called at checkout in the Website class 
     * This method has a self referencing method to indicate what website browser is currently in
     */
    public void payForWine()
    {
            if(isBuyer == true && wineCase != null)
            {
                website.checkout(this);
            }
            else if (isBuyer == false ){
                   System.out.println("Login to purchase wine");
            }
            else if (wineCase == null){
                System.out.println(" WineCase has not been selected");
            }
    }
}
