package com.wilzeus.wzutils.misc;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuit implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent Event) {
        String name = Event.getPlayer().getName();
        Event.setJoinMessage("§7[§a+§7] " + name);
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent Event) {
        String name = Event.getPlayer().getName();
        Event.setQuitMessage("§7[§c-§7] " + name);
    }
}