public class personBase 
{
	
	protected String name;
	protected Integer cost;
	
	public personBase(String _name, Integer _cost)
	{
		name = _name;
		cost = _cost;
	}
	
	public personBase()
	{
		
	}

	public String getName() 
	{
		return name;
	}

	public Integer getCost() 
	{
		return cost;
	}

}