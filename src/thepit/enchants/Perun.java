package thepit.enchants;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;


public class Perun implements Listener {
	int hit = 0;
	int dmg = 10;
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void onHit(EntityDamageByEntityEvent e) {
		Player dmger = (Player) e.getDamager();
		Player target = (Player) e.getEntity();
		Location targetLoc = target.getLocation();
		
		if(dmger.getInventory().getItemInHand().getType() == Material.GOLDEN_SWORD && dmger.getItemInHand().getItemMeta().getLore().contains("§dRARE! §9Combo: Perun's Wrath III")) {
			
			hit++;
			System.out.println(hit);
		if(hit == 4) {
			target.getWorld().strikeLightningEffect(targetLoc);
			target.damage(dmg);
			hit = 0;
		}
	}
	
}
}
