import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TennisScoreCalculatorTest {
    @Test
    void return_love_love_for_0_0() {
        TennisScoreCalculator tennisScoreCalculator = new TennisScoreCalculator();

        assertEquals(tennisScoreCalculator.score(0, 0), "Love love");
    }
}
