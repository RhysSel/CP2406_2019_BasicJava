package week4;

import java.util.Scanner;

public class FitnessTracker {
    private String activity;
    private int participationTime; // minutes
    private String date;

    public FitnessTracker() {
        activity = "running";
        participationTime = 0;
        date = "1/1/2019";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Activity : ");
        String activity = input.nextLine();
        System.out.println(activity);

        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter Participation Time : ");
        int participationTime = input2.nextInt();
        System.out.println(participationTime);

        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter the Date in DD/MM/YYYY : ");
        String date = input3.nextLine();
        System.out.println(date);

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
