package xyz.rjdev.hamzahmoment;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import static org.bukkit.Bukkit.getServer;

public class DeathListener implements Listener {

    public void sendCommand(String command) {
        Server server = getServer();
        server.dispatchCommand(server.getConsoleSender(), command);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Server server = getServer();
        if (event.getEntity().getLastDamageCause().getCause() == EntityDamageEvent.DamageCause.FALL) {
            sendCommand("title @a times 20 100 20");
            String name = PlayerUtil.getNameAsString(event.getEntity());
            sendCommand(String.format("title @a subtitle {\"text\":\"%s fell from a high place.\"}", name));
            sendCommand("title @a title {\"text\":\"Hamzah Moment\\u2122\",\"bold\":true,\"color\":\"yellow\"}");
        }
    }
}
