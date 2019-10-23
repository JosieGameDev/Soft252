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
public abstract class UniPeople {
    
    private Course course;
    private Integer id;
    private String name;
    
    // CONSTRUCTOR

    public UniPeople(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.course = null;
    }
    
    
    // ACCESSORS

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
