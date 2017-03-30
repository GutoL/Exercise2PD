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
public class Client {
    
    public static void main(String[] args) {
        
        
        try {
            
            Registry registry = LocateRegistry.getRegistry("localhost", 2017);// porta do servidor 1

            ICalculator calculator = (ICalculator) registry.lookup("calculator1");

            System.out.println(calculator.add(1, 3));

        } catch (Exception e) {
            System.out.println("Erro cliente");
        }
            
            
        
    }
    
}
