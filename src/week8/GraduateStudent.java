package week8;

public class GraduateStudent extends Student {
    public static final int GRAD_TUITION = 60000;

    public GraduateStudent(String id, String name) {
        super(id, name);
        setTuition();
    }

    public void setTuition() {
        tuition = GRAD_TUITION;
    }
}
