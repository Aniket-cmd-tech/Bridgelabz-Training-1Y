import java.util.Scanner;
class UniFeeScan{
     public static void main(String args[]){
	 Scanner sc=new Scanner(System.in);
	 int fee=sc.nextInt();
	 int discountPercent=sc.nextInt();
	 int discountAmount=fee/discountPercent;
	 int FinalPrice=fee-discountAmount;
	 System.out.println("The discount amount is INR"+discountAmount+" and final discounted fee is INR "+FinalPrice);
	 }
}