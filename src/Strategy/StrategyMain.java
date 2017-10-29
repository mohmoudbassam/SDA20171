/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author aashgar
 */
public class StrategyMain {
    public static void main(String args[]){
        Context contextA = new Context(new OperationAdd());
        System.out.println("5 + 6 = " + contextA.executeStrategy(5, 6));
        
        Context contextS = new Context(new OperationSubtract());
        System.out.println("5 - 6 = " + contextS.executeStrategy(5, 6));
        
        Context contextM = new Context(new OperationMultiply());
        System.out.println("5 * 6 = " + contextM.executeStrategy(5, 6));
    }
}
