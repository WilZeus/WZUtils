package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;

public class Gmc implements org.bukkit.command.CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sorry, you need to be a player to use this command.");
        } else {
            if (sender.hasPermission("wzutils.gmc")) {
                Player player = (Player) sender;
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage("You are now in creative mode!");
            }
        }
        return true;
    }
}
