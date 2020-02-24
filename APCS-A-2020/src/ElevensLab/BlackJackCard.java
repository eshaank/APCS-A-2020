package ElevensLab;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BlackJackCard extends Card
{
  	//constructors
  	public BlackJackCard( String s, int f)
  	{
  		super( s, f );
  	}

  	//accessors
	public int getValue()
	{
		if (getFace() == 1 )
			return 11;
		if( getFace() >= 10 )
			return 10;
		return getFace();
	}

  	private int getFace() {
		// TODO Auto-generated method stub
		return 0;
	}

	//toString
  	public String toString()
  	{
  		return super.toString() + " " + getValue();
  	}
 }