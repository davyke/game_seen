import java.util.*;
public class Average {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double[] array =new double[10];
		//take user input of 10 double values
		for(int i=0;i<10;i++)
		{
			double a=sc.nextDouble();
			array[i]=a;
		}
		sc.close();
		System.out.println(average(array));
	}
	public static int average(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		int avg=(sum/array.length);
		return avg;
	}
	public static double average(double[] array)
	{
		double sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum+=array[i];
		}
		double avg=(sum/array.length);
		return avg;
	}
}
