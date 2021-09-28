/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static basiclibrary.Library.getWeather;
import static basiclibrary.Library.tally;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void testLowHighTemp() {
            int[][] weeklyMonthTemperatures = {
                    {66, 64, 58, 65, 71, 57, 60},
                    {57, 65, 65, 70, 72, 65, 51},
                    {55, 54, 60, 53, 59, 57, 61},
                    {65, 56, 55, 52, 55, 62, 57}
            };
            assertEquals("Never saw temperature: [63, 67, 68, 69]", getWeather(weeklyMonthTemperatures));
    }
    @Test
    public void testWinner() {

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");
        String expectedWinner = "Bush";
        assertEquals
                (
                        expectedWinner,
                        tally(votes)
                );
    }
}
