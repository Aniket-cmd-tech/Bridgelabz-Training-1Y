import java.util.Scanner;
class DistanceConverter{
      public static void main(String args[]){
	  Scanner sc=new Scanner(System.in);
	  double distanceinfeet=sc.nextDouble();
	  double distanceinyards=distanceinfeet/3;
	  double distanceinMiles=distanceinyards/1760;
	  System.out.println("The distance in feet is "+distanceinfeet+" and distance in yards is "+distanceinyards+" and distance in Miles is "+distanceinMiles);
	  }
}