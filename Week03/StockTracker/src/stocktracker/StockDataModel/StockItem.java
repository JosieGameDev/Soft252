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

import java.util.ArrayList;
import utilities.IObserver;
import utilities.ISubject;

public abstract class StockItem implements ISubject 
{
    protected String name = "UNKNOWN";
    protected Integer quantityInStock = 0;
    protected Double sellingPrice = 1000000.0;
    protected Double costPrice = 1000000.0;
    
    //WEEK5
    private ArrayList<IObserver> observers = null;

    @Override
    public Boolean registerObserver(IObserver obs)
    {
        Boolean blnAdded = false;
        
        if(obs != null)
        {
            if(this.observers == null)
            {
                this.observers = new ArrayList<>();
            }
            blnAdded = this.observers.add(obs);
        }
        
        return blnAdded;
    }
    
    @Override
    public Boolean removeObserver(IObserver obs)
    {
        Boolean blnRemoved = false;
        
        if(obs != null)
        {
            if(this.observers.contains(obs))
            {
               blnRemoved = this.observers.remove(obs); 
            }
            
        }
        
        return blnRemoved;
    }
    
    @Override
    public void notifyObservers()
    {
        if(this.observers != null && this.observers.size() >0)
        {
            for(IObserver currentObserver : this.observers)
            {
                currentObserver.update();
            }
        }
    }
    
    // add constructors
    public StockItem()
    {
        
    }
    
    public StockItem(String name)
    {
        this.name = name;
    }
    
    public StockItem(String name, Integer qty)
    {
        this.name = name;
        this.quantityInStock = qty;
    }
     //retrieve item type
    
    public abstract StockType getItemType();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty() )
        {
           this.name = name; 
           notifyObservers();
        }
        
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        if(quantityInStock != null && quantityInStock >= 0)
        {
            this.quantityInStock = quantityInStock;
            notifyObservers();
        }
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        if(sellingPrice != null && sellingPrice >= 0)
        {
            this.sellingPrice = sellingPrice;
            notifyObservers();
        }
    }

    public Double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Double costPrice) {
        if(costPrice != null && costPrice >= 0)
        {
            this.costPrice = costPrice;
            notifyObservers();
        }
    }
    
    public Boolean isInStock()
    {
        Boolean inStock = false;
        if(this.quantityInStock > 0)
        {
            inStock = true;
        }
        return inStock;
    }
    
    
    
}
