package thepit.enchants;

import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;


public class Phoenix implements Listener {
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void dmg(EntityDamageByEntityEvent event) {
	Player p = (Player) event.getEntity();
	Location loc = p.getLocation();
	if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getItemMeta().getLore().contains("§dRARE! §9Phoenix") && p.getHealth() <= 6){
		p.setHealth(20D);
			p.getWorld().playSound(loc, Sound.ENTITY_BAT_DEATH, 1000000, 0);
			p.sendMessage("§e§lPHOENIX! §7You regained full health."); 
			p.getWorld().playEffect(p.getLocation().add(0,2,0), Effect.SMOKE, 100);
			p.getWorld().playEffect(p.getLocation().add(0,2,0), Effect.MOBSPAWNER_FLAMES, 100);
	}
		
	}	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.NORMAL)
	public void dmg(EntityDamageByBlockEvent event) {
	Player p = (Player) event.getEntity();
	Location loc = p.getLocation();
	if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getItemMeta().getLore().contains("§dRARE! §9Phoenix") && p.getHealth() <= 6){
		p.setHealth(20D);
			p.getWorld().playSound(loc, Sound.ENTITY_BAT_DEATH, 1, 0);
			p.sendMessage("§e§lPHOENIX! §7You regained full health."); 
			p.getWorld().playEffect(p.getLocation().add(0,2,0), Effect.SMOKE, 100);
			p.getWorld().playEffect(p.getLocation().add(0,2,0), Effect.MOBSPAWNER_FLAMES, 100);
		
	}	
	
				/**
		  @EventHandler(priority = EventPriority.NORMAL)
	    public void onEntityHit(EntityDamageByEntityEvent e){
		
		Player p = (Player) e.getEntity();
		Location loc = p.getLocation();
		if(p.getInventory().getLeggings().getType() == Material.LEATHER_LEGGINGS && p.getInventory().getLeggings().getItemMeta().getLore().contains("§DRARE! §9Phoenix")){
		if(p.getHealth() == 4D) {
			p.setHealth(20D);
			p.playSound(loc, Sound.ENTITY_BAT_DEATH, (float) 0.5, 1);
		 */
			
	
}
}
	
	

	

	
