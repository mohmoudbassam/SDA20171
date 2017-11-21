/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.AppLogic;

/**
 *
 * @author aashgar
 */
public class EngGrading implements Grading {

    @Override
    public double clalculateGrade(double mid, double lab, double finalGrade) {
        return mid * 30 / 100 + lab * 20 / 100 + finalGrade * 50 / 100;
    }

    
}
