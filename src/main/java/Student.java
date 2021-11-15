import java.util.ArrayList;

public class Student {
    public static long id;
    public static String name;
    public static ArrayList<Integer> grades;

    public Student(String studentName, long studentID){
        id = studentID;
        name = studentName;
        grades = new ArrayList<Integer>();
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getGrades(){
        return grades;
    }

    public static void main(String[] args) {
        Student april = new Student("April", 2);
        april.getId();
        april.getName();
        april.getGrades();
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: grades){
            sum += grade;
        }
        return sum/grades.size();
    }
}
