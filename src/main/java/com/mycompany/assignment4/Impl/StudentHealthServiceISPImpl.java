/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4.Impl;

import com.mycompany.assignment4.Interface.StudentHealthServiceISP;


public class StudentHealthServiceISPImpl implements StudentHealthServiceISP {

    @Override
    public String energyLevelsHigh() {
        return "Active child";
    }

    @Override
    public String energyLevelsLow() {
       return "Lazy child";
    }
    
}
