package week7;

public class DemoHSBaseballGame {
    public static void main(String[] args) {
        HighSchoolBaseballGame bbGame = new HighSchoolBaseballGame();
        bbGame.setNames("Central", "North");
        System.out.println("\nAt start");
        display(bbGame);
        bbGame.setScore(0, 0, 2);
        bbGame.setScore(1, 0, 0);
        System.out.println("\nAfter setting first inning");
        display(bbGame);
        System.out.println("\nTrying to set fifth inning (inning 4) too soon");
        bbGame.setScore(0, 4, 1);
        System.out.println("\nAfter setting second inning scores");
        bbGame.setScore(0, 1, 1);
        bbGame.setScore(1, 1, 4);
        display(bbGame);
        System.out.println("\nTryng to use an invalid inning");
        bbGame.setScore(0, 7, 2);
        System.out.println("\nTrying to use an invalid team");
        bbGame.setScore(2, 2, 2);
        System.out.println("\nAfter setting the rest of the innings");
        for (int t = 0; t < 2; ++t)
            for (int i = 2; i < bbGame.getInnings(); ++i)
                bbGame.setScore(t, i, 2);
        display(bbGame);

    }

    public static void display(HighSchoolBaseballGame b) {
        int[] total = {0, 0};
        boolean areInningsLeft = false;
        int score;
        System.out.println("Game between " + b.getNames());
        for (int t = 0; t < 2; ++t) {
            for (int i = 0; i < b.getInnings(); ++i) {
                score = b.getScore(t, i);
                if (score != HighSchoolBaseballGame.UNPLAYED) {
                    if (i == 0)
                        System.out.print("Team " + t + ": ");
                    System.out.print(score + " ");
                    total[t] += score;
                } else
                    areInningsLeft = true;
            }
            System.out.println();
        }
        if (b.getScore(0, 0) == HighSchoolBaseballGame.UNPLAYED && b.getScore(1, 0) == HighSchoolBaseballGame.UNPLAYED)
            System.out.println("No innings played yet.");
        if (!areInningsLeft) {
            if (total[0] > total[1])
                System.out.println("Team 1 wins!");
            else if (total[0] < total[1])
                System.out.println("Team 2 wins!");
            else
                System.out.println("Tie Game!");
        }
    }
}