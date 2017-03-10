package me.morgancentral99.uhc.commandExecuter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import me.morgancentral99.uhc.utils.Methods;

public class UHCCore implements CommandExecutor{

		

	@Override
	public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
		if(args.length == 0) {
			s.sendMessage(Methods.CharColor("&4Usage"));
		}
		return false;
	}

}
