package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ping implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You need to be a player to execute this command.");
            return true;
        }

        Player player = (Player) sender;
        player.sendMessage("Pong! Took " + player.getPing() + " ms to respond!");
        return true;
    }
}
