/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.assignment4.Impl.DaycareServiceImpl;
import com.mycompany.assignment4.Interface.DaycareInterface;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author 211150142
 */
public class DaycareImplTest {
    
    public DaycareImplTest() {
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
    public void displayStudents()
    {
        DaycareInterface daycare = new DaycareServiceImpl();               
        System.out.println(daycare.students());
        
        List temp = daycare.students();
        String searchName = temp.get(2).toString();
        System.out.println(searchName);
        
         assertEquals("Peter Pan",searchName);
    }
    @Test
    public void displayRooms()
    {
        DaycareInterface daycare = new DaycareServiceImpl();               
        System.out.println(daycare.rooms());
    }
    
    @Test
    public void displayTimes()
    {
        DaycareInterface daycare = new DaycareServiceImpl();               
        System.out.println(daycare.times());
    }
}
