package me.morgancentral99.uhc.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import me.morgancentral99.uhc.GameManager;
import me.morgancentral99.uhc.GameManager.ServerState;
import me.morgancentral99.uhc.utils.Methods;

public class OnPlayerJoinLeaveEvents implements Listener {
	GameManager gm;

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		if(gm.getServerState().equals(ServerState.INGAME)) {
			Player player = event.getPlayer();
			player.kickPlayer(Methods.CharColor("&6Game Started..."));
		}
		else if(gm.getServerState().equals(ServerState.ENDING)) {
			Player player = event.getPlayer();
			player.kickPlayer(Methods.CharColor("&4Game Ending... Please wait..."));
		}
	}
	
	@EventHandler
	public void onPlayerLeave(PlayerQuitEvent event) {
		event.setQuitMessage(Methods.CharColor("&6[&4!&6] &4" + event.getPlayer().getDisplayName() + " &6Has Quit!"));
	 
	
	
	
	
	}

}
