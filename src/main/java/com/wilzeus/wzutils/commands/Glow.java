package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Glow implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You need to be a player to execute this command.");
            return true;
        }

        Player player = (Player) sender;
        player.setGlowing(!player.isGlowing());
        player.sendMessage("Your glowing status has been toggled!");
        return true;
    }
}
