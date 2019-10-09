/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jwood20
 */
public class StageResultsTest {
    
 private StageResults empty; // will have no credits and no marks
 private StageResults full; // will have 120 credits and marks
 private StageResults halfFull; // will have 60 credits and some marks

    
    public StageResultsTest() 
    {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
        // empty - object that starts with default values
        empty = new StageResults();

        // full - object with 120 credits-worth of marks but no
        // initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);

        // halfFull - object with 60 credits worth of marks and
        // no initial stage2Average
        halfFull = new StageResults();
        halfFull.addModuleMark(60, 50.0);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testIsComplte()
    {
        //fail("Test not yet implemented");
        System.out.println("Testing isComplete");
        
        //check that empty obkect is 'not complete'
        assertFalse("empty object", empty.isComplete());
        assertFalse("halfFull object", halfFull.isComplete());
        assertTrue("full object", full.isComplete());
    }
    
    @Test
    public void testResetValues()
    {
         //fail("Test not yet implemented");
        System.out.println("Testing ResetValues");
        
        full.resetValues();
        
        //set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;
        
        //compare to check it worked as expected
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);
        
        //return full object back 
        full.addModuleMark(120, 50.0);
        
        
    }
    
    @Test
    public void testAddModuleMark()
    {
         //fail("Test not yet implemented");
        System.out.println("Testing addModuleMark");
        
        //testing using the empty object
        int expIntResult1 = 10;
        double expDouResult1 = 5.0;
        int expIntResult2 = 30;
        double expDouResult2 = 15.0;
        int expIntResult3 = 70;
        double expDouResult3 = 35.0;
        
        empty.addModuleMark(10, 5);
        assertEquals("empty object", expIntResult1, empty.getTotalCredits());
        assertEquals("empty object", expDouResult1, empty.getTotalMarks(), 0.0);
        empty.addModuleMark(20, 5);
        assertEquals("empty object", expIntResult2, empty.getTotalCredits());
        assertEquals("empty object", expDouResult2, empty.getTotalMarks(), 0.0);
        empty.addModuleMark(40, 5);
        assertEquals("empty object", expIntResult3, empty.getTotalCredits());
        assertEquals("empty object", expDouResult3, empty.getTotalMarks(), 0.0);
        
        empty.resetValues();
    }
    
    @Test
    public void testCalculateAverageSoFar()
    {
         //fail("Test not yet implemented");
        System.out.println("Testing CalculateAverageSoFar");
        
        //check empty
        assertEquals("empty object", 0.0, empty.calculateAverageSoFar(), 1.0);
        
        //check full
        assertEquals("full object", 50.0, full.calculateAverageSoFar(), 1.0);
        
        //check full when marks are 100%
        full.resetValues();
        full.addModuleMark(120, 100.0);
        assertEquals("full object", 100.0, full.calculateAverageSoFar(), 1.0);
        
        //check full with 43.92%
        full.resetValues();
        full.addModuleMark(120, 43.92);
        assertEquals("full object", 43.92, full.calculateAverageSoFar(), 1.0);
        
        //reset full to original
        full.resetValues();
        full.addModuleMark(120, 50.0);
        
        //test half full
        assertEquals("halfFull object", 50.0, halfFull.calculateAverageSoFar(), 1.0);
        
        //test half full at 100% 
        halfFull.resetValues();
        halfFull.addModuleMark(120, 100.0);
        assertEquals("halfFull object", 100.0, halfFull.calculateAverageSoFar(), 1.0);
        
        // test half full at 64.77
        halfFull.resetValues();
        halfFull.addModuleMark(60, 64.77);
        assertEquals("halfFull object", 64.77, halfFull.calculateAverageSoFar(), 1.0);
        
        //reset half full object
        halfFull.resetValues();
        halfFull.addModuleMark(60, 50.0);
    }
    
    @Test
    public void testPredictClass()
    {
         fail("Test not yet implemented");
    }
    
}
