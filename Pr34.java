public class Pr34 {
	
	public static void main (String[] args)
	{
		int n=IBIO.inputInt("Enter a number: ");
		int counter=0;
		do{
			if(n%2==0){
				n=n/2;
			}
			else{
				n=(n*3)+1;
			}
			System.out.print(n+",");
			counter=counter+1;
		}while(n!=1);
		System.out.println("\nIt takes " + counter + " steps");
	}
}

