package plugin.gamestart.command;

import java.net.http.WebSocket.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.gamestart.command.GameStartCommand;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
       GameStartCommand gameStartCommand = new GameStartCommand(this);
        Bukkit.getPluginManager().registerEvents(gameStartCommand,this);
        getCommand("gamestart").setExecutor(gameStartCommand);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
