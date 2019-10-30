/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.StockDataModel.PhysicalStockItem;
import stocktracker.StockDataModel.ServiceStockItem;
import stocktracker.StockDataModel.StockType;
import stocktracker.StockDataModel.StockItem;

/**
 *
 * @author jwood20
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        PhysicalStockItem objPhysicalItem 
//                = new PhysicalStockItem("Snuff: a diskworld book by Terry Pratchett", 0);
//        ServiceStockItem objVirtualItem 
//                = new ServiceStockItem("Wintersmith: A Diskworld e book by Terry Pratchett");
//               
//        
//        //test behvaiour of phys stock item
//        String strMessage = objPhysicalItem.getName()
//                +", Is in stock = " + objPhysicalItem.isInStock()
//                +", Qty in stock: " + objPhysicalItem.getQuantityInStock();
//        System.out.println(strMessage);
//        
//        String StrMessage = objVirtualItem.getName()
//                +", Is in stock = " + objVirtualItem.isInStock()
//                +", Qty in stock: " + objVirtualItem.getQuantityInStock();
//        System.out.println(StrMessage);


            // WEEK 05 MAIN 
            StockItem objTestItem1 = new PhysicalStockItem("Starcraft manual");
            StockItem objTestItem2 = new PhysicalStockItem("Halo 3", 100);
            StockItem objTestItem3 = new ServiceStockItem("Delivery");
            
            //print type for each of these to console
            if(objTestItem1.getItemType() == StockType.PHYSICALITEM)
            {
                System.out.println("Item 1 is a PHYSICAL stock item");
            }
            else
            {
                System.out.println("Item 1 is a SERVICE stock item");
            }
            
            if(objTestItem2.getItemType() == StockType.PHYSICALITEM)
            {
                System.out.println("Item 2 is a PHYSICAL stock item");
            }
            else
            {
                System.out.println("Item 2 is a SERVICE stock item");
            }
            
            if(objTestItem3.getItemType() == StockType.PHYSICALITEM)
            {
                System.out.println("Item 3 is a PHYSICAL stock item");
            }
            else
            {
                System.out.println("Item 3 is a SERVICE stock item");
            }
            
            


    }
    
}
