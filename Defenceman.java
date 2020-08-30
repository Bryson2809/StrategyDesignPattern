/**
 * Defenceman extends the player class and decides the behavior of the defenders
 */
import java.util.Random;
public class Defenceman extends Player {
	/**
	 * Takes in the string parameter name and calls the player class aswell as setting offense and defense behavior
	 * @param name
	 */
	public Defenceman(String name)
	{
		super(name);
		setOffenceBehavior();
		setDefenceBehavior();
	}
	/**
	 * Randomly decides if the player will pass or take a slap shot 1 in 9 times
	 */
	public void setOffenceBehavior()
	{
		Random r = new Random();
		int rand = r.nextInt(10);
		if(rand == 0)
			offenceBehavior = new PassBehavior();
		else
			offenceBehavior = new SlapShotBehavior();
	}
	/**
	 * Randomly decides if the defender will chase the puck or block the puck
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
	 * returns the name of the defenseman
	 */
	public String toString()
	{
		return "The player " + name + " is a defenseman";
	}
}
