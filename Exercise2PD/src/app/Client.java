/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/**
 *
 * @author guto
 */
public class Client {
    
    public static void main(String[] args) {
        
        
        try {
            String s = "";
            
            Registry registry = LocateRegistry.getRegistry("localhost", 2017);// porta do servidor 1

            ICalculator calculator = (ICalculator) registry.lookup("calculator1");
            
            while (!s.equals("exit")) {

              Scanner scanner = new Scanner(System.in);
              
              System.out.println("Digite a operação simples(exemplo:2+2) ou 'exit' para sair:");
              s = scanner.nextLine();
              
              if(!s.equals("exit")){
                CalculatorHelper calculatorHelper = new CalculatorHelper();
                System.out.println("result: "+calculatorHelper.send(s,calculator));
              }
              
            }
            

        } catch (Exception e) {
            System.out.println("Erro cliente");
        }
            
            
        
    }
    
}
