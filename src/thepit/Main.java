package thepit;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import thepit.enchants.LastStandI;
import thepit.enchants.LastStandII;
import thepit.enchants.LastStandIII;
import thepit.enchants.MegaLongBow;
import thepit.enchants.Phoenix;
import thepit.enchants.Telebow;
import thepit.events.DoubleJump;
import thepit.events.GiveItems;
import thepit.events.ScoreboardPit;

public class Main extends JavaPlugin{
	
	public static Plugin plugin;
	private List<Color> colorList = new ArrayList<>();
	public static List<String> lore = new ArrayList();
	public static double tv_rotate;
	public static String target_captured;
	private static Main instance;
	
	
	@Override
	public void onEnable() {
		System.out.println("BowEnchant ~ Starting...");
		getServer().getPluginManager().registerEvents(new Telebow(), this);
		getServer().getPluginManager().registerEvents(new GiveItems(), this);
		getServer().getPluginManager().registerEvents(new DoubleJump(), this);
		getServer().getPluginManager().registerEvents(new MegaLongBow(), this);
		/**getServer().getPluginManager().registerEvents(new ScoreboardPit(), this);*/
		getServer().getPluginManager().registerEvents(new Phoenix(), this);
		getServer().getPluginManager().registerEvents(new LastStandI(), this);
		getServer().getPluginManager().registerEvents(new LastStandII(), this);
		getServer().getPluginManager().registerEvents(new LastStandIII(), this);
		loadColors();
		startTask();
	}
	public static Main getInstance(){
	    return instance;
	  }

	
	private void loadColors() {
		colorList.add(Color.RED);
		colorList.add(Color.ORANGE);
		colorList.add(Color.YELLOW);
		colorList.add(Color.LIME);
		colorList.add(Color.BLUE);
		
		
	}
	
	private Color getRandomColor() {
	return colorList.get(new Random().nextInt(colorList.size()-1));
	}

	private void startTask() {
		new BukkitRunnable() {

			@Override
			public void run() {
				Color color = getRandomColor();
				for(Player p : Bukkit.getOnlinePlayers()) {
					PlayerInventory inv = p.getInventory();
					List<ItemStack> armorList = new ArrayList<ItemStack>();
					
					if(inv.getLeggings() != null) {
						if(inv.getLeggings().getType() == Material.LEATHER_LEGGINGS && inv.getLeggings().getItemMeta().getDisplayName().contains("§cUnobtainable §6Tier §eIII §aWakeballs §9Pants") || inv.getLeggings().getItemMeta().getDisplayName().contains("§cUnobtainable §6Tier §eIII §aOverpowered §9Pants")) {
							armorList.add(inv.getLeggings());
					
						
					}
				}
				for(ItemStack armor : armorList) {
					LeatherArmorMeta learmorM = (LeatherArmorMeta) armor.getItemMeta();
					learmorM.setColor(color);
					
					armor.setItemMeta(learmorM);
					
				}
			}
				
			}
		}.runTaskTimerAsynchronously(this, 0, 20);
	}
}



		
	
