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
public class Lecturer extends UniPeople implements ITeach{
    
    
    @Override
    public void setCourseWork(String coursework)
    {
        this.getCourse().setCoursework(coursework);
    }
    
    
    @Override
    public void teach()
    {
        String output = getName() + " is teaching " + this.getCourse().getCode()
                + " in room " + this.getCourse().getRoom();
        
        System.out.println(output);
    }
    
    // CONSTRUCTOR

    public Lecturer(Integer id, String name) {
        super(id, name);
    }
    
    
    
}
