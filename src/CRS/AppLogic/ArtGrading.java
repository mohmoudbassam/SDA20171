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
public class ArtGrading implements Grading {

    @Override
    public double clalculateGrade(double mid, double lab, double finalGrade) {
        return mid * 20 / 100 + lab * 50 / 100 + finalGrade * 30 / 100;
    }

    
}
