public class Pr43 {
	
	public static void main (String[] args) {
	int n;
	int sum;
	boolean finding=false;
	do{
		n = IBIO.inputInt("Enter a number less than 1000: ");
	}while(n>=1000);
	
	for (int x=0;x<2;x++){
		for (int y=0;y<1000;y++){
			sum=x*x + y*y;
		if (sum==n){
		System.out.println("The square of "+x+" and "+y+" makes "+n);
		finding=true;
		break;
		}
	}
	}
	if(!finding){
		System.out.println("Impossible!");
	}
}
}

