/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignment4.Impl.StudentHealthServiceISPImpl;
import com.mycompany.assignment4.Interface.StudentHealthServiceISP;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kurt
 */
public class StudentHealthServiceISPImplTest {
    
    public StudentHealthServiceISPImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
     public void getHealth()
     {
         StudentHealthServiceISP health  = new StudentHealthServiceISPImpl();         
         System.out.println("Andy Comptin is a: "+ health.energyLevelsHigh());
         System.out.println("Jade Mybrug is a: "+ health.energyLevelsLow());        
         
     }
}
