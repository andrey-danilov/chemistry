package com.company;

/**
 * Created by Andrey on 02.08.2015.
 */
public class Non_metals extends Abstract {

    int quantityNon_metal;
    public static Non_metals[] createNon_metals(){
        Non_metals[] arrayNotmetals = new Non_metals[8];
        String []nameFirstValence = {"H","Cl" , "Br" , "I","F"};
        String []nameSecondValence = {"O","S"};
        String []nameThirdValence = {"N"};



        for (int i=0; i< nameFirstValence.length; i++)
        {
            arrayNotmetals[i] = new Non_metals();
            arrayNotmetals[i].itsName=nameFirstValence[i];
            arrayNotmetals[i].itsValence=1;
        }
        for (int i = nameFirstValence.length, j=0; i< nameFirstValence.length+nameSecondValence.length; i++, j++)
        {
            arrayNotmetals[i] = new Non_metals();
            arrayNotmetals[i].itsName=nameSecondValence[j];
            arrayNotmetals[i].itsValence=2;
        }
        for (int i = nameFirstValence.length+nameSecondValence.length,j=0; i< arrayNotmetals.length; i++, j++)
        {
            arrayNotmetals[i] = new Non_metals();
            arrayNotmetals[i].itsName=nameThirdValence[j];
            arrayNotmetals[i].itsValence=3;
        }
        return arrayNotmetals;
    };
}
