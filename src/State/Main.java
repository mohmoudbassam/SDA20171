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
public class Main { 
    public static void main(String[] args) {
        Context context = new Context();
        
        StartState start = new StartState();
        start.doaction(context); 
        System.out.println(context.getState().toString());
         
        
        StopState stop = new StopState();
        stop.doaction(context);
        System.out.println(context.getState().toString());
    }
    
}
