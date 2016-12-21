public class Customer extends personBase implements Person
{
	private String name;
	private Integer cost;
	private String credit;
	private String id;
	
	public Customer()
	{
		super("Christian", 12);
	}

	public Customer(String _name, Integer _cost, String _credit, String _id) 
	{
		super(_name, _cost);
		credit = _credit;
		id = _id;
	}

	public String getName(String _lastName)
	{
		return name + _lastName;
	}
	
	public Integer getCost()
	{
		return cost;
	}

	public String purchasing() 
	{
		return "JAVA";
	}
}
