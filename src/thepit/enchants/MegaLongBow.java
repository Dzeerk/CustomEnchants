package thepit.enchants;



import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.event.Listener;

public class MegaLongBow implements Listener{

@SuppressWarnings("deprecation")
@EventHandler
public void onProjectileHit(ProjectileHitEvent e){
    if(e.getEntity().getShooter() instanceof Player){
        Player player = (Player) e.getEntity().getShooter();
        	Player p = (Player) e.getEntity();
        	if(player.getInventory().getItemInHand().getType() == Material.BOW && player.getInventory().getItemInMainHand().getItemMeta().getLore().contains("§dRARE! §9Mega Longbow III")){
        				if(e.getHitBlock() == null){
        				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 240, 4));
        				
        				}
        		
        			
        			}
        		}
   	}
}
            
        



