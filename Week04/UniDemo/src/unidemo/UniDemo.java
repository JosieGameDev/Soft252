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
public class UniDemo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CREATING STUDENT, LECTURER, AND COURSE
        
        Lecturer lecturer = new Lecturer(1, "Chris");
        
        Student student = new Student(2, "Josie");
        
        Course course = new Course("SOFT252", "Room104");
        
        //PRINT STUDENT DETAILS
        Admin.getDetails(student);
        
        //LINK LECTURER AND STUDENT TO THE COURSE
        Admin.assignCourse(lecturer, course);
        Admin.assignCourse(student, course);
        
        //MAKE STUDENT ATTEND AND LECTURER TEACH
        student.attendClass();
        lecturer.teach();
        
        // STUDENT ATTEMPT CW
        student.doCoursework();
        
        //SET CW
        course.setCoursework("Java project");
        
        //STUDENT TO CW AGAIN
        student.doCoursework();
        
        //PRINT LECTURER DETAILS
        Admin.getDetails(lecturer);
        
    }
    
}
