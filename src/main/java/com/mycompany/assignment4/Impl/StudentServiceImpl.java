/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4.Impl;

import com.mycompany.assignment4.Interface.StudentService;

/**
 *
 * @author Kurt
 */
public class StudentServiceImpl implements StudentService {

    @Override
    public int absent(int noDaysPresent) {
        return 7 - noDaysPresent; 
    }

    
    
}
