package plugin.gamestart.command;
public class Difficulty {



  EASY("easy", 15, 1, 3),
  NORMAL("normal", 60, 3, 15),
  HARD("hard", 120, 5, 35),

  NONE("none",0,0,0) {
  }


  private final String difficulty;
  private final int gameTime;
  private final int loopCount_entityPosition;
  private final int loopCount_dummyList;

  Difficulty(String difficulty, int gameTime, int loopCount_entityPosition, int loopCount_dummyList) {
    this.difficulty = difficulty;
    this.gameTime = gameTime;
    this.loopCount_entityPosition = loopCount_entityPosition;
    this.loopCount_dummyList = loopCount_dummyList;
  }



  public int getGameTime() {
    return gameTime;
  }


  public int getLoopCount_dummyList() {
    return loopCount_dummyList;
  }
}
