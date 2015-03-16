/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kurt
 */
public class Main {
    public static void main(String[] args)
    {
        //my polymorphism example
        Toddler tod1,tod2;
      
        
        tod1 = new Toddler("Kurt","Wasserfall","21114533");
        tod2 = new Toddler("Lyle","September","2391023");
        
      
       
        GradeRs grdR1,grdR2;
              
        
        grdR1 = new GradeRs("Sam","Smith","5879403");
        
        tod1.printToddler();       
                        
        
    
    }
    
}
