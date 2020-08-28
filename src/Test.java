import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Gabby Ryan");
		System.out.println("PROGRAMMING ASSINGMENT 4 - SET");
		System.out.println(" ");
		Set set = new Set();
		String choice = "";
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter command:");
			choice = scan.nextLine();
			String terms[] = choice.split(" ");
			if (terms.length == 2)
			{
				if (terms[0].trim().equalsIgnoreCase("add"))
				{
					try
					{
						int number = Integer.parseInt(terms[1]);
						set.add(number);
						System.out.println(set);
					}
					catch (Exception e)
					{
						System.out.println("Invalid input");
					}
				}
				else if (terms[0].trim().equalsIgnoreCase("del"))
				{
					try
					{
						int num = Integer.parseInt(terms[1]);
						set.delete(num);
						System.out.println(set);
					}
					catch (Exception e)
					{
						System.out.println("Invalid input");
					}
				}
				else if (terms[0].trim().equalsIgnoreCase("exists"))
				{
					try
					{
					int num = Integer.parseInt(terms[1]);
					System.out.println(set.exists(num));
				}
					catch (Exception e)
					{
						System.out.println("Invalid input")
;					}
				}
				else 
				{
					System.out.println("Incorrect command");
				}
			}
			else
			{
				System.out.println("Usage should be <command><space><number>");
				
			}
			
		
	}
	
}
}
