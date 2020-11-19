import java.util.Map;

public class TennisScoreCalculator {

  private final Map<Integer, String> scores = Map.of(
      0, "love",
      1, "fifteen",
      2, "thirty"
  );

  public String score(int player1Points, int player2Points) {
    return scores.get(player1Points) + " " + scores.get(player2Points);
  }
}
