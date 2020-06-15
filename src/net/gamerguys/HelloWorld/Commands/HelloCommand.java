package net.gamerguys.HelloWorld.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import net.gamerguys.HelloWorld.Main;

public class HelloCommand implements CommandExecutor {

	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
		
	}

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String lable,@NotNull String[] args) {
		if(!(sender instanceof Player)) {
			
			sender.sendMessage("Only Players can run this");
			return true;
			
		}
		if(cmd.getName().equalsIgnoreCase("hello")) {
			Player p = (Player) sender;
			
			if(p.hasPermission("hello.use")) {
				p.sendMessage("Hi back at you"+p.getName());
				p.
				
				return true;
			} 
			else {
				p.sendMessage("No permission");
			}
			
		}
		
		
		
		return false;
	}
}
