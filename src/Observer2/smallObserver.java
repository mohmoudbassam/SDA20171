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
public class smallObserver extends Observer{
    
    public smallObserver(Model aModel){
        this.aModel = aModel;
        this.aModel.add(this);
    }
    @Override
    public void update() {
        System.out.println(this.aModel.getData().toLowerCase());
    }
    
}
