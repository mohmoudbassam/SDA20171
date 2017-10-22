/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author aashgar
 */
public class GradingAdapter extends Grading{
    private LegacyGrading alegacyGrading;
    public GradingAdapter(){
        alegacyGrading = new LegacyGrading();
    }
    @Override
    public double computeGrade(double mid, double lab, double fin) {
        return alegacyGrading.claculateGrade
                ((int) Math.round(mid), (int) Math.round(lab), (int) Math.round(fin));
    }
    
}
