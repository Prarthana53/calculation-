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
public class Power extends Operation{

    @Override
    public float calculate(float a, float b) {
         float resultPower = 1;
                for (int i = 1; i <= b; i++) {
                resultPower= resultPower *a;
                }
                return resultPower;
    
    
}
}
