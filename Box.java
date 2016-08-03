class Box {
public void cal(int a,int b,double c)
{
	double volume;
	volume=a*b*c;
	System.out.println("volume"+(volume));
}
	public static void main(String[] args) {
		
Box b=new Box();
b.cal(30,40, 8.9);
	}

}
