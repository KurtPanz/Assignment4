/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4.Impl;


import com.mycompany.assignment4.Interface.DaycareInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author 211150142
 */
public class DaycareServiceImpl implements DaycareInterface {

   List students = new ArrayList();
   Set times = new TreeSet();
   Map rooms = new HashMap();
    
    @Override
    public List students() {
       students.add("Johan Jacobs"); 
       students.add("Lauren September");
       students.add("Peter Pan");   
       
       return students;
    }

    @Override
    public Map rooms() {
       rooms.put("8:00am","ROOM45");
       rooms.put("10:00am","ROOM36");
       rooms.put("12:00pm","ROOM70");
       rooms.put("14:00pm","ROOM01");
       rooms.put("16:00pm","ROOM90"); 
       
       return rooms;
    }

    @Override
    public Set times() {
     times.add("8:00am");
     times.add("10:00am");
     times.add("12:00mm");
     times.add("14:00pm");
     times.add("16:00pm"); 
     
     return times;
    }
   
    
}
