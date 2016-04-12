package com.company;

/**
 * Created by Andrey on 01.08.2015.
 */
public class Metals extends Abstract{

    int itsNumber;
    boolean itsDissolved;

    public static Metals[] createMetals(){
        Metals[] arrayMetals = new Metals[55];
        String []nameFirstValence = {"Au","Ag","Rh","H2","Na","Fr","K","Rb","Cs","Li"};
        String []nameSecondValence = {"Pd","Pt","Os","Hg","Ru","Òñ","Po","Cu","Ge","Pb","Sn","Ni","Co","Cd","Fe",
                "Ga","Zn","Cr","V","Mn","Ti","Be","Mg","Ca","Sr","Ba","Ra"};
        String []nameThirdValence = {"Au","Ir","Rh","Tl","Bi","Re","Sb","W","Mo","In","Ga","Cr","V","Nb","Ti","Al","Sc","Y"};
        int number[]={-27,-19,-13,0,31,36,37,38,39,40,-24,-23,-22,-18,-10,-9,-8,-7,-4,1,2,4,6,9,10,11,14,15,19,
                20,25,27,29,32,33,34,35,-26,-25,-16,-15,-6,-5,-3,-1,3,8,12,13,16,18,22,26,28,30,};
        int j = 0;
        for (int i=0; i< 10; i++)
        {
            arrayMetals[i] = new Metals();
            arrayMetals[i].itsName=nameFirstValence[i];
            arrayMetals[i].itsValence=1;
        }
        for (int i = 10; i< 37; i++, j++)
        {
            arrayMetals[i] = new Metals();
            arrayMetals[i].itsName=nameSecondValence[j];
            arrayMetals[i].itsValence=2;
        }
        int k=0;
        for (int i = 37; i< 55; i++, k++)
        {
            arrayMetals[i] = new Metals();
            arrayMetals[i].itsName=nameThirdValence[k];
            arrayMetals[i].itsValence=3;
        }
        for (int i=0; i< number.length; i++)
        {
            arrayMetals[i].itsNumber=number[i];
        }

        return arrayMetals;
    };




}
