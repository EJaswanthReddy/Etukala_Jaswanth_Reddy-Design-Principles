package epam_task3;
import java.util.*;

public class app {
	public static void main(String args[])
	{	
		
		char c='y';
		while(c=='y')
		{
			int a,b;
			Scanner s=new Scanner(System.in);
			System.out.println("enter first operand");
			a=s.nextInt();
			System.out.println("enter second operand");
			b=s.nextInt();
			System.out.println("choose an operator(+,-,*,/)");
			char ch=s.next().charAt(0);
			calcy res=new calcy();
			switch(ch)
			{
				case '+':System.out.println(a+ "+" +b+ "=" +res.add(a,b));break;
				case '-':System.out.println(a+ "-" +b+ "=" +res.sub(a,b));break;
				case '*':System.out.println(a+ "x" +b+ "=" +res.mul(a,b));break;
				case '/':System.out.println(a+ "/" +b+ "=" +res.div(a,b));break;
				default:System.out.println("enter a valid operator!");
		
			}
		
		System.out.println("do you want to perform another operation [y/n]");
		c=s.next().charAt(0);
		}
	}
	
}
