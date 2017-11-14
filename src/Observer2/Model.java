/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aashgar
 */
public class Model {
    private List<Observer> observers =
            new ArrayList<Observer>();
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyAllObservers();
    }
    
    public void add(Observer anObserver){
        this.observers.add(anObserver);
    }
    
    private void notifyAllObservers(){
        for(Observer anObserver:this.observers)
            anObserver.update();
    }
    
    
}
