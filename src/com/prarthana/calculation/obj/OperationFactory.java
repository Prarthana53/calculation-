/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.calculation.obj;

/**
 *
 * @author Pavilion G4
 */
public class OperationFactory {
    
    
    public static Operation get(String key)
    {
    if(key.equalsIgnoreCase("ADD"))
    {
    return new Addition();
    }else if(key.equalsIgnoreCase("SUB"))
    {
    return new Subtraction();
    }else if(key.equalsIgnoreCase("MUL"))
    {
    return new Multiplication();
    }else if(key.equalsIgnoreCase("DIV"))
    {
    return new Division();
    }else if(key.equalsIgnoreCase("MAX"))
    {
    return new Maximum();
    }else if(key.equalsIgnoreCase("MIN"))
    {
    return new Minimum();
    }else if(key.equalsIgnoreCase("POWER"))
    {
    return new Power();
    }
    else
        return null;
        
    }
    

    
}
