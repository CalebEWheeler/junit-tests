import java.util.ArrayList;

public class Student {
   private long id;
   private String name;
   private ArrayList<Integer> grades;

   public Student(long id, String name) {
       this.id = id;
       this.name = name;
       ArrayList<Integer> grades = new ArrayList<>();
   }

   public long getId() {return this.id;}

   public String getName() {return this.name;}

   public ArrayList<Integer> getGrades() {return this.grades;}

   public double getGradeAverage() {
       double sum = 0;
       for (double grade : this.grades) {
           sum += grade;
       }
       return sum;
   }


}
