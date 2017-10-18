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
public class StratgeApp {
    
    public static void main(String[] args) {
        
        StratgeDB s1 = new StratgeDB(new ITSutdent());
        StratgeDB s2 = new StratgeDB(new ARTSudent());
        
        
        System.out.println("ITStudent :" +s1.ComputGrade(89.9,79.99,69.99));
        System.out.println("ARTStudent :"+s2.ComputGrade(89.9,79.99,69.99));
    }
}
