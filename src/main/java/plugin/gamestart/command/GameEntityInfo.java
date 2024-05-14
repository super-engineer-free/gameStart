package plugin.gamestart.command;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

@Getter
@Setter
public class GameEntityInfo {

  public Player player;
  public Location entityLocation;
  public Entity entity;
  public Integer pairId;

  public GameEntityInfo(Player player, Location selectEntityPosition, Entity entity, Integer pairID) {
  }


  public void setPlayer(Player player) {
    this.player = player;
  }

  public Location getEntityLocation() {
    return entityLocation;
  }

  public void setEntityLocation(Location entityLocation) {
    this.entityLocation = entityLocation;
  }

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }

  public Integer getPairId() {
    return pairId;
  }

  public void setPairId(Integer pairId) {
    this.pairId = pairId;
  }
}
