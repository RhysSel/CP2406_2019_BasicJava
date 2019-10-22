package week8;

public class UndergraduateStudent extends Student {

    public static final int UNDERGRAD_TUITION = 40000;

    public UndergraduateStudent(String id, String name) {
        super(id, name);
        setTuition();
    }


    public void setTuition() {
        tuition = UNDERGRAD_TUITION;
    }
}
