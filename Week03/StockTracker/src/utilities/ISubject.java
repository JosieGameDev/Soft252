/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author jwood20
 */
public interface ISubject {
    
    Boolean registerObserver(IObserver obs);
    Boolean removeObserver(IObserver obs);
    void notifyObservers();
}
