/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker.StockDataModel;

/**
 *
 * @author jwood20
 */
public class PhysicalStockItem extends StockItem 
{
    public PhysicalStockItem()
    {
        super();
    }
    
    public PhysicalStockItem(String name)
    {
        super(name);
    }
    
    public PhysicalStockItem(String name, Integer qty)
    {
        super(name, qty);
    }
    
    
}
