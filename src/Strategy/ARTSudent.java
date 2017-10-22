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
public class ARTSudent implements Student{

    @Override
    public double calcGrade(double Mid, double Lab, double Final) {

        return Mid*0.40 + Lab*0.10 + Final*0.50;
    }
    
}
