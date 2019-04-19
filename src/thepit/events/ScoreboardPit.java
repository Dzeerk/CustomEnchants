package thepit.events;




import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;



public class ScoreboardPit /*implements Listener*/ {

	/**@EventHandler
	public void join(PlayerJoinEvent event){
	Player player = event.getPlayer();

	ScoreboardManager m = Bukkit.getScoreboardManager();
	Scoreboard b = m.getNewScoreboard();

	Objective o = b.registerNewObjective("Gold", "");
	o.setDisplaySlot(DisplaySlot.SIDEBAR);
	o.setDisplayName("§e§lTHE HYPIXEL PIT");

	Score l0 = o.getScore("§706/03/19 §8mini5K");
	l0.setScore(13);
	Score l1 = o.getScore("§0");
	l1.setScore(12);
	Score l2 = o.getScore("§fPrestige: §eXXX");
	l2.setScore(11);
	Score l3 = o.getScore("§fLevel:  [§4§l85§f]");
	l3.setScore(10);
	Score l4 = o.getScore("§fNeeded XP: §b88,927");
	l4.setScore(9);
	Score l5 = o.getScore("§d");
	l5.setScore(8);
	Score l6 = o.getScore("§fGold: §61,082,960.64g");
	l6.setScore(7);
	Score l7 = o.getScore("§9");
	l7.setScore(6);
	Score l8 = o.getScore("§fStatus: §cFighting §7(45)");
	l8.setScore(5);
	Score l9 = o.getScore("§fBounty: §66,800g");
	l9.setScore(4);
	Score l10 = o.getScore("§fStreak: §a3458");
	l10.setScore(3);
	Score l11 = o.getScore("§3");
	l11.setScore(2);
	Score l12 = o.getScore("§eplay.hypixel.net");
	l12.setScore(1);

	player.setScoreboard(b);


	}

	}
*/	
	
	

	/**public Map<Player, ScoreboardSign> boards = new HashMap<>();
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		ScoreboardSign sb = new ScoreboardSign(p, "§e§lTHE HYPIXEL PIT");
		sb.create();
		sb.setLine(0, "§706/03/19 §8mini5K");
		sb.setLine(1, "§0");
		sb.setLine(2, "§fPrestige: §eXXX");
		sb.setLine(3, "§fLevel:  [§f§l1§f§l1§f§l5§f]");
		sb.setLine(4, "§fNeeded XP: §b88,927");
		sb.setLine(5, "§d");
		sb.setLine(6, "§fGold: §61,082,960.64g");
		sb.setLine(7, "§9");
		sb.setLine(8, "§fStatus: §aIdling");
		sb.setLine(9, "§fBounty: §66,800g");
		sb.setLine(10, "§fStreak: §a3458");
		sb.setLine(11, "§3");
		sb.setLine(12, "§eplay.hypixel.net");
		
}*/
}

		

