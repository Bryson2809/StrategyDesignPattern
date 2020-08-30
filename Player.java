/**
 * This abstract class is resposnasble for setting up a players attributes as well as whether the team is on offense or defense.    
 * @author Bryson Carroll
 *
 */
public abstract class Player implements OffenceBehavior, DefenceBehavior{
	public String name;
	public boolean offense;
	public DefenceBehavior defenceBehavior;
	public OffenceBehavior offenceBehavior;
	
	/**
	 * Default constructor that sets name to the param, puts the team on offense, and sets the offense and defense behavior
	 * @param name
	 */
	public Player(String name) 
	{
		this.name = name;
		offense = true;
		setOffenceBehavior();
		setDefenceBehavior();
	}
	/**
	 * sets the offense behavior to null
	 */
	public void setOffenceBehavior() 
	{
		offenceBehavior = null;
	}
	/**
	 * Sets the defense behavior to null
	 */
	public void setDefenceBehavior() 
	{
		defenceBehavior = null;
	}
	/**
	 * calls the play method from offense or defense behavior depending on which side the team is playing
	 */
	public String play() 
	{
		if(offense == true)
			return offenceBehavior.play();
		else
			return defenceBehavior.play();
	}
	/**
	 * changes the boolean value of offense
	 */
	public void turnover() 
	{
		if(offense == true)
			offense = false;
		else
			offense = true;
	}
}
