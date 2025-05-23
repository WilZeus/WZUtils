package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sorry, you need to be a player to execute this command.");
            return true;
        }

        Player player = (Player) sender;
        if (!(player.hasPermission("feed.use"))) {
            player.sendMessage("You don't have permission to execute this command.");
            return true;
        }

        player.setFoodLevel(20);
        player.setSaturation(20);
        player.sendMessage("You have been fed!");
        return true;
    }
}
