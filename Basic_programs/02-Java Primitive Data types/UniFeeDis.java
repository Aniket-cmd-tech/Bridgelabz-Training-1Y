class UniFeeDis{
     public static void main(String args[]){
	 int fee=125000;
	 int discountPercent=10;
	 int discountAmount=fee/discountPercent;
	 int FinalPrice=fee-discountAmount;
	 System.out.println("The discount amount is INR"+discountAmount+" and final discounted fee is INR "+FinalPrice);
	 }
}