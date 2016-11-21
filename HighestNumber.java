
public class HighestNumber

{

	
	public static void main (String[] args)


{

	System.out.print("enter the value of x :");

	int x = Integer.parseInt(System.console().readLine());

	
	System.out.print("enter the value of y :");

	int y = Integer.parseInt(System.console().readLine());

	System.out.print("enter the value of z :");

	int z = Integer.parseInt(System.console().readLine());




	if(x > y && x > z)

	System.out.println("The largest number is:" + x);


	else if(y > x && y > z)

	System.out.println("The largest number is:" + y);

			
	else if (z > x && z > y)

	System.out.println("The largest number is:" + z);
	

	else

	System.out.println("the numbers are not distinct");

	}



}