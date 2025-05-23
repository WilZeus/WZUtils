package com.wilzeus.wzutils.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class Hat implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("You need to be a player to execute this command.");
            return true;
        }

        Player player = (Player) sender;
        PlayerInventory inv = player.getInventory();

        ItemStack handItem = player.getInventory().getItemInMainHand();
        ItemStack currentHelmet = inv.getHelmet();
        if (handItem.getType().isAir()) {
            player.sendMessage("You need to hold an item to put on your head!");
            return true;
        }

        inv.setHelmet(handItem);
        inv.setItemInMainHand(currentHelmet);
        player.sendMessage("You put " + handItem.getType().toString() + " on your head!");
        return true;
    }
}
