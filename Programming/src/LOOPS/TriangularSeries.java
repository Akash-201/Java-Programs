package LOOPS;

public class TriangularSeries 
{
public static void print(int n)
{
	int x=1;
	int d=2;
	for(int i=1;i<=n;i++)
	{
		System.out.print(x+" ");
		x=x+d;
		d++;
	}
}
public static void main(String[] args)
{
	print(10);
}
	

}
