import java.util.Scanner;

public class Calculator {
public static void main(String[]args)
{
	Scanner scan = new Scanner(System.in);

	System.out.println("Pick your Operation");
	System.out.println("1 for +");
	System.out.println("2 for -");
	System.out.println("3 for /");
	System.out.println("4 for *");
	
	int choose =scan.nextInt();
	System.out.println("Enter Two Number");
	int x = scan.nextInt();
	int y = scan.nextInt();
	
	if(choose == 1)
	{
		System.out.println("The ans is:" + add(x,y));
	}
	else if(choose ==2)
	{
		System.out.println("The ans is:" + sub(x,y));

	}
	
	else
	{
		System.out.println("out of range");
	}
}
public static int add(int x, int y)
{
	int n;
	n=x+y;
	return n;
}
public static int sub(int x, int y)
{
	int n;
	n=x-y;
	return n;
}
public static int div(int x, int y)
{
	int n;
	n=x/y;
	return n;
}

public static int mul(int x, int y)
{
	int n;
	n=x+y;
	return n;
}{
	
plus plusObject = new plus();
plusObject.simpleMessage();

mul mulObject = new mul();
mulObject.simpleMessage1();


}
}