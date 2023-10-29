public class Pr12 {
	
	public static void main (String[] args)
	 {
		int a = IBIO.inputInt("Input total sequence number = ");
		int b = IBIO.inputInt("Input starting number = ");
		int c = IBIO.inputInt("Input the increasement of each term = ");
		for (int i=0; i<a; i++){
			IBIO.out(b+";");
			b=b+c;
		}
		IBIO.output("\nEZZZZZ");
	}
}

