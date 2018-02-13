/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;

/**
 *
 * @author mohamadsayeh
 */
public class MVCTest {
    
    public MVCTest() {
    }
    model m1;
    View v1;
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
		m1=new model();
		v1=new View();
	}
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class MVC.
     */
    @Test
    public void testMain() {
        
        
        
		m1.add(3, 3);
		assertEquals(m1.getTheRes(),6,0);
	
		m1.sq(-3);
		assertEquals(m1.getCheck(),1,0);
	    m1.div(4, 0);
		 assertEquals(m1.getCheck(),1,0);
	    m1.mod(2, 0);
		 assertEquals(m1.getCheck(),1,0);
		 
		 m1.sub(5, 1);
			assertEquals(m1.getTheRes(),4,0);
			m1.mul(3, 3);
			assertEquals(m1.getTheRes(),9,0);
	        m1.div(4, 2);
			assertEquals(m1.getTheRes(),2,0);
	        m1.sq(4);
			assertEquals(m1.getTheRes(),2,0);
			m1.mod(7, 3);
			 assertEquals(m1.getTheRes(),1,0);
     
    }

    /**
     * Test of getDescription method, of class MVC.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        MVC instance = new MVC();
        Description expResult = null;
        Description result = instance.getDescription();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of run method, of class MVC.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        RunNotifier rn = null;
        MVC instance = new MVC();
        instance.run(rn);
     
        
    }
    
}
