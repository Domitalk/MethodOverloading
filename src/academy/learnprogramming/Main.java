package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("Time", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        // apparently the selection of the method during autofill doesn't matter
//        calculateScore(75);
//        calculateScore();

        // test 1
        System.out.println("100 mins and 30 seconds should print out 01h 40m 30s");
        System.out.println(getDurationString(100, 30));

        // test 2
        System.out.println("100 seconds should print out 00h 01m 40s");
        System.out.println(getDurationString(100));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("void");
        return 0;
    }

    public static String getDurationString(int minutes, int seconds) {
        // validate that first param minutes is >= 0
        // validate that second param seconds is >= 0 && <= 59
        // method should return "Invalid value" if either of the above are not true
        // if the params are valid, then calculate how many hours mins and seconds equal the params.
        // and return that value as a string in format "XXh YYm ZZs"
    }

    public static String getDurationString(int seconds) {
        // validate that it is >= 0 , and return "Invalid value" if its not true
        // if valid, calculate how many mins are in the params then call the other overloaded method
        // in calling the overloaded method, give it mins and seconds

    }




}
