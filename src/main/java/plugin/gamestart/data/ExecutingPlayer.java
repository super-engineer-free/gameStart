package plugin.gamestart.data;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Difficulty;
import org.bukkit.entity.Player;

@Getter
@Setter
public class ExecutingPlayer {

  private Player player;
  private String playerName;
  private int gameTime;
  private int sumScore;

  public ExecutingPlayer(Player player, int initScore, Difficulty isDifficulty) {
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }

  public String getPlayerName() {
    return playerName;
  }

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public int getGameTime() {
    return gameTime;
  }

  public void setGameTime(int gameTime) {
    this.gameTime = gameTime;
  }

  public int getSumScore() {
    return sumScore;
  }

  public void setSumScore(int sumScore) {
    this.sumScore = sumScore;
  }

/**
   * コマンドを実行したプレイヤーのゲーム情報を格納
   *
   * @param player       コマンドを実行したプレイヤー
   * @param initScore    初期スコア
   * @param isDifficulty 難易度
   */
}