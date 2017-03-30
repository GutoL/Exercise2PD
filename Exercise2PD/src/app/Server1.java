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
public class Server1 {
    
    public static void main(String args[]){
        
        try {
            
            Implement1 implement1 = new Implement1();
            
            Registry registry = LocateRegistry.createRegistry(2017);
            
            registry.bind("calculator1", implement1);
            
            
        } catch (Exception e) {
        }
        
    }
    
}
