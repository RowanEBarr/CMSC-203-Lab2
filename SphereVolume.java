import java.util.Scanner;

public class SphereVolume 
{
	public static void main (String [] args) 
	{
		double diam;
		double radius;
		double volume;
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("Sphere Volume Calculator\n\n");
		
		System.out.println("Enter the diameter of the sphere: ");
		
		diam = stdin.nextDouble();
		radius = diam/2;
		
		volume = 4.0/3 * (Math.pow(radius, 3)) * Math.PI;
		System.out.println("The volume of the sphere is " + volume);
	}
}
