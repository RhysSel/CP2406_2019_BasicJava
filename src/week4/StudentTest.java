package week4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    @Test
    void basicTest() {
        Student student = new Student();

        assertEquals(3, student.getCreditHours());
        assertEquals(12, student.getPointsEarned());
        assertEquals(9999, student.getStudentId());
    }

    void checkGPA() {
        Student student = new Student();
        student.setCreditHours(3);
        student.setPointsEarned(12);
        assertEquals(student.getPointsEarned() / student.getCreditHours(), student.gpa());
    }

    void intialiser() {
        Student student = new Student();
        student.setCreditHours(3);
        student.setPointsEarned(15);
        student.setStudentId(1111);
        assertEquals(3, student.getCreditHours());
        assertEquals(15, student.getPointsEarned());
        assertEquals(1111, student.getStudentId());
    }
}