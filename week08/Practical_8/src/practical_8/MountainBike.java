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
public class MountainBike extends Bike {
    
   
    private Integer numberInPool;

    public MountainBike() {
        this.numberInPool = 10;
    }
    
    public void setNumInPool(Integer newNum)
    {
        this.numberInPool = newNum;
    }
    
    @Override
    public double numInPool()
    {
        return numberInPool;
    }
    
}
