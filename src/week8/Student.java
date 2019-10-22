package week8;

public abstract class Student {
    protected int tuition;
    private String studentID;
    private String lastName;

    public Student(String id, String name) {
        setStudentID(id);
        setLastName(name);
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
