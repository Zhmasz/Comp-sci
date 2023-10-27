public class Pr32 {
	
	public static void main (String[] args)
	{
		int a=1;
		int b=IBIO.inputInt("Enter a number = ");
		do {
			a++;
		}while (b%a!=0);
		IBIO.output(b + " is devisible by " + a);
	}
}

