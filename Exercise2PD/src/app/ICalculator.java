/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author guto
 */
public interface ICalculator extends Remote{
    
    float add(float x, float y)throws RemoteException;
    float sub(float x, float y)throws RemoteException;
    float mult(float x, float y)throws RemoteException;
    float div(float x, float y)throws RemoteException;
    
    
}
