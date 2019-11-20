/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_8;

/**
 *
 * @author jwood20
 */
public abstract class Bike {
    
    protected String description = "Unknown Bike Model";
    protected Integer cost = 10;
    
    public String getDescription()
    {
        return description;
    }
    
    
    //returns the number in pool
    public abstract double numInPool();
    
    //returns if its available based on num in pool
    public Boolean isAvailable()
    {
        if(numInPool() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    //rents a bike out
    public void rentABike()
    {
        
    }
    
}
