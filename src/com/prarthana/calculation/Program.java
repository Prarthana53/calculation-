/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prarthana.calculation;

import com.prarthana.calculation.obj.Operation;
import com.prarthana.calculation.obj.OperationFactory;

import java.util.Scanner;

/**
 *
 * @author Pavilion G4
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true)
        {
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Div");
        System.out.println("4. Mul");
        System.out.println("5. Max");
        System.out.println("6. Min");
        System.out.println("7. Power");
        System.out.println("8. Exit");
        System.out.println("Enter your choice[1-8]: ");
        int choice=sc.nextInt();
        Operation oper;
      
        
        switch(choice)
        {
            case 1:
                oper=OperationFactory.get("Add");
                evaluate(oper);
                break;
            case 2:
                oper=OperationFactory.get("Sub");
                evaluate(oper);
                break;
            case 3:
                oper=OperationFactory.get("Div");
                evaluate(oper);
                break;
            case 4:
                oper=OperationFactory.get("Mul");
                evaluate(oper);
                break;
            case 5:
                oper=OperationFactory.get("Max");
                evaluate(oper);
                break;
            case 6:
                oper=OperationFactory.get("Min");
                evaluate(oper);
                break;
            case 7:
                oper=OperationFactory.get("Power");
                evaluate(oper);
                break;
            case 8:
                System.exit(0);       
        }
        
        System.out.println("Do you want to continue[Y/N]: ");
        String str=sc.next();
        if(str.equalsIgnoreCase("n")){
            System.exit(0);
        }
        }
    }
    public static void evaluate(Operation oper)
    {
        if(oper!=null)
        {
        float f,s,re;
        f=oper.enterFirstValue();
        s=oper.enterSecondValue();
        re=oper.calculate(f,s);
        oper.display(re);
    
        }
        else{
            System.out.println("Operation can't be performed:");
        }
    }
}
