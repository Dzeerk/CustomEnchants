package thepit.events;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.inventory.ItemStack;

public class EntityShootTelebowEvent extends EntityEvent implements Cancellable
{
  private static final HandlerList handlers = new HandlerList();
  private final ItemStack bow;
  private final float force;
  private boolean cancelled;
  
  public EntityShootTelebowEvent(LivingEntity entity, ItemStack bow, float force)
  {
    super(entity);
    this.bow = bow;
    this.force = force;
  }
  
  public EntityShootTelebowEvent(EntityShootBowEvent event)
  {
    this(event.getEntity(), event.getBow(), event.getForce());
  }
  
  public LivingEntity getEntity()
  {
    return (LivingEntity)super.getEntity();
  }
  
  public ItemStack getBow()
  {
    return this.bow;
  }
  
  public float getForce()
  {
    return this.force;
  }
  
  public boolean isCancelled()
  {
    return this.cancelled;
  }
  
  public void setCancelled(boolean cancel)
  {
    this.cancelled = cancel;
  }
  
  public HandlerList getHandlers()
  {
    return handlers;
  }
  
  public static HandlerList getHandlerList()
  {
    return handlers;
  }
}
