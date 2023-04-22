package Utilities;


import Utilities.Student;
import java.util.ArrayList;


/**
 *
 * @author siddh
 */
public class Branch {
    String code;
    ArrayList<Student> students; 
    public Branch(String code) {
        this.code = code;
        students=new ArrayList<>();
    }
    public void addStudent(Student s){
        students.add(s);
    }
}
