public class Pr42 {
	
	public static void main (String[] args)
	{
	for(int i=0;i<=1000;i++){
		int result;
		switch(i%3){
			case 0:
				result=i*-5;
				break;
			case 1:
				result=i*7;
				break;
			case 2:
				result=i*2;
				break;
			default:
				result=0;
				break;
		}
		System.out.println(result);
	}
	}
}

