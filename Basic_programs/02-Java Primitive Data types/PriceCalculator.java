import java.util.Scanner;
class PriceCalculator{
     public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 double unitPrice=sc.nextDouble();
	 int quantity=sc.nextInt();//In Kg
	 double Price=unitPrice*quantity;
	 System.out.println("The total purchase price is INR "+Price+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	 }
}