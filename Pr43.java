public class Pr43 {
	
	public static void main (String[] args)
	 {
		int n;
		int search;
		do{
			n=IBIO.inputInt("Enter a number within 1000: ");
		if(n>=1000){
			System.out.println("Number too large!");
		}
		}while(n>1000);

		for (int x=0;x<=2;x++){
			for (int y=0;y<=1000;y++){
				search=x*x + y*y;
				if (search==n){
				System.out.println(x + ", " + y);
				}
			}
		}
		System.out.println("Impossible");
	}
}


