package thepit.enchants;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LastStandIII implements Listener {
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void dmg(EntityDamageByBlockEvent event) {
	Player p = (Player) event.getEntity();
	Location loc = p.getLocation();
	if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getItemMeta().getLore().contains("§9Last Stand III") && p.getHealth() <= 14){
		p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 160, 2));
}
	}
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void dmg(EntityDamageByEntityEvent event) {
	Player p = (Player) event.getEntity();
	Location loc = p.getLocation();
	if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getItemMeta().getLore().contains("§9Last Stand III") && p.getHealth() <= 14){
		p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 160, 2));
}
	}
}
