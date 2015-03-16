/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignment4.Impl.DIPServiceImpl;
import com.mycompany.assignment4.Impl.SuperDIPServiceImpl;
import com.mycompany.assignment4.Interface.DIPService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Kurt
 */
public class DIPImplTest {
    
    public DIPImplTest() {
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
     public void setRating()
     {
         DIPService rating  = new SuperDIPServiceImpl();         
         System.out.println("The toddlers are: "+ rating.rating());
         
         DIPService ratin  = new DIPServiceImpl();
         System.out.println("The GradeRs are: "+ ratin.rating());
         
     }
}
