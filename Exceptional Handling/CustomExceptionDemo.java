package exceptionpracticals;

public class CustomExceptionDemo {
	public static void validate(int age) throws InvalidAgeException {
		if(age>18)
			System.out.println("vote");
		else
			throw new InvalidAgeException("Invalid age to vote");
	}
	public static void main(String[] args) {
		try {
			validate(1);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("rest of code....");
	}

}
