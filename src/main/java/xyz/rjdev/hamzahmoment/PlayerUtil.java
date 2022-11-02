package xyz.rjdev.hamzahmoment;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permissible;

public class PlayerUtil {

    public static String getNameAsString(Permissible playerObject) {
        if (playerObject instanceof Player) {
            Player player = (Player) playerObject;
            Component displayName = player.displayName();
            if (displayName instanceof TextComponent) {
                return ((TextComponent) displayName).content();
            }
        };
        return "Error";
    }
}
