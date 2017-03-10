package me.morgancentral99.uhc.gamemanagers;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

import me.morgancentral99.uhc.Main;

public class GameTimers {
	
	public enum TimersEnum {
		STARTING, INGAME, DEATHMATCH, RESTART, OTHER
	}
	
	Main m = Main.getInstance();
	
	private int Timer;
	private int starting;
	private int ingame;
	private int deathmatch;
	private int restart;
	
	public int getTimer(TimersEnum TimerEnum) {
		int timers2 = 5;
		String tm = TimerEnum.toString();
		switch(timers2) {
		case 1: tm = "Starting";
		return starting;
		case 2: tm = "ingame";
		return ingame;
		case 3: tm = "deathmatch";
		return deathmatch;
		case 4: tm = "restart";
		return restart;
		case 5: tm = "other";
		return Timer;
		}
		
		return 0;
	}
	public void setTimer(TimersEnum tm2, int Amount){
		int timers2 = 5;
		String tm = tm2.toString();
		switch(timers2) {
		case 1: tm = "Starting";
		this.starting = Amount;
		startTimer(tm2);
		case 2: tm = "ingame";
		this.ingame = Amount;
		startTimer(tm2);
		case 3: tm = "deathmatch";
		this.deathmatch = Amount;
		startTimer(tm2);
		case 4: tm = "restart";
		this.restart = Amount;
		startTimer(tm2);
		case 5: tm = "other";
		this.Timer = Amount;
		startTimer(tm2);
		}
		
	}
	
	public void startTimer(TimersEnum timerEnum) {
		BukkitScheduler scheduler = null;
		int Timer;
		scheduler.runTaskTimer(m, new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}, 0, 20);
		
	}
	
	

}
