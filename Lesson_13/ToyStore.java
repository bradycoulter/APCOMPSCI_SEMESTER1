import java.util.ArrayList; 
public class ToyStore
{
	private ArrayList<Toy> toyList;
	public ToyStore()
	{
		toyList = new ArrayList<>();
	}
	public ToyStore(String list)
	{
		this.loadToys(list);
	}
	public void loadToys(String list)
	{
		toyList = new ArrayList<>();
		String[] toys = list.split(", ");
		
		for(int i =0; i < toys.length; i+=2)
		{
			String name = toys[i];
			String type = toys[i+1];
			Toy t = getThatToy(name);
			if(t == null)
			{
				if(type.equals("Car"))
				{
					toyList.add(new Car(name));
				}
				if(type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else 
				t.setCount(t.getCount()+1);
		}
	}
	public Toy getThatToy(String name)
	{
		for(Toy t : toyList) 
		{
			if(t.getName().equals(name))
				return t; 
		}
		return null; 
	}
	
	public String getMostFrequentToy()
	{
		String name = "";
		int max = 0;
		for(Toy toy : toyList)
		{
			if(max < toy.getCount())
			{
				max = toy.getCount();
				name = toy.getName();
			}
		}
		return name;
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy toy : toyList)
		{
			if(toy.getType().equals("Car"))
				cars++;
			if(toy.getType().equals("AF"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if(cars < figures)
			return "Action Figures";
		else
			return "Equal amounts";
	}
	public String toString()
	{
		return toyList.toString();
	}
}