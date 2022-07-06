public class Student {

    String  studentName ;
    int studentID ;


    public Student(){ //Leerer Konstruktor
    }

    //Konstruktor
    public Student (String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
    }
    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }


}
