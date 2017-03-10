package me.morgancentral99.uhc;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.morgancentral99.uhc.GameManager.ServerState;
import me.morgancentral99.uhc.commandExecuter.UHCCore;
import me.morgancentral99.uhc.utils.Methods;

public class Main extends JavaPlugin {
	
	FileConfiguration config;
	File config2;
	GameManager gm;
	static Main instance;
	
	
	public boolean enabled;
	
	@Override
	public void onLoad() {
		gm.setServerState(ServerState.STARTING);
	}
	
	public void onEnable() {
		if(!getDataFolder().exists()){
			getDataFolder().mkdir();
			Methods.getLogger("Enabled UHC");
			config.addDefault("enabled", true);
			config.addDefault("world.info.name", "UHC");
			config.addDefault("world.info.difficulty", "Normal");
			
			Listeners();
			Commands();
	}
		
		reloadConfig();
		
		if(enabled) {
			gm.onEnable();
		} else {
			System.out.print("UHC Disabled in Config!");
		}
		

		
		
}
	
	private void Listeners() {
		
		PluginManager pm = Bukkit.getPluginManager();
		
		
	}

	private void Commands() {
		this.getCommand("UHC").setExecutor(new UHCCore());
		
	}

	@Override
	public void onDisable() {
		gm.onDisable();
	}
	
	
	
	public static Main getInstance() {
		return Main.instance;
	}

	

}
