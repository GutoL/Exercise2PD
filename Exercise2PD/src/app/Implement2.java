/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author guto
 */
public class Implement2 extends UnicastRemoteObject implements ICalculator{

     protected Implement2() throws RemoteException {
        super();
    }
    
    private static final long serialVersionUID = 1L;
    
    @Override
    public float add(float x, float y) throws RemoteException {
        return x+y;
    }

    
    @Override
    public float sub(float x, float y) throws RemoteException {
        return x-y;
    }
    
    @Override
    public float mult(float x, float y) throws RemoteException {
        return x*y;
    }
    
    @Override
    public float div(float x, float y) throws RemoteException {
        return x/y;
    }
   
    
}
