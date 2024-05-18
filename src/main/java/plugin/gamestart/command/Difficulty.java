package plugin.gamestart.command;
public class Difficulty {






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
