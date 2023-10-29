public class Pr14 {
	
	public static void main (String[] args)
	{
		int a=1;
		IBIO.out("This program will displays the first 100 terms of the triangular sequence");
		IBIO.out ("\n");
		for (int i=0;i<=100;i++){
			a=a+i;
			IBIO.out(a + "; ");
		}
	}
}

