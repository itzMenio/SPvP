package de.itzmenio.spvp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.itzmenio.spvp.Listener.PlayerDeathListener;
import de.itzmenio.spvp.Listener.PlayerListener;
import de.itzmenio.spvp.Stats.StatsMethods;
import de.itzmenio.spvp.TabList.Tab;

public class Main extends JavaPlugin {
	
	public static Main plugin;
	
	public static String prefix = "§8[§3SkyPvP§8] §r";
	
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable(){
	plugin = this;
	this.getServer().getPluginManager().registerEvents(new Tab(), this);
	this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
	this.getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
	
	Bukkit.getScheduler().scheduleAsyncRepeatingTask(plugin, new Runnable() {
		
		@Override
		public void run() {
		}
	}, 1, 20);
	}
	
	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		
		Player p = (Player)sender;
		
		int kills = StatsMethods.getKills(p);
		int deaths = StatsMethods.getDeaths(p);
		
		double KD = (double)kills / (double) deaths;
		
		if(cmd.getName().equalsIgnoreCase("stats")){
			if(args.length == 0){
				if(p.hasPermission("skypvp.stats")){
					p.sendMessage(Main.prefix + "§cDeine SkyPvP Statistiken!");
					p.sendMessage(Main.prefix + "§eKills: §3" + StatsMethods.getKills(p));
					p.sendMessage(Main.prefix + "§eDeaths: §3" + StatsMethods.getDeaths(p));
					p.sendMessage(Main.prefix + "§eKillstreak: §3" + StatsMethods.getKillstreak(p));
					p.sendMessage(Main.prefix + "§eK/D: §3" + KD);
				} else {
					p.sendMessage(Main.prefix + "§cDu hast dazu keine Rechte!");
				}
			}
		}
		
		if(cmd.getName().equalsIgnoreCase("spvp")){
			if(args.length == 0){
				if(p.hasPermission("skypvp.menu")){
					p.sendMessage(Main.prefix + "§cSkyPvP Team Menu!");
					p.sendMessage(Main.prefix + "§e/skypvp-config-reload §8- §6Lädt die Config neu!");
				} else {
					p.sendMessage(Main.prefix + "§cDu hast dazu keine Rechte!");
				}
			}
		}
		
		if(cmd.getName().equalsIgnoreCase("coins")){
			if(args.length == 0){
				if(p.hasPermission("skypvp.coins")){
					p.sendMessage(Main.prefix + "§cSkyPvP Coins System!");
					p.sendMessage(Main.prefix + "§e/coins §7<§6Spieler§7>");
					p.sendMessage(Main.prefix + "§e/coins add §7<§6Spieler§7> §7<§6Anzahl§7>");
					p.sendMessage(Main.prefix + "§e/coins remove §7<§6Spieler§7> §7<§6Anzahl§7>");
				}
			}
		}
		
		
		
		
		
		
		
		return true;
		
	}

}
