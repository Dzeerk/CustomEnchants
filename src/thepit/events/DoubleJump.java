package thepit.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.util.Vector;

public class DoubleJump implements Listener {
	 
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        e.getPlayer().setAllowFlight(true);
    }
   
    @EventHandler
    public void onPlayerDoubleJump(PlayerToggleFlightEvent e){
        Player p = e.getPlayer();
        if(p.getGameMode() != GameMode.CREATIVE && p.getInventory().getChestplate().getItemMeta().getDisplayName().contains("§a§l§n§oDOUBLE-JUMP CHESTPLATE")){
            e.setCancelled(true);
            Block b = p.getWorld().getBlockAt(p.getLocation().subtract(0,2,0));
            if(!b.getType().equals(Material.AIR)){
                Vector v = p.getLocation().getDirection().multiply(1).setY(1);
                p.setVelocity(v);
                if(b.getType().equals(Material.AIR)){
                    Vector v1 = p.getLocation().getDirection().multiply(1).setY(1);
                    p.setVelocity(v1);
                if(!p.getInventory().getChestplate().getItemMeta().getDisplayName().contains("§a§l§n§oDOUBLE-JUMP CHESTPLATE")) {
                	e.getPlayer().setAllowFlight(false);
                }
            }
        }
    }
    }
}
