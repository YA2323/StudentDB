import java.util.Arrays;

public class StudentDB {

   // Student [] allStudents = new Student[] {"yacin",123};

    public Student [] students;   //Student Objekt Array

    public StudentDB(){
    }
    public StudentDB(Student [] students){
        this.students = students;
    }

    @Override
    public String toString() {
        String result="";
        for (int i=0;i<students.length;i++){
            result+="Name : "+students[i].getStudentName()+" ID : "+students[i].getStudentID()+"\n";
        }

        return result;
    }

    public Student [] getAllStudents(){
        return students;
    }

}
