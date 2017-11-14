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
public class observerApp {
    public static void main(String[] args) {
        Subject aSubject = new Subject();
        Observer binary = new binaryObserver(aSubject);
        Observer octal = new octalObserver(aSubject);
        Observer hexa = new hexaObserver(aSubject);
        
        aSubject.setState(100);
    }
    
}
