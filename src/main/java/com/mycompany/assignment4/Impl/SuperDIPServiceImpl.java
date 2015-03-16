/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.assignment4.Impl;

import com.mycompany.assignment4.Interface.DIPService;

/**
 *
 * @author Kurt
 */
public class SuperDIPServiceImpl implements DIPService {

    @Override
    public String rating() {
       return "Top Achievers";
    }
    
}
