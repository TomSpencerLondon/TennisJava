import java.util.Map;

public class TennisScoreCalculator {

  private final Map<Integer, String> scores = Map.of(
      0, "love",
      1, "fifteen",
      2, "thirty",
      3, "forty"
  );

  public String score(int player1Points, int player2Points) {
    if (isDeuce(player1Points, player2Points)) {
      return "deuce";
    } else if (player1Points >= 3 || player2Points >= 3) {
      return player1Points > player2Points ? "advantage player 1" : "advantage player 2";
    }
    return scores.get(player1Points) + " " + scores.get(player2Points);
  }

  private boolean isDeuce(int player1Points, int player2Points) {
    return (player1Points >= 3 || player2Points >= 3) && (player1Points == player2Points);
  }
}
