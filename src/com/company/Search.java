package com.company;
import java.io.*;
/**
 * Created by Andrey on 06.08.2015.
 */
public class Search {
    public static Metals[] metals = Metals.createMetals();
    public static  Acid[] Acids = Acid.createAcid();
    public static  Non_metals[] non_metal = Non_metals.createNon_metals();





    public static Metals findeMetals(String input){
        if(input==null)return null;
        for(int i=0;i<metals.length-1; i++){
            if (input.equals(metals[i].itsName)){metals[i].quantity=1; return metals[i];}
        }
        return null;
    }




    public static Acid findeAcid(String input){
       Acid temp= null;
        if(input==null)return null;
        for(int i=0;i<Acids.length; i++) {
            if (input.equals(Acids[i].itsName))temp = Acids[i];
        }

        if (temp!=null){
        int n=0;
        if (input.substring(n, n + 1).equals(non_metal[0].itsName)) {
            temp.Residue =input.substring(n, n + 1) ;
            input= input.replaceAll(input.substring(n, n + 1), "");

        }

        if(input.substring(n,n+1).matches("[-+]?\\d+")){
            temp.quantityReductant=Integer.parseInt(input.substring(n, n + 1));
            input= input.replaceAll(input.substring(n,n+1), "");
        }
        else{
            temp.quantityReductant=1;
        }

        if (input.substring(input.length()-1).matches("[-+]?\\d+"))
        {
            temp.quantityOxidant=Integer.parseInt(input.substring(input.length()-1));
            input=input.replaceAll(input.substring(input.length() - 1), "");
            temp.MetalResidue=input;
        }
        else{
            temp.quantityOxidant=1;
            temp.MetalResidue=input;
        }


        /*System.out.println(temp.Residue);
        System.out.println(temp.quantityReductant);
        System.out.println(temp.MetalResidue);
        System.out.println(temp.quantityOxidant);*/
        return temp;}
        else{return null;}
    }



    public static Non_metals findeNon_metals(String input){
        Non_metals temp = null;
        if(input==null)return null;
        for(int i=0;i<non_metal.length; i++){
            if (input.substring(0, input.length()-1).equals(non_metal[i].itsName))temp=non_metal[i];
        }
        if (input.substring(input.length()-1).matches("[-+]?\\d+")){

            temp.quantityNon_metal=Integer.parseInt(input.substring(input.length()-1));
            return temp;
        }
        return null;
    }

    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
    static int NOK(int a, int b){
        return a / gcd(a,b) * b;
    }
    public static String bild(Metals metal, Acid Acid)
    {   if(metal.itsNumber >0) {
        String out = null;
        String firstElementBefore, secondlementBefore, firstElementAfter, secondElementAfter = null;
        int temp = NOK(metal.itsValence, Acid.itsValence);
        int x1 = temp / metal.itsValence;
        int y1 = temp / Acid.itsValence;
        int A3 = 0;
        if (Acid.itsValence < 3)temp = NOK(y1, Acid.quantityHydrogen);
        else { temp = NOK(Acid.quantityReductant, Acid.quantityHydrogen);}
        A3 = temp / Acid.quantityHydrogen;
        double[][]a=new double[3][4];
        a[0][0]=metal.quantity; a[0][1]=0;  a[0][2]=-x1; a[0][3]=0;
        a[1][0]=0;  a[1][1]=Acid.itsValence;  a[1][2]=0; a[1][3]=-Acid.quantityHydrogen;
        a[2][0]=0;  a[2][1]=Acid.quantityResidue;  a[2][2]=-y1; a[2][3]=0;
        int[] k = Matrix.coefficientsDecision(a,A3);

        firstElementBefore = k[0] + metal.itsName;
        secondlementBefore = k[1] + Acid.itsName;
        if (y1 == 1) firstElementAfter = k[2] + metal.itsName + x1 + Acid.MetalResidue + Acid.quantityOxidant + y1;
        else {
            firstElementAfter = k[2] + metal.itsName + x1 + "(" + Acid.MetalResidue + Acid.quantityOxidant + ")" + y1;
        }
        secondElementAfter = A3 + Acid.Residue + Acid.quantityHydrogen;


        out = firstElementBefore + " + " + secondlementBefore + " = " + firstElementAfter + "+" + secondElementAfter;

        return out.replaceAll("1", "");
    }else {return "it's metal dosen't responds with acid";}
    }
    public static String bild(Metals metal, Non_metals non_metal)
    {
        String out = null;
        String firstElementBefore , secondlementBefore ,firstElementAfter =null;
        if(metal.itsName.equals("Fe")||metal.itsName.equals("Cr"))metal.itsValence=3;

        int temp = NOK(metal.itsValence, non_metal.itsValence);
        int x1 = temp/metal.itsValence;
        int y1 = temp/non_metal.itsValence;
        temp = NOK(y1,non_metal.quantityNon_metal);
        int A2 = temp/y1;

        double[][]a=new double[2][3];
        a[0][0]=metal.quantity; a[0][1]=0;  a[0][2]=-x1;
        a[1][0]=0;  a[1][1]=non_metal.quantityNon_metal;  a[1][2]=-y1;


        int[] k = Matrix.coefficientsDecision(a, A2);



        firstElementBefore=k[0]+metal.itsName;
        secondlementBefore=k[1]+non_metal.itsName+non_metal.quantityNon_metal;
        firstElementAfter = A2+metal.itsName +x1 + non_metal.itsName +y1;




        out=firstElementBefore +"+" + secondlementBefore + "=" + firstElementAfter;

        return out.replaceAll("1","");
    }

}


