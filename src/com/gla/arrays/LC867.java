package com.gla.arrays;

public class LC867 {
        public int[][] transpose(int[][] matrix) {
            int row=matrix.length;
            int cols=matrix[0].length;
            int[][] res=new int[cols][row];
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    res[j][i]=matrix[i][j];
                }

            }
            return res;
        }
    }




