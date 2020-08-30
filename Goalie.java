/**
 * Goalie extends the Player class and dictates the goalie's behavior
 * @author Bryson Carroll
 *
 */
public class Goalie extends Player {
	/**
	 * takes in the name param and uses Player super
	 * @param name
	 */
	public Goalie(String name)
	{
		super(name);
	}
	/**
	 * makes the goalie use block goal behavior
	 */
	public void setOffenceBehavior()
	{
		offenceBehavior = new BlockGoalBehavior();
	}
	/**
	 * makes the goalie use block goal behavior
	 */
	public void setDefenceBehavior()
	{
		defenceBehavior = new BlockGoalBehavior();
	}
	/**
	 * returns the name of the goalie
	 */
	public String toString()
	{
		return "The player " + name + " is a goalie";
	}
}
