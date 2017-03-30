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
public class Server2 {
    
    public static void main(String args[]){
        
        try {
            
            Implement2 implement2 = new Implement2();
            
            Registry registry = LocateRegistry.createRegistry(2018);
            
            System.out.println("Server 2 running");
            registry.bind("calculator2", implement2);
            
        } catch (Exception e) {
        }
        
    }
    
}
