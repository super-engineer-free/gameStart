package plugin.gamestart.data;

import org.bukkit.Difficulty;

public class PlayerScore {

  private String getId;
  private int getPlayerName;
  private int getDifficulty;
  private int getScore;
  private int getRegisteredDt;

  public PlayerScore(String playerName, Class<? extends Difficulty> aClass, int sumScore) {
  }


  public String getId() {
    return getId;
  }

  public int getPlayerName() {
    return getPlayerName;
  }

  public int getDifficulty() {
    return getDifficulty;
  }

  public int getScore() {
    return getScore;
  }

  public int getRegisteredDt() {
    return getRegisteredDt;
  }
}