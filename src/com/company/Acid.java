package com.company;
public class Acid extends Abstract{

    String MetalResidue;
    String Residue;
    int quantityOxidant;
    int quantityReductant;
    int quantityHydrogen=2;
    int quantityResidue=1;

   public static Acid[] createAcid(){
       Acid[] arrayAcid = new Acid[5];
       String[] nameFirstValence = {"HCl","HBr", "HI"};
       String[] nameSecondValence = {"H2CO3"};
       String[] nameThirdValence = {"H3PO4"};


       for (int i=0; i< nameFirstValence.length; i++) {
           arrayAcid[i] = new Acid();
           arrayAcid[i].itsValence=1;
           arrayAcid[i].itsName=nameFirstValence[i];

       }
       for (int i = nameFirstValence.length, j=0 ; i< nameFirstValence.length+nameSecondValence.length ; i++, j++) {
           arrayAcid[i] = new Acid();
           arrayAcid[i].itsValence=2;
           arrayAcid[i].itsName=nameSecondValence[j];
       }
       for (int i = nameFirstValence.length+nameSecondValence.length, j=0 ; i< arrayAcid.length; i++, j++) {
           arrayAcid[i] = new Acid();
           arrayAcid[i].itsValence=3;
           arrayAcid[i].itsName=nameThirdValence[j];
       }

       return arrayAcid;
    }
}
