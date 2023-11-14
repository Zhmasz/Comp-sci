public class Mock_practical_programming_test_xPOWERy{
	
	public static void main (String[] args) {
		boolean equal0=true;
	while(equal0){
		System.out.println("Thomas Zhong\n");
		int a=IBIO.inputInt("Input a base: ");
		int b=IBIO.inputInt("Input a exponent: ");
		System.out.println();
		int c=1;
		double d=1;
		if(a==0){
			System.out.println(">Base = zero. Nothing to do.");
			System.out.println("\n>Program ending!!!");
			System.exit(0);
		}else if(a<=0){
			System.out.println(">Warning: exponent should be positive");
			System.out.println("\n>Program ending!!!");
			System.exit(0);
		}
		if(b>0){
			for(int i=0;i<=b;i++){
				c=c*a;
			}
			System.out.println(a + " to the power of " + b + " = " + c);
			System.out.println("\n>Program ending!!!");	
			System.exit(0);
		}else if(b<0){
			for(int i=0;i>=b;i--){
				c=c*a;
			}
			d=d/c;
			System.out.println("			1");
			System.out.println(a + " to the power of " + b + " = ---" + " = " + d);
			System.out.println("	   	       "+c);
			System.out.println("\n>Program ending!!!");	
			System.exit(0);
		}else if(b==0){
			equal0=false;
			System.out.println("\n>Program ending!!!");
		}
	}			
}
}

