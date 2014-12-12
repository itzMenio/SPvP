package de.itzmenio.spvp.Methods;

import org.bukkit.entity.Player;

import de.itzmenio.spvp.Main;

public class Coins {

	public static void giveCoins(Player p, int i){
		Main.plugin.getConfig().set(p.getName() + ".Coins", Main.plugin.getConfig().getInt(p.getName() + ".Coins", 0) + i);
		Main.plugin.saveConfig();
		p.sendMessage(Main.prefix + "§eDu hast §3" + i + " §eCoins erhalten!");
	}
	
	public static void getCoins(Player p, int i){
		Main.plugin.getConfig().get(p.getName() + ".Coins", Main.plugin.getConfig().getInt(p.getName() + ".Coins"));
		Main.plugin.saveConfig();
	}
}
