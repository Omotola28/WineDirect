
/**
 * This is the class for WineCase,
 * This stores information about the type of wine 
 * no Of bottles in a case, price and ref-no
 * Only one case can be purchased at a time 
 * 
 * @author (Omotola Shogunle) 
 * @version (16-11-2016)
 */
public class WineCase
{
    // Unique reference no for the winecase
    private String refNo;
    //Description of the type of wine 
    private String description;
    //Number of bottles in the wine case 
    private int noOfBottles;
    //price of the wine case 
    private double price;
    
    /**
     * This constructor is for testing purposes only
     * Refno, description, noOfBottels and price indicated.
     */
    public WineCase()
    {
        refNo = "MWY678";
        description = "Malibu";
        noOfBottles = 6;
        price = 120.0;
    }

    /**
     * Appropraite values should be assigned to these fields 
     */
    public WineCase(String wineRef, String details, int bottleNo, double cost)
    {
        // initialise instance variables
        refNo = wineRef;
        description = details;
        noOfBottles = bottleNo;
        price = cost;
    }
        
    public String getRefNo()
    {
        return refNo; // returns refernce no of wine case
    }
    
    public String getDes()
    {
        return description; //returns a description of what type of wine case is being purchased
    }
    
    public int getNoOfBottles()
    {
        return noOfBottles;// returns no of bottles in a wine case
    }
    
    public double getPrice()
    {
        return price; //gets normal price without a discount
    }
    
    public String toString()
    {
        return refNo + " "  + description;
    }
}
