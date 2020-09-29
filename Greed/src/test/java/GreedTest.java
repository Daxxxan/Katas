import com.greed.Greed;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreedTest {
    @Test
    public void testASingleOneShouldEquals100() {
        int[] dicesScores = new int[]{1};
        assertEquals(100, Greed.score(dicesScores));
    }

    @Test
    public void testASingleFiveShouldEquals50() {
        int[] dicesScores = new int[]{5};
        assertEquals(50, Greed.score(dicesScores));
    }

    @Test
    public void testTripleOneShouldEquals1000() {
        int[] dicesScores = new int[]{1, 1, 1};
        assertEquals(1000, Greed.score(dicesScores));
    }

    @Test
    public void testTripleTwoShouldEquals200() {
        int[] dicesScores = new int[]{2, 2, 2};
        assertEquals(200, Greed.score(dicesScores));
    }

    @Test
    public void testTripleThreeShouldEquals300() {
        int[] dicesScores = new int[]{3, 3, 3};
        assertEquals(300, Greed.score(dicesScores));
    }

    @Test
    public void testTripleFourShouldEquals400() {
        int[] dicesScores = new int[]{4, 4, 4};
        assertEquals(400, Greed.score(dicesScores));
    }

    @Test
    public void testTripleFiveShouldEquals500() {
        int[] dicesScores = new int[]{5, 5, 5};
        assertEquals(500, Greed.score(dicesScores));
    }

    @Test
    public void testTripleSixShouldEquals600() {
        int[] dicesScores = new int[]{6, 6, 6};
        assertEquals(600, Greed.score(dicesScores));
    }

    @Test
    public void testTripleSixAndOneOneShouldEquals700() {
        int[] dicesScores = new int[]{6, 6, 1, 6};
        assertEquals(700, Greed.score(dicesScores));
    }

    @Test
    public void testTripleSixAndTwoOneShouldEquals800() {
        int[] dicesScores = new int[]{6, 1, 6, 1, 6};
        assertEquals(800, Greed.score(dicesScores));
    }

    @Test
    public void testFourSixAndTwoOneShouldEquals1400() {
        int[] dicesScores = new int[]{6, 1, 6, 6, 6, 1};
        assertEquals(1400, Greed.score(dicesScores));
    }

    @Test
    public void testFiveFourAndOneOneShouldEquals1700() {
        int[] dicesScores = new int[]{4, 4, 1, 4, 4, 4};
        assertEquals(1700, Greed.score(dicesScores));
    }

    @Test
    public void testSixTwoShouldEquals1600() {
        int[] dicesScores = new int[]{2, 2, 2, 2, 2, 2};
        assertEquals(1600, Greed.score(dicesScores));
    }

    @Test
    public void testRandomShouldEquals550() {
        int[] dicesScores = new int[]{5, 4, 1, 2, 4, 4};
        assertEquals(550, Greed.score(dicesScores));
    }

    @Test
    public void testThreePairsShouldEquals800() {
        int[] dicesScores = new int[]{4, 1, 5, 1, 4, 5};
        assertEquals(800, Greed.score(dicesScores));
    }

    @Test
    public void testStraightShouldEquals1200() {
        int[] dicesScores = new int[]{4, 1, 5, 3, 2, 6};
        assertEquals(1200, Greed.score(dicesScores));
    }

    @Test
    public void testRandomThrowShouldEquals200() {
        int[] dicesScores = new int[]{4, 1, 6, 1};
        assertEquals(200, Greed.score(dicesScores));
    }
}
