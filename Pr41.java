public class Pr41 {
	
	public static void main (String[] args)
	 {
		int x=IBIO.inputInt("Enter a number: ");
		int y=IBIO.inputInt("Enter another number: ");
		int action=IBIO.inputInt("\nEnter:\n[1] for add \n[2] for multiply \n[3] for quit\n");
		int z;
		switch(action){
			case 1:
				z=x+y;
				System.out.println("The result of "+x+" plus "+y+" is "+ z);
				break;
			case 2:
				System.out.println("The result of "+x+" times "+y+" is "+ x*y);
				break;
			case 3:
				System.exit(0);
				break;
		}
	}
}

