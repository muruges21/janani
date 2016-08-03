class RepNo
{
	long[] regNo = new long[10];
	public void findRep(long[] regNo)
	{
		this.regNo = regNo;
		int len = regNo.length;
		for(int i = 0;i<regNo.length;i++)
		{
			for(int j = i+1;j<len;j++)
			{
				if(j == len-1)
				{
					j--;
					
				}
				if(regNo[i] == regNo[j])
				{
					regNo[j] = regNo[j+1];
				}
			}
		}
		System.out.println(regNo);
	}
}
public class FindRep {

	public static void main(String[] args) {
		RepNo r = new RepNo();
		long a[] = {1,2,1,2,4,1,3};
		r.findRep(a);
	}

}
