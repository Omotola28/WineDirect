
/**
 * This is a basic Test class that helps 
 * do all required checks for WineDirect
 * Checks would be done accross the three classes 
 * Website, wineCase and Browser
 * All checks would be carried out in the Constructor
 * 
 * @author (Omotola M Shogunle) 
 * @version (Version1 08\12\2016)
 */
public class Test
{
    /**
     * The constructor is gonna help carry out all checks
     */
    public Test()
    {
        //         // STEP 1 TESTING
        //         //Test for buyers that want to login and select wineCase and if they have, pay for wine
        //         
        //                 Website website = new Website();
        //                 Browser browser = new Browser();
        //                 WineCase wineCase = new WineCase();
        //                 website.buyerLogin(browser);
        //                 browser.selectWineCase(wineCase);
        //                 browser.payForWine();
        //         
        //         //CHECKING SALES TOTAL WHEN BUYER IS LOGGED OFF 
        //         System.out. println("----------------------------------------------------------------------");
        //         System.out.println("SalesTotal of Website = £"+website.getSalesTotal()+"");
        //         
        //        // CHECKS TO SEE IF SALES TOTAL IS UPDATED WHEN ANOTHER WINE IS PURCASHED 
        //         
        //                 Website website = new Website();
        //                 Browser browser1 = new Browser();
        //                 WineCase wineCase1 = new WineCase("HHJ-976", "chabilis", 12, 50);
        //                 website.buyerLogin(browser1);
        //                 browser1.selectWineCase(wineCase1);
        //                 browser1.payForWine();
        //
        //         //UPDATED SALESTOTAL WHEN ANOTHER WINE IS PURCHASED 
        //         System.out. println("----------------------------------------------------------------------");
        //         System.out.println("SalesTotal of Website = £"+website.getSalesTotal()+"");
        //
        //         
        //        //CHECKS IF BASKET IS EMPTY
        //               Website website = new Website();  
        //               Browser browser2 = new Browser();  
        //               WineCase wineCase2 = new WineCase(); 
        //               website.buyerLogin(browser2); 
        //               browser2.payForWine();
        //
        //        //CHECK THAT WEBSITE IS NOT SET TO NULL
        //               Website website = new Website();  
        //               Browser browser2 = new Browser();  
        //               WineCase wineCase2 = new WineCase();
        //               browser2.selectWineCase(wineCase2);
        //               browser2.payForWine();
        //
        //         //CHECKS FOR NON-BUYERS TRYING TO SELECT AND PAY FOR WINE
        //               Website website = new Website();
        //               Browser browser2 = new Browser("motiadenkan@gmail.com", 1996);
        //               WineCase wineCase2 = new WineCase("MDFH678", "chabilis", 10, 200);
        //               browser2.selectWineCase(wineCase2);
        //               browser2.payForWine();
        //
        //        //CHECKS TO SEE OUTCOME IF BUYER HAS NOT CHOSEN A WINE
        //               Website website = new Website();
        //               Browser browser1 = new Browser();
        //               WineCase wineCase1 = new WineCase("MDFH678", "chabilis", 10, 200);
        //               website.buyerLogin(browser1);
        //               browser1.payForWine();
        //
        //
        //        //CHECK FOR BROWSERS THAT WANT TO BECOME BUYERS 
        //              Website website = new Website();
        //              Browser browser2 = new Browser("hello@gmail.com", 1996);
        //              website.becomeBuyer(browser2);
        //
        //       
        //        //CHECKS TO SEE IF BUYER IS OF AGE TO PURCHASE WINE
        //             Website website = new Website();
        //             Browser browser1 = new Browser("moti@gmail.com", 1999);
        //             website.becomeBuyer(browser1);
        //
        //       //FOR DISCOUNT PROVIDED TO THE 20TH BUYER 
        //             Website website = new Website();
        //             Browser browser1 = new Browser();
        //             WineCase wineCase1 = new WineCase();
        //             website.buyerLogin(browser1);
        //             browser1.selectWineCase(wineCase1);
        //             website.setHits(20);
        //             browser1.payForWine();

        //CHECKS TO SEE IF UPDATE TO SALESTOTAL IS APPLIED WHEN DISCOUNT IS APPLIED
        //             System.out. println("----------------------------------------------------------------------");
        //             System.out.println("SalesTotal of Website = £"+website.getSalesTotal()+"");
        //
        //      //STEP2 TESTING 
        //      //TESTING THAT MULTIPLE WINECASES CAN BE ADDED TO THE BASKET AND REVEAL WINECASES SELECTED TO THE TERMINAL
        //             Website website = new Website();
        //             Browser browser1 = new Browser();
        //             WineCase wineCase1 = new WineCase();
        //             WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //             WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //             website.buyerLogin(browser1);
        //             browser1.selectWineCase(wineCase1);
        //             browser1.selectWineCase(wineCase2);
        //             browser1.selectWineCase(wineCase3);
        //             browser1.showBasket();
        //             
        //     //STEP3 TESTING
        //     //CHECK FOR MULTIPLE WINE PROCESSING AT CHECKOUT
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            browser1.payForWine();
        //
        //      //CHECK FOR THE DISCOUNT THATS APPLIED WHEN UP TO 5 WINECASES ARE PURCHASED
        //            Website website = new Website();
        //            Browser browser2 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            WineCase wineCase4 = new WineCase("LK-97UY", "Zinfindel", 10 , 100);
        //            WineCase wineCase5 = new WineCase("LK-97UY", "Merlot", 6 , 120);
        //            website.buyerLogin(browser1);
        //            browser2.selectWineCase(wineCase1);
        //            browser2.selectWineCase(wineCase2);
        //            browser2.selectWineCase(wineCase3);
        //            browser2.selectWineCase(wineCase4);
        //            browser2.selectWineCase(wineCase5);
        //            browser2.payForWine();
        //      
        //      //CHECK THAT SALESTOTAL IS UPDATED WHEN MULTIPLE BUYERS PURCHASE MULTIPLE WINECASES
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            browser1.payForWine();
        //          
        //      //SECOND BUYER AFTER FIRST BUYER IS LOGGED OUT
        //            Browser browser2 = new Browser();
        //            WineCase wineCase4 = new WineCase();
        //            WineCase wineCase5 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase6 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            WineCase wineCase7 = new WineCase("LK-97UY", "Zinfindel", 10 , 100);
        //            WineCase wineCase8 = new WineCase("LK-97UY", "Merlot", 6 , 120);
        //            website.buyerLogin(browser2);
        //            browser2.selectWineCase(wineCase1);
        //            browser2.selectWineCase(wineCase2);
        //            browser2.selectWineCase(wineCase3);
        //            browser2.selectWineCase(wineCase4);
        //            browser2.selectWineCase(wineCase5);
        //            browser2.payForWine(); 
        // 
        //           //CHECKS IF SALESTOTAL IS UPDATED
        //           System.out.println(""); 
        //           System.out.printf("%-28s%s%6.2f","Websites salesTotals is =","£",website.getSalesTotal()); 
        //
        //
        //      //STEP 4 TESTING 
        //      //CHECKS PUTTING WINECASE BACK BASED ON THE POSITION IN THE ARRAYLIST
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            System.out.println("------------------------Show Basket-------------------------------------------");
        //            browser1.showBasket(); 
        //            System.out.println("------------------------Show Basket end------------------------------------------");
        //            browser1.putWineCaseBack(1); //put inside index
        //                          
        //     //CHECKS PUTTING WINECASE BACK WITH INPUT STRING INSERTED
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("MJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            System.out.println("------------------------Show Basket-------------------------------------------");
        //            browser1.showBasket(); 
        //            System.out.println("------------------------Show Basket end------------------------------------------");
        //            browser1.putWineCaseBack("MJ-678"); 
        //
        //     //CHECK FOR WRONG REFERENCE STRING INPUT
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("MJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            System.out.println("------------------------Show Basket-------------------------------------------");
        //            browser1.showBasket(); 
        //            System.out.println("------------------------Show Basket end------------------------------------------");
        //            browser1.putWineCaseBack("HJ-678");
        //            browser1.showBasket();  
        //
        //      //CHECK FOR IF BASKET LIMIT HAS BEEN EXECEEDED
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase();
        //            WineCase wineCase2 = new WineCase("lJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            WineCase wineCase4 = new WineCase("LK-97UY", "Zinfindel", 10 , 100);
        //            WineCase wineCase5 = new WineCase("LK-97UY", "Merlot", 6 , 120);
        //            WineCase wineCase6 = new WineCase("LK-97UY", "Baileys", 10 , 150);
        //            WineCase wineCase7 = new WineCase("LK-97UY", "Pinot Grigio", 6 , 30);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            browser1.selectWineCase(wineCase4);
        //            browser1.selectWineCase(wineCase5);
        //            browser1.selectWineCase(wineCase6);
        //            browser1.selectWineCase(wineCase7);
        //            browser1.payForWine();
        //
        //     //PUT EXPENSIVE WINECASES BACK, BASKET IS FILTERED BASED ON BUDGET MONEY INPUTED
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            WineCase wineCase1 = new WineCase("LK-97UY", "Zinfindel", 10 , 100);
        //            WineCase wineCase2 = new WineCase("MJ-678", "NZ SAUVIGNON BLANC", 10, 150);
        //            WineCase wineCase3 = new WineCase("LK-97UY", "Chabilis", 5 , 20);
        //            WineCase wineCase4 = new WineCase("LK-97UY", "Baileys", 10 , 200);
        //            website.buyerLogin(browser1);
        //            browser1.selectWineCase(wineCase1);
        //            browser1.selectWineCase(wineCase2);
        //            browser1.selectWineCase(wineCase3);
        //            browser1.selectWineCase(wineCase4);
        //            System.out.println("------------------------Show Basket-------------------------------------------");
        //            browser1.showBasket(); 
        //            System.out.println("------------------------Show Basket end------------------------------------------");
        //            browser1.putExpensiveWineCasesBack(150);
        //
        //    //CHECK FOR INFORMATION OF BUYERS THAT ARE LOGGED INTO WEBSITE 
        //            Website website = new Website();
        //            Browser browser1 = new Browser();
        //            website.buyerLogin(browser1);
        //            Browser browser2 = new Browser("agatha@gmail.com", 1993);
        //            website.becomeBuyer(browser2);
        //            Browser browser3 = new Browser("teddybear@yahoo.com", 1980);
        //            website.becomeBuyer(browser3);
        //            website.getLoggedIn();
    }
}
