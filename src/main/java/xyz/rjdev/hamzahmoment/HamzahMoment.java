package xyz.rjdev.hamzahmoment;

import org.bukkit.plugin.java.JavaPlugin;

public final class HamzahMoment extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("HamzahMoment started");
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        getLogger().info("DeathListener registered");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
