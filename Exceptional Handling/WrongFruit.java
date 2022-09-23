package exceptionpracticals;

public class WrongFruit {
	public static void food(String fruit) throws WrongFruitException
	{
		if(fruit.equalsIgnoreCase("Mango"))
			System.out.println("I like Mango");
		else
			throw new WrongFruitException("I dont like");
	}
	public static void main(String[] args) {
		try {
			food("MANGO");
		} catch (WrongFruitException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code.....");
	}

}
