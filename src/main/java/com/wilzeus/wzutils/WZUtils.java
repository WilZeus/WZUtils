package com.wilzeus.wzutils;

import com.wilzeus.wzutils.commands.*;
import com.wilzeus.wzutils.misc.JoinQuit;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class WZUtils extends JavaPlugin {


    @Override
    public void onEnable() {
        getLogger().info("WZ Utils is in action!");


        // Commands
        getCommand("clearchat").setExecutor((CommandExecutor) new ClearChat());
        getCommand("gmc").setExecutor(new Gmc());
        getCommand("gms").setExecutor(new Gms());
        getCommand("fly").setExecutor(new Fly());
        getCommand("heal").setExecutor(new Heal());
        getCommand("feed").setExecutor(new Feed());
        getCommand("ping").setExecutor(new Ping());
        getCommand("hat").setExecutor(new Hat());
        getCommand("glow").setExecutor(new Glow());
        getCommand("vanish").setExecutor(new Vanish());
        getCommand("god").setExecutor(new God());

        // Misc
        getServer().getPluginManager().registerEvents(new JoinQuit(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Buh byeeeeeee!");
    }


}