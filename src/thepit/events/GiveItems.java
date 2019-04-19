package thepit.events;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GiveItems implements Listener {

	public static ItemStack addItemFlags(ItemStack item, ItemFlag...flags) {
		ItemMeta meta = item.getItemMeta();
		meta.spigot().setUnbreakable(true);
		meta.addItemFlags(flags);
		item.setItemMeta(meta);
		return item;
	}
	
	@EventHandler
	
	public void onJoin(PlayerJoinEvent e) {
		
		Player p = e.getPlayer();
		p.getInventory().clear();
		
		
		ItemStack telebow = addItemFlags(new ItemStack(Material.BOW));
		ItemMeta teleM = telebow.getItemMeta();
		
		teleM.setDisplayName("§cArtifact Tier III Bow");
		teleM.setLore(Arrays.asList(
				"§7Lives: §a100/100",
				"",
				"§DRARE! §9Telebow III",
				"§7Sneak to shoot a teleportation arrow.",
				"",
				"§9Fletching III",
				"§7Deal §c20% §7extra damage."));
		teleM.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		teleM.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		teleM.addEnchant(Enchantment.ARROW_KNOCKBACK, 20, true);
		
		teleM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		telebow.setItemMeta(teleM);
		p.getInventory().addItem(telebow);
		
		/**ItemStack wakepants = addItemFlags(new ItemStack(Material.LEATHER_LEGGINGS));
		ItemMeta pM = wakepants.getItemMeta();
		
		pM.setDisplayName("§cUnobtainable §6Tier §eIII §aWakeballs §9Pants");
		pM.setLore(Arrays.asList(
				"§7Lives: §aInfinite",
				"",
				"§dRARE! §9Combo: Client III",
				"§7You can sprint in all directions",
				"§7and you have permanent §c+50%",
				"§7movement speed. You also have",
				"§7the ability to hit players at any",
				"§7angle and up to §c4 blocks away.",
				"§7Every strike gives you a Big Mac,",
				"§7this increases your weight making you take §eless knockback.",
				"",
				"§dRARE! §9Anti-Mystic Abuse III",
				"§7Anyone detected with §bRare §7or",
				"§bLegendary §7or §bArtifact §7mystics",
				"§7will take §c+300% §7damage while",
				"§7you are online.",
				"",
				"§dRARE! §9Mystic Wipe III",
				"§7Players with §eMysticism IV or",
				"§ehigher §7that are within a §e20",
				"§eblock radius §7of you will have",
				"§7their §binventory §7and §bender",
				"§bchest §7wiped and filled with",
				"§7iron swords that can't be",
				"§7taken out of the chest.",
				"",
				"§cA§6s §es§at§9r§ao§en§6g §ca§6s §ei§a§9r§ao§en"
				));
	
		
	
		wakepants.setItemMeta(pM);
		p.getInventory().setLeggings(wakepants);
		*/
		
		ItemStack phoelsswpants = addItemFlags(new ItemStack(Material.LEATHER_LEGGINGS));
		ItemMeta phoelsswM = phoelsswpants.getItemMeta();
		
		phoelsswM.setDisplayName("§cUnobtainable §6Tier §eIII §aOverpowered §9Pants");
		phoelsswM.setLore(Arrays.asList(
				"§7Lives: §aInfinite",
				"",
				"§9Sweaty III",
				"§7Earn §b+60% XP §7from streak XP",
				"§7bonus and §b+100 max XP §7per kill.",
				"",
				"§9Last Stand III",
				"§7Gain §9Resistance III §7(4",
				"§7seconds) when reaching §c3♥.",
				"",
				"§dRARE! §9Phoenix",
				"§7When you hit 2 hearts, you gain",
				"§7full health, but removes a life on your item.",
				"",
				"§cA§6s §es§at§9r§ao§en§6g §ca§6s §ei§a§9r§ao§en"
				));
		
		phoelsswpants.setItemMeta(phoelsswM);
		p.getInventory().setLeggings(phoelsswpants);
		
		ItemStack helm = addItemFlags(new ItemStack(Material.DIAMOND_HELMET));
		ItemMeta helmM = helm.getItemMeta();
		helmM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		
		helm.setItemMeta(helmM);
		
		p.getInventory().setHelmet(helm);
		
		
		
		ItemStack boots = addItemFlags(new ItemStack(Material.DIAMOND_BOOTS));
		ItemMeta bootsM = boots.getItemMeta();
		bootsM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		
		
		boots.setItemMeta(bootsM);
		p.getInventory().setBoots(boots);
		
		ItemStack djchest = addItemFlags(new ItemStack(Material.DIAMOND_CHESTPLATE));
		ItemMeta djchestM = djchest.getItemMeta();
		djchestM.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		djchestM.setDisplayName("§a§l§n§oDOUBLE-JUMP CHESTPLATE");
		
		
		
		djchest.setItemMeta(djchestM);
		p.getInventory().setChestplate(djchest);
		
		ItemStack arrow = new ItemStack(Material.ARROW);
		
		p.getInventory().addItem(arrow);
		
		/**
		ItemStack kbstick = new ItemStack(Material.STICK);
		ItemMeta kbstickM = kbstick.getItemMeta();		
		kbstickM.addEnchant(Enchantment.KNOCKBACK, 1000, true);
		kbstickM.setDisplayName("§c§l§n§oEL BATONO SACRETOS");
		kbstickM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		kbstick.setItemMeta(kbstickM);
		
		p.getInventory().addItem(kbstick);
		*/

		ItemStack mlb = addItemFlags(new ItemStack(Material.BOW));
		ItemMeta mlbM = mlb.getItemMeta();
		
		mlbM.setDisplayName("§cArtifact Tier III Bow");
		mlbM.setLore(Arrays.asList(
				"§7Lives: §a100/100",
				"",
				"§DRARE! §9Mega Longbow III",
				"§7Shoot an arrow to get §aJump Boost IV §7(§e4s§7)",
				"",
				"§9Fletching III",
				"§7Deal §c20% §7extra damage."));
		mlbM.addEnchant(Enchantment.DAMAGE_ALL, 0, true);
		mlbM.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		mlbM.addEnchant(Enchantment.ARROW_KNOCKBACK, 20, true);
		
		mlbM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		mlb.setItemMeta(mlbM);
		p.getInventory().addItem(mlb);
		
		ItemStack testsword = addItemFlags(new ItemStack(Material.GOLDEN_SWORD));
		ItemMeta testswM = testsword.getItemMeta();
		
		testswM.setDisplayName("§2Test Sword");
		testswM.setLore(Arrays.asList(
				"§6This is a test sword. It's only used",
				"§6to do damage to test enchantments."
				));
		testswM.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		testswM.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		testsword.setItemMeta(testswM);
		p.getInventory().addItem(testsword);
		
		p.updateInventory();
		
		
	}

}
