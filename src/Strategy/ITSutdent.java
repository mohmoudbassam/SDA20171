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
public class ITSutdent implements Student{

    @Override
    public double calcGrade(double Mid, double Lab, double Final) {

        return Mid*0.20 + Lab*0.40 + Final*0.40;
    }
    
    
}
