import java.util.Scanner;

class NaturalSumCompare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0){
            int SumLoop=0;
            int i=1;
            while(i<=n){
                SumLoop+=i;
                i++;
            }
            int SumFormula=n*(n+1)/2;
            System.out.println("Sum using while loop: "+SumLoop);
            System.out.println("Sum using formula: "+SumFormula);
            System.out.println("Both computations are correct? "+(SumLoop==SumFormula));
        }else{
            System.out.println("The number "+n+" is not a natural number");
        }
    }
}
