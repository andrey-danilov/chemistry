package com.company;


/**
 * Created by Andrey on 02.08.2015.
 */
public class Element {
        String[] arrayName;
        int[] arrayQuality;

    static public Metals findMetals(String a)
    {
       for(int i=0;i<Metals.createMetals().length; i++)
        {
            if (a.equals(Metals.createMetals()[i].itsName))
            {
                return Metals.createMetals()[i];
            }
        }

        return null;
    }

    static public Element findMaterial(String a)
    {   String[] arrayTemt=a.split("");
        Element temp = null;
        for(int i=0;i<Metals.createMetals().length; i++)
        {
            for(int j=0; j<Notmetals.createNotmetals().length; j++)
            {

                if (arrayTemt[i] == Notmetals.createNotmetals()[i].itsName)
                    temp.arrayName[i] = Notmetals.createNotmetals()[i].itsName;

            }
        }

        return temp;
    }
}









