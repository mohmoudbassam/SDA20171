/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.AppLogic.Student;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class DbStudent {
    private Statement aStatement;
    public void addStudent(Student aStudent){
        DbConnection adConnection = DbConnection.getDbConnection();
        try {
            aStatement = adConnection.getStatement();
            String strSQl = 
   "Insert into students(name,major,grade) values('"+
               aStudent.getName()+"','"+
               aStudent.getMajor()+"',"+
               aStudent.getGrde()+")";
            aStatement.executeUpdate(strSQl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
