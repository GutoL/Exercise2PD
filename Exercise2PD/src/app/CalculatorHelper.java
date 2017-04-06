/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author guto
 */
public class CalculatorHelper {
    
    public float send(String oparation,ICalculator calculator){
        
        String[] datas;
        try {
            
            
            //System.out.println(oparation);
            
            if(oparation.contains("+")){
               datas = oparation.split("\\+");
                
               return calculator.add(Float.parseFloat(datas[0]), Float.parseFloat(datas[1]));
            }
        
            else if(oparation.contains("-")){
               datas = oparation.split("\\-");
               return calculator.sub(Float.parseFloat(datas[0]), Float.parseFloat(datas[1]));
            }
            
            else if(oparation.contains("*")){
               datas = oparation.split("\\*");
               return calculator.mult(Float.parseFloat(datas[0]), Float.parseFloat(datas[1]));
            }
            
            else if(oparation.contains("/")){
               datas = oparation.split("\\/");
               return calculator.div(Float.parseFloat(datas[0]), Float.parseFloat(datas[1]));
            }
            else{
                System.out.println("error");
                return -12121212;
            }
            
        } catch (Exception e) {
        }
        return -12121212;
    }
    
}
