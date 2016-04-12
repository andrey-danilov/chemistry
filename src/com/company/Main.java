package com.company;

import java.lang.Object;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.io.PrintWriter;




public class Main {
    static Abstract MAINARRAYELEMENTS[];


    static String input = new String("Na+H2O=");

    public static void main(String[] args) {
      // System.out.println("first");
      // Scanner in = new Scanner(System.in);
      // String first = in.nextLine();
      // System.out.println("first = " + first);

     //  System.out.println("second");
      // String second = in.nextLine();
      // System.out.println("second = " + second);

//double[][] a={{1,0,1,0},{0,2,1,2},{0,1,1,0}};

int[] a = {2,1};
        int[] b={1,2,2,2};
        for(int i=0;i<4; i++)
        System.out.println(Material.keof2(a, b)[i]);

    }


}
