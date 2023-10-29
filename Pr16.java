public class Pr16 {
	
	public static void main (String[] args)
	{
		int a=3;
		int b=4;
		int c;
		int n =IBIO.inputInt("Input the number of term you want the Fibonacci sequence to be = ");
		IBIO.out(a + " " + b);
		for (int i=2; i<=n; i++){
			c=a+b;
			IBIO.out("; " + c);
			a=b;
			b=c;
		}
	}
}

