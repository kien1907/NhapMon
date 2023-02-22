/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.StudentFpoly;
import java.util.ArrayList;
import repository.StudentFpolyRepo;

/**
 *
 * @author admin
 */
public class StudentFpolyService {

    private StudentFpolyRepo sfr = new StudentFpolyRepo();

    public boolean them(StudentFpoly sf) {
        return this.sfr.them(sf);
    }

    public boolean sua(StudentFpoly sf) {
        return this.sfr.sua(sf);
    }

    public boolean xoa(StudentFpoly sf) {
        return this.sfr.xoa(sf);
    }
    
    public ArrayList<StudentFpoly> getAllStudentFpolys(){
        return this.sfr.getAllStudents();
    }
}
