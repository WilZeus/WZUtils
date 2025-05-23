package com.wilzeus.wzutils.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You need to be a player to use this command.");
            return true;
        }

        Player player = (Player) sender;
        if (sender.hasPermission("fly.use")) {
            boolean canFly = player.getAllowFlight();
            player.setAllowFlight(!canFly);
            
            if (!canFly) {
                player.sendMessage("You can now fly!");
            } else {
                player.sendMessage("You can no longer fly!");
            }
        }
        return true;
    }
}
