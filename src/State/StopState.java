/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class StopState implements State{

    @Override
    public void doaction(Context context) { 
        System.out.println("Players is in Stop...");
        context.setState(this);
    } 

    @Override
    public String toString() {
        return "StopState";
    }
    
    
    
}
