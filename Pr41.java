public class Pr41 {
	
	public static void main (String[] args) {
		int a=IBIO.inputInt("Enter a number: ");
		int b=IBIO.inputInt("Enter another number: ");
		int c;
	do{
		c=IBIO.inputInt("Click on [1] for addition [2] for multiplication [3] for quit\n");
		switch(c){
			case 1:
			System.out.println();
			System.out.println(a+" plus "+b+" is equal to "+ (a+b));
			break;
			case 2:
			System.out.println();
			System.out.println(a+" times "+b+" is equal to "+ (a*b));
			break;
			case 3:
			System.out.println("Quitting!");
			System.exit(0);
		}
		if(c>=3){
			System.out.print("Error, ");
		}
	}while(c>=3);	
	}
}

