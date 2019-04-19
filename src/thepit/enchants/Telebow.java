package thepit.enchants;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Telebow implements Listener {

	
	  
	@SuppressWarnings("deprecation")
	@EventHandler
	    public void onProjectileHit(ProjectileHitEvent e){
	        if(e.getEntity().getShooter() instanceof Player){
	            Player player = (Player) e.getEntity().getShooter();
	            Location loc = player.getLocation();
	            if(player.getInventory().getItemInHand().getType() == Material.BOW && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§DRARE! §9Telebow III")){
	            	if(player.isSneaking()) {
	            		if(e.getHitBlock() == null){
	                    player.teleport(e.getHitEntity());
	                } else if (e.getHitEntity() == null){
	                    player.teleport(e.getHitBlock().getLocation().add(0,1,0));
	                    player.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 10, 999999999);
	                    player.sendMessage("§c§lTELEPORTED! §7Coordinates : ");
	                    player.sendMessage("");
	                    player.sendMessage("" + loc);
	            
	                }
	            	}
	                
	            }
	        }
	    }
	   
	}
