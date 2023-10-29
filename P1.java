

public class P1 {
	
	public static void main (String[] args)
	{
	IBIO.output("Thomas");
	String name = ("Thomas");
	int a = IBIO.inputInt("Enter any positive number: ");
	if (a<0){
		IBIO.output("\nPlease enter a positive number!");
		IBIO.inputInt("Enter any positive number: ");
	}
	for (int i = 0; i < a; i++){
		IBIO.output(name);
}
	}
}

