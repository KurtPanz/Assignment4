/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4;

/**
 *
 * @author Kurt
 */
//encapsulation- to enforce modularity
abstract class Student {
    
     String name;
     String surname;
     String studentNumber;
     String studentAddress;
     String studentEmergencyNumber;
   
    public String getName()
    {
      return name;
    }
    
    public void setName(String name)
    {
      this.name = name;
    }
    
    
    
    public String getSurname()
    {
        return surname;
    }
    
    public void setSurname(String surname)
    { 
        this.surname = surname;
    }
    
    
    
    //inheritance,to pass knowledge down
    //contains Concrete class,interface class,abstract class
    public void dayCareName(String dayCareName)
    {
        System.out.println("Touching hearts educare");
    }
    
    //polymorhpism-to take any shape
    
}
