package net.gamerguys.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;

import net.gamerguys.HelloWorld.Commands.HelloCommand;

public class Main extends JavaPlugin{

	@Override
	public void onEnable() {
			new HelloCommand(this);
		
	}
}
