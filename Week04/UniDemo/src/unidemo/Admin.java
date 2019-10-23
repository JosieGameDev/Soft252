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
public class Admin {
    
    static void assignCourse(UniPeople person, Course course)
    {
        person.setCourse(course);
    }
    
    static void getDetails(UniPeople person)
    {
        String output = "Name: " + person.getName() + " ID: " 
                + person.getId() + " Course: " + person.getCourse();
        
        System.out.println(output);
        
    }
    
}
