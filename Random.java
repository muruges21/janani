public class Random {
	public static int randint(int x,int y){

		return (int)(Math.random()*(y-x)+1)+x;
		
	}
	public static double randdouble(int x,int y){
		return Math.random()*(y-x)+x;
	}


	public static void main(String[] args) {
 
       System.out.println(Random.randint(1, 10));
       System.out.println(Random.randdouble(1, 10));

	}

}
