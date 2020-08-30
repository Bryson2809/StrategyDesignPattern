
import java.util.Random;
/**
 * Implements OffenseBehavior and DefenceBehavior and randomly decides how the goalie will block the puck
 * @author Bryson Carroll
 *
 */
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior {
	/**
	 * Randomly decides how the goalie will block the goal
	 */
	public String play()
	{
		Random r = new Random();
		int rand = r.nextInt(4);
		if(rand == 0)
			return "hand blocks the puck";
		else if(rand == 1)
			return "catches the puck";
		else if(rand == 2)
			return "blocks the puck with knee pads";
		else
			return "blocks puck with stick";
	}
}
