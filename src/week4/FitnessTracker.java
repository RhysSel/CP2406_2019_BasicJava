package week4;

public class FitnessTracker {
    private String activity;
    private int participationTime; // minutes
    private String date;

    public FitnessTracker() {
        activity = "running";
        participationTime = 0;
        date = "1/1/2019";
    }

    public FitnessTracker(String activity, int participationTime, String date) {
        this.activity = activity;
        this.participationTime = participationTime;
        this.date = date;


    }

    public int getParticipationTime() {
        return participationTime;
    }

    public void setParticipationTime(int participationTime) {
        this.participationTime = participationTime;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
