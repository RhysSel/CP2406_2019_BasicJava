package week8;

public class StudentAtLarge extends Student {

    public static final int SAL_TUITION = 2000;

    public StudentAtLarge(String id, String name) {
        super(id, name);
        setTuition();
    }


    public void setTuition() {
        tuition = SAL_TUITION;
    }
}
