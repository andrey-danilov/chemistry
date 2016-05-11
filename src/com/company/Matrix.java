package com.company;

/**
 * Created by Andrey on 11.05.2016.
 */
public class Matrix {
    public static int[] coefficientsDecision(double[][] a, int koef){
        double x[]=new double[a.length];
        for (int i = 0; i < x.length; i++) {
            x[i] = a[i][a[i].length - 1];
        }
        double m;
        for (int k = 1; k < a.length; k++) {
            for (int j = k; j < a.length; j++) {
                m = a[j][k - 1] / a[k - 1][k - 1];
                for (int i = 0; i < a[j].length; i++) {
                    a[j][i] = a[j][i] - m * a[k - 1][i];
                }
                x[j] = x[j] - m * x[k - 1];
            }
        }
        for (int i=a.length-1;i>=0;i--) {
            for (int j=i+1;j<a.length;j++) x[i]-=a[i][j]*x[j];
            x[i] = x[i] / a[i][i];
        }

        int[]  K = new int[x.length];
        for(int i=0; i<x.length; i++) K[i]=(int) Math.abs(x[i]* koef);
        return K;
    }
}
