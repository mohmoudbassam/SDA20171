/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

/**
 *
 * @author aashgar
 */
public class observerApp {
    public static void main(String[] args) {
        Model aModel = new Model();
        Observer smallObserver = new smallObserver(aModel);
        Observer largeObserver = new largerObserver(aModel);
        
        aModel.setData("Hello observer");
    }
}
