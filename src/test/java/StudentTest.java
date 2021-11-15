import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
//DOUGLAS REVIEW
    private Student student;

    @Before
    public void createStuffToWorkWith(){
        student = new Student(1000, "Joanna");
    }

    @Test
    public void canCreateAStudent(){
        assertNotNull(student);
    }

    @Test
    public void canGetStudentInfo(){
        assertEquals("Joanna", student.getName()); //need to create method
        assertEquals(1000, student.getId());
    }

    @Test
    public void canGetGrades(){
        List<Integer> grades = student.getGrades();
        assertNotNull(grades);
    }

    @Test
    public void canAddGrade(){
        student.addGrade(Integer.valueOf(100));

        List<Integer> grades = student.getGrades();
        assertEquals(1, grades.size());
        assertEquals(Integer.valueOf(100), grades.get(0));
    }

    @Test
    public void canGetAverage(){
        student.addGrade(100);
        student.addGrade(85);
        student.addGrade(70);
        double gradeAverage = student.getGradeAverage();

        assertEquals(85, gradeAverage, 0);
    }

    @Test
    public void canGetAverageWithZeroGrades(){
        double gradeAvg = student.getGradeAverage();
        assertEquals(0, gradeAvg, 0);
    }

    @Test
    public void canOnlyAddPositiveGrades(){
        student.addGrade(-100);
        List<Integer> grades = student.getGrades();
        assertEquals(0, grades.size());
    }

    //Other tests to include:
    //test for null name
    //test for null id

//MY CODE
//    @Test
//    public void hasID(){
//        assertEquals(0.0, Student.id, 0);
//    }
//
//    @Test
//    public void hasName(){
//        assertNull(Student.name);
//    }
//
//    @Test
//    public void hasGrades(){
//        assertNull(Student.grades);
//    }
//
//    @Test
//    public void isNamesInitialized(){
//        assertNotNull("name initialization issue", Student.name);
//    }
//
//    @Test
//    public void isGradesInitialized(){
//        assertNotNull("grades initialization issue", Student.grades);
//    }
//
//    @Test
//    public void getIdReturnsId(){
//        Student student1 = new Student("1", 1);
//        assertEquals("ID does not match as expected",1, student1.getId());
//    }
//
//    @Test
//    public void getNameReturnsName(){
//        Student student1 = new Student("1", 1);
//        assertEquals("Name does not match as expected","1", student1.getName());
//    }
//
//    @Test
//    public void getGradesIsInitialized(){
//        Student student1 = new Student("1", 1);
//        assertTrue(student1.grades.isEmpty());
//    }
//
//    @Test
//    public void addGradeAddsGrade(){
//        Student student1 = new Student("1", 1);
//        student1.addGrade(90);
//        ArrayList<Integer> test = new ArrayList<>();
//        test.add(90);
//        assertEquals(student1.grades, test);
//    }
//
//    @Test
//    public void getGradesReturnsGrades(){
//        Student student1 = new Student("1", 1);
//        student1.addGrade(90);
//        assertEquals(student1.grades, student1.getGrades());
//    }
//
//    @Test
//    public void getGradeAverageReturnsAverage(){
//        Student student1 = new Student("1", 1);
//        student1.addGrade(90);
//        student1.addGrade(100);
//
//        assertEquals(student1.getGradeAverage(), 95.0, 0);
//    }
}
