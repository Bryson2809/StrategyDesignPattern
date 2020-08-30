import java.util.Random;
/**
 * Forward extends the Player class and decides how the forward will play based on what side they are on
 * @author bryso
 *
 */
public class Forward extends Player{
	/**
	 * Default constructor that uses the param name
	 * @param name
	 */
	public Forward(String name)
	{
		super(name);
	}
	/**
	 * randomly decides if the forward will pass or shoot the puck
	 */
	public void setOffenceBehavior()
	{
		Random r = new Random();
		int rand = r.nextInt(2);
		if(rand == 0)
			offenceBehavior = new PassBehavior();
		else
			offenceBehavior = new ShootBehavior();
	}
	/**
	 * randomly decides if the forward will block or chase the puck
	 */
	public void setDefenceBehavior()
	{
		Random r = new Random();
		int rand = r.nextInt(2);
		if(rand == 0)
			defenceBehavior = new ChasePuckBehavior();
		else
			defenceBehavior = new BlockBehavior();
	}
	/**
	 * returns the name of the forward
	 */
	public String toString()
	{
		return "The player " + name + " is a forward";
	}
}
