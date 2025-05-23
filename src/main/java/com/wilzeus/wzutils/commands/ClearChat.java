package com.wilzeus.wzutils.commands;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

import static org.bukkit.Bukkit.broadcastMessage;


public class ClearChat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args) {
        if (sender.hasPermission("clearchat.use")) {
            for (int i = 0; i < 100; i++) {
                broadcastMessage(" ");
            }
            String name = sender.getName();
            broadcastMessage("The chat has been cleared by: " + name + "."); // Message after the loop
            return true;
        } else {
            sender.sendMessage("You don't have permission to use this command.");
        }
        return true; // Default return at the end of the method
    }
}
