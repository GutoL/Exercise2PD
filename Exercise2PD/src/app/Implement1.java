/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guto
 */
public class Implement1 extends UnicastRemoteObject implements ICalculator{
    
    protected Implement1() throws RemoteException {
        super();
    }
    
    private static final long serialVersionUID = 1L;
    Registry registry = LocateRegistry.getRegistry("localhost", 2018);// porta do servidor 2
    
    
    @Override
    public float add(float x, float y) throws RemoteException, AccessException {
        try {
            
            ICalculator calculator = (ICalculator) registry.lookup("calculator2");
            return calculator.add(x, y);
        
        
        } catch (NotBoundException ex) {
            Logger.getLogger(Implement1.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    
        
    }

    @Override
    public float sub(float x, float y) throws RemoteException {
        
        try {
            
            ICalculator calculator = (ICalculator) registry.lookup("calculator2");
            return calculator.sub(x, y);
        
        
        } catch (NotBoundException ex) {
            Logger.getLogger(Implement1.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    @Override
    public float mult(float x, float y) throws RemoteException {
    
         try {
            
            ICalculator calculator = (ICalculator) registry.lookup("calculator2");
            return calculator.mult(x, y);
        
        
        } catch (NotBoundException ex) {
            Logger.getLogger(Implement1.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    @Override
    public float div(float x, float y) throws RemoteException {
    
         try {
            
            ICalculator calculator = (ICalculator) registry.lookup("calculator2");
            return calculator.div(x, y);
        
        
        } catch (NotBoundException ex) {
            Logger.getLogger(Implement1.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
    
}
