package me.morgancentral99.uhc.utils;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;

import me.morgancentral99.uhc.Main;
import net.md_5.bungee.api.ChatColor;

public class Methods {
	
	private static Logger log = Bukkit.getLogger();
	
	private String Difficulty;
	
	Main instance = Main.getInstance();
	
	public Methods(Main instance) {
		this.instance = instance;
	}
	
	public enum Levels {
		INFO, SEVERE, DEBUG, WARNING
	}

	public static void getLogger(Levels level, String Text) {
		if(level.equals(Levels.INFO)) {
			log.info(Text);
		}
		else if(level.equals(Levels.DEBUG)) {
			log.info("[DEBUG] " + Text);
		} else if(level.equals(Levels.SEVERE)) {
			log.severe("[SEVERE] " + Text);
		} else if(level.equals(Levels.WARNING)) {
			log.warning("[WARNING] " + Text);
		}
	}
	
	public static void getLogger(String Text) {
		log.info(Text);
	}
	
/*	public org.bukkit.Difficulty getDifficulty() {
		
		Difficulty = Main.getInstance().getConfig().getString("world.info.difficulty"); 
			if(Difficulty.equalsIgnoreCase("peaceful")) {
				return Difficulty.;
			} else if(Difficulty.equalsIgnoreCase("easy")) {
				return 1;
			} else if(Difficulty.equalsIgnoreCase("normal")) {
				return 2;
			} else if(Difficulty.equalsIgnoreCase("hard")) {
				return 3;
			
		}
			return 2;
		
	}	
*/	
	
	public static String CharColor(String s) {
		String chat = ChatColor.translateAlternateColorCodes('&', s);
		return chat;
	}


}
