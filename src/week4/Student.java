package week4;

public class Student {
    private int studentId;
    private int creditHours;
    private int pointsEarned;

    public Student() {
        studentId = 9999;
        creditHours = 3;
        pointsEarned = 12;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getPointsEarned() {
        return pointsEarned;
    }

    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double gpa() {
        return (double) this.pointsEarned / this.creditHours;
    }
}
