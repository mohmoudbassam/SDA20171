/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author aashgar
 */
public class Student implements University{
    @Override
    public void aggregator(){
        System.out.println("Student ...");
    }
}
