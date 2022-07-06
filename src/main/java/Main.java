public class Main {

    public static void main(String[] args) {

      Student firstStudent = new Student ("Nils",203);
      Student secondStudent = new Student("Hans",306);

      Student [] allStudents = {firstStudent,secondStudent};

      StudentDB teilnehmer = new StudentDB(allStudents);


      System.out.println(teilnehmer.toString());

    }
}
