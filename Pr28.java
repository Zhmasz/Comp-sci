public class Pr28 {
	
	public static void main (String[] args)
	{
		int a=0;
		for (int i=0; i<=1000000; i++){
			if(i%2==1||i%3==1||i%5==1||i%7==1){
				a++;
			}
		}
		IBIO.output(a);
	}
}

