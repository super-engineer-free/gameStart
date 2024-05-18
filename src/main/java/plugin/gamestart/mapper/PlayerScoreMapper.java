package plugin.gamestart.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public abstract class PlayerScoreMapper<PlayerScore> {


  @Select("select * from player_score;")
  public List<PlayerScore> selectList() {
    return null;
  }

  @Insert("insert player_score(player_name, difficulty, score,"
      + " registered_dt) values(#{playerName}, #{difficulty}, #{score}, now())")
  public abstract void insert(PlayerScore playerScore) ;
}