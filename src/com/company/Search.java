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
        for(int i=0;i<metals.length-1; i++){
            if (input.equals(metals[i].itsName)) return metals[i];
        }
        return null;
    }




    public static Acid findeAcid(String input){
       Acid temp= null;
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
        for(int i=0;i<non_metal.length; i++){
            if (input.substring(0, input.length()-1).equals(non_metal[i].itsName)){
                temp=non_metal[i];
            }
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
    {
        String out = null;
        String before = null;
        String after = null;
        String firstElementBefore , secondlementBefore ,firstElementAfter ,secondElementAfter  =null;
        int temp = NOK(metal.itsValence, Acid.itsValence);
        int x1 = temp/metal.itsValence;
        int y1 = temp/Acid.itsValence;
        int A1=0;
        int A2=0;
        int A3=0;
        int A0=0;
        if (Acid.itsValence<2){
            temp = NOK(y1,Acid.quantityResidue);
            A1 = temp/Acid.quantityReductant;
            A2 = temp/y1/x1;
            A3 = temp/Acid.quantityResidue;
            A0 = A2*x1;
        }
        else {
            temp = NOK(Acid.quantityReductant,Acid.quantityResidue);
            A1 = temp/Acid.quantityReductant;
            A2 = temp/x1/Acid.quantityReductant;
            A3 = temp/Acid.quantityResidue;
            A0 = A2*x1;
        }

        firstElementBefore=A0+metal.itsName;
        secondlementBefore= A1+Acid.itsName;
        if(y1==1)firstElementAfter =A2+metal.itsName +x1 + Acid.MetalResidue + Acid.quantityOxidant +y1;
        else{firstElementAfter =A2+metal.itsName +x1 +"("+Acid.MetalResidue + Acid.quantityOxidant+")" +y1;}
        secondElementAfter =A3+Acid.Residue + Acid.quantityResidue;



        out=firstElementBefore +" + "+secondlementBefore + " = " + firstElementAfter + "+" + secondElementAfter;

        return out.replaceAll("1","");
    }
    public static String bild(Metals metal, Non_metals non_metal)
    {
        String out = null;
        String before = null;
        String after = null;

        String firstElementBefore , secondlementBefore ,firstElementAfter =null;


        int temp = NOK(metal.itsValence, non_metal.itsValence);
        int x1 = temp/metal.itsValence;
        int y1 = temp/non_metal.itsValence;
        temp = NOK(y1,non_metal.quantityNon_metal);
        int A1 = temp/non_metal.quantityNon_metal;
        int A2 = temp/y1;
        int A0 = A2*x1;

        firstElementBefore=A0+metal.itsName;
        secondlementBefore=A1+non_metal.itsName+non_metal.quantityNon_metal;
        firstElementAfter = A2+metal.itsName +x1 + non_metal.itsName +y1;




        out=firstElementBefore +"+" + secondlementBefore + "=" + firstElementAfter;

        return out.replaceAll("1","");
    }

}


