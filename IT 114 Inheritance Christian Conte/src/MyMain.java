public class MyMain 
{
	public static void main(String[] args)
	{
		System.out.println("BEGIN");	
		Customer s1 = new Customer("Christian", 12, "college", "1234");
		System.out.println("s1 name:" + s1.getName());
		Manager p1 = new Manager("Ilker", 101, "Kiris");
		System.out.println("p1 name:" + p1.getName());
		Person person1 = s1;
		System.out.println("person1 name:" + person1.getName());
	}
}
