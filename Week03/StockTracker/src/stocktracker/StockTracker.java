/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.StockDataModel.PhysicalStockItem;
import stocktracker.StockDataModel.ServiceStockItem;

/**
 *
 * @author jwood20
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhysicalStockItem objPhysicalItem 
                = new PhysicalStockItem("Snuff: a diskworld book by Terry Pratchett", 0);
        ServiceStockItem objVirtualItem 
                = new ServiceStockItem("Wintersmith: A Diskworld e book by Terry Pratchett");
               
        
        //test behvaiour of phys stock item
        String strMessage = objPhysicalItem.getName()
                +", Is in stock = " + objPhysicalItem.isInStock()
                +", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        String StrMessage = objVirtualItem.getName()
                +", Is in stock = " + objVirtualItem.isInStock()
                +", Qty in stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(StrMessage);
    }
    
}
