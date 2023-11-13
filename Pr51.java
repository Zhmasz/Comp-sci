public class Pr51 {
	
	public static void main (String[] args) {
		double numerator=1;
		double denominator=5;
		double result;
		double sum=0;
		for(int i=0;i<=100;i++){
			result=numerator/denominator;
			sum=sum+result;
			denominator=denominator*5;
		}
		System.out.println(sum);
	}
}

