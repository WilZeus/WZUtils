package com.wilzeus.wzutils.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.command.CommandExecutor;
import static org.bukkit.Bukkit.broadcastMessage;

public class Vanish implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("This command can only be used by players.");
            return true;
        }

        Player player = (Player) sender;
        if (player.hasPermission("vanish.use")) {
            boolean isVanished = false;
            for (Player p : player.getServer().getOnlinePlayers()) {
                if (p.canSee(player)) {
                    isVanished = false;
                    break;
                } else {
                    isVanished = true;
                }
            }
            if (isVanished) {
                for (Player p : player.getServer().getOnlinePlayers()) {
                    p.showPlayer(player);
                }
                player.sendMessage("You are now visible.");
                broadcastMessage("§e" + player.getName() + " joined the game.");
            } else {
                for (Player p : player.getServer().getOnlinePlayers()) {
                    p.hidePlayer(player);
                }
                player.sendMessage("You are now vanished.");
                broadcastMessage("§e" + player.getName() + " left the game.");
            }
        }
        return true;
    }
}


