import java.util.Scanner;
import java.lang.Math.*;
class VolumeofTheCylinder{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the radius of the Cylinder:");
	  double radius=sc.nextDouble();
	  System.out.println("Enter the height of the Cylinder:");
	  double height=sc.nextDouble();
	  double Volume = Math.PI*Math.pow(radius,2)*height;
	  System.out.println("Volume of The Cylinder of given radius and height is:"+Volume);
	  }
}
	  