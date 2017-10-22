/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVCWithObserver;

import java.util.Observable;

/**
 *
 * @author aashgar
 */
public class Model extends Observable{
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        setChanged();
        notifyObservers();
    }
    
}
