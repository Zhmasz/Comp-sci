public class practice_test2 {
	
	public static void main (String[] args)
	{
		int x;
		int a;
		int b;
		System.out.println("Thomas Zhong");
		do{
		x=IBIO.inputInt("Enter a number less than 10: ");
		if(x<=9){
		for(int i=0;i<=x;i++){
			System.out.print(i);
			a=i*i;
			System.out.print(" "+a);
			b=i*i*i;
			System.out.print(" "+b);
			System.out.println();
		}
		}else{
			System.out.println("Error please enter again");
		}
	}while(x>=9);
}
}

