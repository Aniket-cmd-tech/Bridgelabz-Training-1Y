package com.gla.arrays;
import java.util.*;
public class TransAndPrint {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][2];
        int row=arr.length;
        int cols=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int[][] trans=new int[2][2];
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                trans[i][j]=arr[j][i];
            }
            System.out.println();
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<cols;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
