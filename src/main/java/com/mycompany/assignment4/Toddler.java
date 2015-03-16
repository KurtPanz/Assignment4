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
// inheritance class to inherit name and surname variables/methods from student abstract class
public class Toddler extends Student{
    
    private String studentNumber;
    private String studentAddress;
    private String studentEmergencyNumber;
    
    public Toddler()
    {
        
    }
    
    public Toddler(String name,String surname,String studentNumber)
    {
        this.name = name;
        this.surname = surname;
        this.studentNumber = studentNumber;
        
    }
   
    
    
    public String getStudentNumber()
    {
      return studentNumber;
    }
    
    public void setStudentNumber(String studentNumber)
    {
      this.studentNumber = studentNumber;
    }
    
    public String getStudentAddress()
    {
      return studentAddress;
    }
    
    public void setStudentAddress(String studentAddress)
    {
      this.studentAddress = studentAddress;
    }
    
    
    
    public String getStudentEmergencyNumber()
    {
        return studentEmergencyNumber;
    }
    
    public void setStudentEmergencyNumber(String surname)
    { 
        this.studentEmergencyNumber = studentEmergencyNumber;
    }
    
    public void printToddler()
    {
        System.out.println("Toddler Details...");
        System.out.println("Registration #: "+ getStudentNumber()+"\nName: "+ name+"Surname: "+surname);
    }
    
}
