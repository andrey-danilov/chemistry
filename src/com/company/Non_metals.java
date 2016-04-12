package com.company;

/**
 * Created by Andrey on 02.08.2015.
 */
public class Non_metals extends Abstract {

    int quantityNon_metal=1;
    public static Non_metals[] createNon_metals(){
        Non_metals[] arrayNotmetals = new Non_metals[2];
        String []nameFirstValence = {"H"};
        String []nameSecondValence = {"O"};


        int j = 0;
        for (int i=0; i< 1; i++)
        {
            arrayNotmetals[i] = new Non_metals();
            arrayNotmetals[i].itsName=nameFirstValence[i];
            arrayNotmetals[i].itsValence=1;
        }
        for (int i = 1; i< 2; i++, j++)
        {
            arrayNotmetals[i] = new Non_metals();
            arrayNotmetals[i].itsName=nameSecondValence[j];
            arrayNotmetals[i].itsValence=2;
        }


        return arrayNotmetals;
    };
}
