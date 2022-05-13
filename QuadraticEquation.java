import java.util.*;
public class QuadraticEquation {
	private int a,b,c;
public QuadraticEquation(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
public int getA() {
	return a;
}public int getB() {
	return b;
}
public int getC() {
	return c;
}
public double getDiscriminant()
{
	double d=b * b - 4 * a * c;
	return d;
}
public double getroot1()
{
	if(getDiscriminant()<0)
	{
		return 0;
	}
	else
	{
		 return ( - b + Math.sqrt(getDiscriminant()))/(2*a);
	}
}
public double getroot2()
{
	if(getDiscriminant()<0)
	{
		return 0;
	}
	else
	{
		 return ( - b - Math.sqrt(getDiscriminant()))/(2*a);
	}
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a,b and c");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	QuadraticEquation qe=new QuadraticEquation(a, b, c);
	if(qe.getDiscriminant()<0)
	{
		System.out.println("The equation has no roots");
	}
	else if(qe.getDiscriminant()==0)
	{
		System.out.println("The equation has equal roots: "+qe.getroot1());
	}
	else
	{
		System.out.println("The equation has two distinct real roots:");
		System.out.println(qe.getroot1());
		System.out.println(qe.getroot2());
	}
	sc.close();
	
}


}
