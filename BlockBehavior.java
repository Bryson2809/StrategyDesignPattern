import java.util.Random;
public class BlockBehavior implements DefenceBehavior {
	public String play()
	{
		Random r = new Random(2);
		int rand = r.nextInt();
		if(rand == 0)
			return "Blocks player from passing";
		else if(rand == 1)
			return "Blocks player from shooting";
		else if(rand == 2)
			return "Checks player with puck";
		else
			return null;
	}
}
