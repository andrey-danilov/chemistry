package com.company;
import java.io.*;
/**
 * Created by Andrey on 06.08.2015.
 */
public class Search {
    public static Metals[] metals = Metals.createMetals();
    public static  Material[] materials = Material.createMaterial();
    public static  Non_metals[] non_metal = Non_metals.createNon_metals();





    public static Metals findelMetals(String input){
        for(int i=0;i<metals.length-1; i++){
            if (input.equals(metals[i].itsName)) return metals[i];
        }
        return null;
    }




    public static Material findelMaterial(String input){
        for(int i=0;i<materials.length-1; i++){
            if (input.equals(materials[i].itsName))return materials[i];
        }
        return null;
    }



    public static Non_metals findelNon_metals(String input){

        for(int i=0;i<non_metal.length-1; i++){
            if (input.substring(0, input.length()-1).equals(non_metal[i].itsName)){
                if (input.substring(input.length()-1).matches("[-+]?\\d+")){
                    non_metal[i].quantityNon_metal=Integer.parseInt(input.substring(input.length()-1));
                    return non_metal[i];
                }
            }
        }
        return null;
    };
    public static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a % b);
    }
    static int NOK(int a, int b){
        return a / gcd(a,b) * b;
    }
    public static String bild(Metals metal, Material material)
    {
        String out = null;
        String before = null;
        String after = null;

        int temp = NOK(metal.itsValence, material.itsValence);
        int x1 = temp/metal.itsValence;
        int y1 = temp/material.itsValence;
        int A1 = temp = NOK(y1,material.quantityResidue);
        int A2 = temp/y1;
        int A3 = temp/material.quantityResidue;
        int A0 = A2*x1;

        before=A0+metal.itsName+" + "+A1+material.itsName+" = ";
        after=A2+metal.itsName +x1 + material.MetalResidue +y1 +"+" +A3+
                material.Residue + material.quantityResidue;

        out=before+after;

        return out.replaceAll("1","");
    }
    public static String bild(Metals metal, Non_metals non_metal)
    {
        String out = null;
        String before = null;
        String after = null;

        int temp = NOK(metal.itsValence, non_metal.itsValence);
        int x1 = temp/metal.itsValence;
        int y1 = temp/non_metal.itsValence;
        int A1 = temp = NOK(y1,non_metal.quantityNon_metal);
        int A2 = temp/y1;
        int A0 = A2*x1;

        before=A0+metal.itsName+" + "+A1+non_metal.itsName+" = ";
        after=A2+metal.itsName +x1 + non_metal.itsName +y1;

        out=before+after;

        return out;
    }

}


