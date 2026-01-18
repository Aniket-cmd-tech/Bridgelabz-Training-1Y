import java.util.Scanner;
class SimpleInterest{
     public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Principal of the amount:");
	 double Principal=sc.nextDouble();
	 System.out.println("Enter the rate of the interest:");
	 double Rate=sc.nextDouble();
	 System.out.println("Enter the time period of the interest:");
	 double Time=sc.nextDouble();
     double SI=(Principal*Rate*Time)/100;
	 System.out.println("The Simple Interest of the given details is:"+SI);
	 }
}