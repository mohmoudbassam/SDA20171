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
public class StudentGrade {

    private Grading grade;
    public StudentGrade(Grading grade) {
        this.grade= grade;
    }
    
    
    public double computeGrade(double mid, double lab , double 
            finalGrade){
       return this.grade.clalculateGrade(mid, lab, finalGrade);
    }
}
