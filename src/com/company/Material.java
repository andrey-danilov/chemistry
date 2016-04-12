package com.company;

/**
 * Created by Andrey on 02.08.2015.
 */
public class Material extends Abstract{



   public static Material[] createMaterial(){
        Material[] arrayMaterial = new Material[3];
        String []nameFirstValence = {"H2"};
        String []nameSecondValence = {"O2", "H2O" , "OH"};

        int j = 0;
        for (int i=0; i< 1; i++)
        {
            arrayMaterial[i] = new Material();
            arrayMaterial[i].itsValence=1;
            arrayMaterial[i].itsName=nameFirstValence[i];
        }
        for (int i = 1 ; i< 3; i++, j++)
        {
            arrayMaterial[i] = new Material();
            arrayMaterial[i].itsValence=2;
            arrayMaterial[i].itsName=nameSecondValence[j];
        }

        return arrayMaterial;
    };
    static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }

    static int NOK(int a, int b){
        return a / gcd(a,b) * b;
    }

    static String O2(Metals metals, Material material)
    {
        String out = null;
        String before = null;
        String after = null;

        int k[]=new int[]{1,2,1,1};
        //int[] keof= keof2(metals, material, k);

        before=metals.itsName+" + "+material.itsName+" = ";
        after=metals.itsName+"O";

        out=before+after;

        return out;
    }


    static String H2O(Abstract[] beforEqual)
    {
        String out = null;
        String before = null;
        String after = null;


        double[] b= {0,0,0};
        double[] keof=b;

        before=keof[0]+beforEqual[0].itsName+" + "+keof[1]+beforEqual[0].itsName+" = ";
        after=keof[2]+beforEqual[0].itsName+"OH" + " + H2";

        out=before+after;

        return out;
    }




    static  int[] keof2(int[] beforEqual , int[] kol)
    {
        int temp=0;

        temp = NOK(beforEqual[1] , beforEqual[0]);
        int a=temp/beforEqual[0];
        int b=temp/beforEqual[1];
        int c=NOK(b, kol[1])/b;

        int A = (c*a)/kol[0];
        int B= (c*b+kol[3])/kol[1];

        int [] mass = new int[]{A, B, c, a, b};
        return mass;
    }



}
