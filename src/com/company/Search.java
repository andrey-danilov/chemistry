package com.company;

import java.util.StringTokenizer;

/**
 * Created by Andrey on 06.08.2015.
 */
public class Search {

    public static Abstract[] search(String a) {
        int i=0;
        int j = 0;
        StringTokenizer st = new StringTokenizer(a," +=");
        Abstract[] metal = Metals.createMetals();
        Abstract[] material = Material.createMaterial();
        Abstract[] beforEqual = new Abstract[st.countTokens()];
        String[] temp= new String[st.countTokens()];

        for(i=0;st.hasMoreElements();i++)
        {
                temp[i] = st.nextToken();
        }

        for (i=0;i<beforEqual.length;i++) {
            for (j = 0; j < metal.length; j++) {
                if (metal[j].itsName.equals(temp[i])) {
                    beforEqual[i] = metal[j];
                }
            }

            for (j = 0; j < material.length; j++) {
                if (material[j].itsName.equals(temp[i])) {
                    beforEqual[i] = material[j];

                }
            }
        }
        /*switch (beforEqual[1].itsName)
        {
            case"H2O": Material.H2O(beforEqual);
        }*/


        return beforEqual;
    }
    /*public static void searchFunction (String Name){

       switch (Name)
       {
           case"H2O": Material.H2O(Search.search(Main.input));
       }



    }
*/
}


