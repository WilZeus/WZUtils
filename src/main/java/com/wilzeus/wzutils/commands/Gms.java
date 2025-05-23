package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.GameMode;

public class Gms implements org.bukkit.command.CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Sorry, you need to be a player to use this command.");
        } else {
            if (sender.hasPermission("wzutils.gms")) {
                Player player = (Player) sender;
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage("You are now in survival mode!");
            }
        }
        return true;
    }
}
