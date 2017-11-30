/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import CRS.AppLogic.Student;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
               aStudent.getGrade()+")";
            aStatement.executeUpdate(strSQl);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     public List<Student> getStudents(){
        List<Student> students= new ArrayList<>();
        DbConnection adConnection = DbConnection.getDbConnection();
        String sql = "Select * from students";
        try {
            aStatement = adConnection.getStatement();
            ResultSet rs = aStatement.executeQuery(sql);
            while(rs.next()){
                Student aStudent = new Student();
                aStudent.setName(rs.getString("name"));
                aStudent.setMajor(rs.getString("major"));
                aStudent.setGrade(rs.getDouble("grade"));
                students.add(aStudent);                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(DbStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        return students;
    }


    
}
