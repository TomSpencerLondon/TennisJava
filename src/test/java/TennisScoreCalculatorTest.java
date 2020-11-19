import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Test list
// zombies - zero, one, many, boundary, interface, exceptional conditions, simple test - simple solutions
// 0 0
// 1 0
// 0 1
// 1 1
// 2 0
// 2 1
// 2 2
// 3 0
// 3 1
// 3 2
// 3 3 - deuce!
// 4 3 - advantage player 1!
// 4 4 - deuce!
// 4 5 - advantage player 2!
// 4 6 - Game player 1!
// You cannot be serious!
class TennisScoreCalculatorTest {
  @ParameterizedTest
  @CsvSource({
      "0, 0, 'love love'",
      "1, 0, 'fifteen love'",
      "0, 1, 'love fifteen'",
      "1, 1, 'fifteen fifteen'",
      "2, 0, 'thirty love'",
      "2, 1, 'thirty fifteen'",
      "2, 2, 'thirty thirty'",
      "3, 3, 'deuce'"
  })
  void return_love_love_for_0_0(int player1Points, int player2Points, String result) {
    TennisScoreCalculator tennisScoreCalculator = new TennisScoreCalculator();
    assertEquals(tennisScoreCalculator.score(player1Points, player2Points), result);
  }
}
