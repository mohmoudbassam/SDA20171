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
public class largerObserver extends Observer{
    
    public largerObserver(Model aModel){
        this.aModel = aModel;
        this.aModel.add(this);
    }
    @Override
    public void update() {
        System.out.println(this.aModel.getData().toUpperCase());
    }
    
}
