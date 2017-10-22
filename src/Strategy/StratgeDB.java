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
public class StratgeDB {
    
    private Student aStudent;
    
    public StratgeDB(Student aStudent){
         this.aStudent = aStudent;
    }
     
    
    public double computeGrade(double Mid, double Lab, double Final){
       
       return this.aStudent.calcGrade(Mid, Lab, Final);
        
    }
}
