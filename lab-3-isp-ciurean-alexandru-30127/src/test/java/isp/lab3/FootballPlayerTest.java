package isp.lab3;

import isp.lab3.exercise3.FootballPlayer;
import isp.lab3.exercise4.MyPoint;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FootballPlayerTest {
    @Test
    public void TestgetName() {
        //when
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Barca", 'M');
        String result = footballPlayer.getName();

        //then
        assertEquals("Default name should be Cristiano Ronaldo", "Cristiano Ronaldo", result);

    }

    @Test
    public void TestGetTeam() {
        //when
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Juventus", 'M');
        String result = footballPlayer.getTeam();

        //then
        assertEquals("Default team should be Juventus", "Juventus", result);

    }

    @Test
    public void TestGetGoalScored() {
        //when
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Barca", 'M');
        int result = footballPlayer.getGoalScored();

        //then
        assertEquals("Result should be 0", 0, result);
    }

    @Test
    public void TestGetGender() {
        //when
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Barca", 'M');
        char result = footballPlayer.getGender();
        // tu nu ai un constructor by default ia hai sa iti arat
        //then
        assertEquals("M", 'M', result);

    }

    @Test
    public void TestScoreAGoal() {
        FootballPlayer footballPlayer = new FootballPlayer("Tatarusanu", "Lyon", 'M');
        footballPlayer.scoreAGoal();
        assertEquals("Default goals scored should be 1", 1, footballPlayer.getGoalScored());
    }

    @Test
    public void TestToString() {
        FootballPlayer footballPlayer = new FootballPlayer("Cristiano Ronaldo", "Juventus", 'M');
        String result = footballPlayer.toString();
        assertEquals("toString should return 'Cristiano Ronaldo(m) scored 0 goals at Juventus'", "Cristiano Ronaldo(M) scored 0 goals at Juventus", result);
    }

    @Test
    public void TestSetTeam() {
        FootballPlayer footballPlayer = new FootballPlayer();
        footballPlayer.setTeam("Juventus");
        assertEquals("Team should be Juve", "Juventus", footballPlayer.getTeam());
    }


    @Test
    public void TestConstructor() {
        FootballPlayer footballPlayer = new FootballPlayer("Alex", "Real Madrid", 'M');

        /*int length = rectangle.getLength();
        int width = rectangle.getWidth();
        String color = rectangle.getColor();*/
        String name = footballPlayer.getName();
        String team = footballPlayer.getTeam();
        char gender = footballPlayer.getGender();
        int goalScored = footballPlayer.getGoalScored();
        assertEquals("Default name should be Alex", "Alex", name);
        assertEquals("Default team should be Real Madrid", "Real Madrid", team);
        assertEquals("Default gender should be 'M'", 'M', gender);
        assertEquals("Default goalscored should be 0", 0, goalScored);

    }
}