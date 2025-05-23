package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class God implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (!(player.hasPermission("god.use"))) {
            player.sendMessage("You don't have permission to use this command.");
            return true;
        } else {
            player.setInvulnerable(!player.isInvulnerable());
            if (player.isInvulnerable()) {
                player.sendMessage("You are now in god mode.");
            } else {
                player.sendMessage("You are no longer in god mode.");
            }
        }
        return true;
    }
}
