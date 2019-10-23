/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidemo;

/**
 *
 * @author jwood20
 */
public class Student extends UniPeople {

    // CONSTRUCTOR
    public Student(Integer id, String name) {
        super(id, name);
    }
    
    // additional methods
    public void attendClass()
    {
        String output = this.getName() + " is attending " + this.getCourse().getCode()
                 + " in room " + this.getCourse().getRoom();
        
        System.out.println(output);
    }
    
    public void doCoursework()
    {
        String output = this.getName() + " is doing coursework " + this.getCourse().getCoursework();
        
        System.out.println(output);
    }
    
}
