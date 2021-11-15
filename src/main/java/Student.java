import java.util.ArrayList;
import java.util.List;

public class Student {
//Douglas Review Code

    private long id;
    private String name;
    private ArrayList<Integer> grades;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public long getId() {
        return this.id;
    }

    public List<Integer> getGrades() {
        return this.grades;
    }

    public void addGrade(int i) {
        if(i < 0) return;
        this.grades.add(i);
    }

    public double getGradeAverage() {
        double total = 0;
        if(this.grades.isEmpty()) return 0;

        for(int grade: this.grades){
            total += grade;
        }
        return total/this.grades.size();
    }


//MY CODE
//    public static long id;
//    public static String name;
//    public static ArrayList<Integer> grades;
//
//    public Student(String studentName, long studentID){
//        id = studentID;
//        name = studentName;
//        grades = new ArrayList<Integer>();
//    }
//
//    public long getId(){
//        return id;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public ArrayList<Integer> getGrades(){
//        return grades;
//    }
//
//    public static void main(String[] args) {
//        Student april = new Student("April", 2);
//        april.getId();
//        april.getName();
//        april.getGrades();
//    }
//
//    public void addGrade(int grade){
//        grades.add(grade);
//    }
//
//    public double getGradeAverage(){
//        double sum = 0;
//        for(int grade: grades){
//            sum += grade;
//        }
//        return sum/grades.size();
//    }
}
