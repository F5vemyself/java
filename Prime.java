package lsc.prime.number;

public class Prime {

	public void ifPrime(int m) {
		int i,j;
		for(j=2;j<=m;j++)
		{
			for(i=2;i<=j;i++)
			{
				if(j%i==0)
					break;
			}
			if(i<j)
				System.out.println(j+"��������");
			else
				System.out.println(j+"������");
		}
		
		
	}
	public static void main(String[] args) {
		Prime p=new Prime();
		p.ifPrime(5);
	}
}
