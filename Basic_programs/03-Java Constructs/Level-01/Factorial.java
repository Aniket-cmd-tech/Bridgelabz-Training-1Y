import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            long fact=1;
            int i=1;
            while(i<=n){
                fact*=i;
                i++;
            }
            System.out.println(fact);
        }else{
            System.out.println("The number "+n+" is not a positive integer");
        }
    }
}
