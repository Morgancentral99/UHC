package me.morgancentral99.uhc;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;

import me.morgancentral99.uhc.utils.Methods;

public class GameManager {
	
	public enum ServerState {
		STARTING, ERROR, ENDING, INGAME
	}
	
	public String worldName = (String) Main.getInstance().config.get("world.info.name");
	Methods md;
	
	public ServerState server;

	public void onEnable() {
		Methods.getLogger("Loading world " + worldName + "!");
		World w = Bukkit.getServer().createWorld(new WorldCreator("UHC"));
		w.setFullTime(0);
		w.setAutoSave(true);
		w.setStorm(false);
	//	w.setDifficulty();

	}
	
	public void onDisable() {
		Methods.getLogger("Disabling...");
	}

	public void setServerState(ServerState server) {
		this.server = server;
	}
	public ServerState getServerState() {
		return server;
	}


}
