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
public class Maximum extends Operation{

    @Override
    public float calculate(float a, float b) {
        float max=(a>b)?a:b;
        return max;
    }
    
}
