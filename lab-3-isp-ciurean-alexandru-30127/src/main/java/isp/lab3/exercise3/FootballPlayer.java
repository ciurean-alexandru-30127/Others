package isp.lab3.exercise3;

import isp.lab3.exercise2.Rectangle;

import java.util.Queue;
import java.util.Random;

public class FootballPlayer {
    private String name;
    private String team;
    private int goalScored;
    private char gender;

    /**
     * this constructor should initialize the name, team and gender with the given values and the goalsScore will be 0
     *
     * @param name   is the name of the player
     * @param team   is the team of the player
     * @param gender is the gender of the player
     */

    public FootballPlayer(String name, String team, char gender) {

        this.name = name;
        this.team = team;
        this.gender = gender;
        this.goalScored = 0;

    }

    public FootballPlayer() {

    }

    /**
     * This method should get the name of player
     *
     * @return the name.
     */


    public String getName() {

        return this.name;
    }

    /**
     * This method should get the team of player
     *
     * @return the team.
     */


    public String getTeam() {
        return this.team;

    }

    /**
     * This method should get the gender of the player
     *
     * @return the gender
     */


    public char getGender() {

        return this.gender;
    }

    /**
     * This is a toString method
     *
     * @param team is the team of the player
     * @return : {Football player-name} ({gender}) scored {goalsScored} goals for team ”
     */


    public String setTeam(String team) {
        return this.team = team;
    }

    /**
     * This method should get the goals scored
     *
     * @return the goalScored
     */

    public int getGoalScored() {
        return this.goalScored;
    }

    /**
     * This metode should add 1 to goalScored every time the player scores a goal
     *
     * @return the goalScored
     */

    public int scoreAGoal() {
        return this.goalScored += 1;
    }

    /**
     * This is a toString method
     *
     * @return {Football player-name} ({gender}) scored {goalsScored} goals for team
     */

    public String toString() {
        return name + "(" + gender + ")" + " scored " + goalScored + " goals at " + team;
    }

    public static void main(String[] args) {
        FootballPlayer footballPlayer = new FootballPlayer("Alex", "Real Madrid", 'M');
        String team = footballPlayer.getTeam();
        footballPlayer.setTeam("Real Madrid");
        String name = footballPlayer.getName();
        char gender = footballPlayer.getGender();
        int goalScored = footballPlayer.getGoalScored();
        footballPlayer.scoreAGoal();
        String result = footballPlayer.toString();


        System.out.println("The name of the team is " + name);
        System.out.println("The team is: " + team);
        System.out.println("The team is: " + footballPlayer.getTeam());
        System.out.println("The gender is " + gender);
        System.out.println("the player has scored " + goalScored);
        System.out.println("The player scored a goal: " + footballPlayer.getGoalScored());
        System.out.println(" " + result);
        Random rand = new Random();
        int rand_int = rand.nextInt((30 - 15 + 1)) + 15;
        for (int i = 0; i < rand_int - 1; i++) {
            footballPlayer.scoreAGoal();
        }
        String detailsOfFootballPlayer = footballPlayer.toString();
        System.out.println(detailsOfFootballPlayer);
    }
}
