public class Manager extends personBase implements Person
{
	private String name;
	private Integer cost;
	private String title;
	
	public Manager(String _name, Integer _age, String _title)
	{
		super(_name, _age);
		this.title = _title;
	}
	
	public String getName() 
	{
		return "Prof." + super.getName();
	}
	
	public Integer getCost()
	{
		return cost;
	}
	
	public String getTitle()
	{
		return title;
	}

}
