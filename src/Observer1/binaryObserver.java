/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer1;

/**
 *
 * @author aashgar
 */
public class binaryObserver extends Observer{

    public binaryObserver(Subject aSubject){
        this.aSubject = aSubject;
        this.aSubject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary value: " 
                + Integer.toBinaryString(aSubject.getState()));
    }
    
}
