package com.company;
public class Material extends Abstract{

    String MetalResidue;
    String Residue;
    int quantityOxidant;
    int quantityReductant;
    int quantityResidue = 2;

   public static Material[] createMaterial(){
       Material[] arrayMaterial = new Material[2];
       String[] nameFirstValence = {"HCl"};
       String[] nameSecondValence = {"H2O"};
       String[] namesMetalResidue={"Cl", "OH"};

       int[] quantitiesOxidant={1,1};
       int[] quantitiesReductant={1,2};

       int j = 0;
       for (int i=0; i< nameFirstValence.length; i++) {
           arrayMaterial[i] = new Material();
           arrayMaterial[i].itsValence=1;
           arrayMaterial[i].itsName=nameFirstValence[i];

       }
       for (int i = 1 ; i< nameSecondValence.length; i++, j++) {
           arrayMaterial[i] = new Material();
           arrayMaterial[i].itsValence=2;
           arrayMaterial[i].itsName=nameSecondValence[j];
       }
       for (int i = 0 ; i< 1; i++) { //Ќ”жно поставить величину
           arrayMaterial[i].MetalResidue = namesMetalResidue[i];
           arrayMaterial[i].quantityOxidant=quantitiesOxidant[i];
           arrayMaterial[i].quantityReductant=quantitiesReductant[i];
       }

       return arrayMaterial;
    }
}
