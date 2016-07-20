/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.calculation.obj;

import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public abstract class Operation {
    Scanner sc=new Scanner(System.in);
    
    public float enterFirstValue()
    {
    System.out.print("Enter the first number: ");
    float first=sc.nextInt();
    return first;
    }
    public float enterSecondValue()
    {
    System.out.print("Enter the second number: ");
    float second=sc.nextInt();
    return second;
    }
            
    public abstract float calculate(float first, float second);
    
    public void display(float result)
    {
        System.out.println("The result of the operation is: "+ result);
    }
}
