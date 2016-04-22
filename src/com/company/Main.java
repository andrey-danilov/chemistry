package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Object;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.io.PrintWriter;
import java.io.*;
import javax.swing.*;




public class Main {


    public static void main(String[] args) {

        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        JButton craete = new JButton("craete");
        Label rez = new Label();
        rez.setSize(200,50);
        rez.setLocation(40,50);
        craete.setSize(80,30);
        craete.setLocation(280,10);
        JTextField first = new JTextField(5);
        first.setSize(80,30);
        first.setLocation(40,10);
        JTextField second = new JTextField(10);
        second.setSize(80,30);
        second.setLocation(160,10);
        panel.add(first);
        panel.add(second);
        panel.add(craete);
        panel.add(rez);

        frame.getContentPane().add(panel);

        frame.setVisible(true);

        craete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstInput = first.getText();
                String secondInput = second.getText();

<<<<<<< HEAD
                Metals tempMetal= null;
=======
                Metals tempMetal= Search.findeMetals(firstInput);
>>>>>>> origin/master
                Non_metals tempNon_metal = null;
                Acid  tempAcid= null;
                if(tempMetal==null && tempNon_metal==null || tempAcid==null)rez.setText("You have entered incorrect data");
                else{
                    tempMetal=Search.findeMetals(firstInput);
                    if(Search.findeAcid(secondInput)!=null){
                        tempAcid= Search.findeAcid(secondInput);
                        rez.setText(Search.bild(tempMetal, tempAcid));
                    }
                    else{
                        tempNon_metal=Search.findeNon_metals(secondInput);
                        rez.setText(Search.bild(tempMetal,tempNon_metal));
                    }}


                /*Metals[] met = Metals.createMetals();
                Non_metals[] non =Non_metals.createNon_metals();
                Acid[] ac=Acid.createAcid();
                for(int i=0; i<ac.length; i++){
                    for (int j=0; j<met.length ; j++){
                        System.out.println(met[j].itsName+ " + "+ ac[i].itsName+ "-> "+ Search.bild(met[j], Search.findeAcid(ac[i].itsName)));
                    }
                }
<<<<<<< HEAD
=======


                /*Metals[] met = Metals.createMetals();
                Non_metals[] non =Non_metals.createNon_metals();
                Acid[] ac=Acid.createAcid();
                for(int i=0; i<ac.length; i++){
                    for (int j=0; j<met.length ; j++){
                        System.out.println(met[j].itsName+ " + "+ ac[i].itsName+ "-> "+ Search.bild(met[j], Search.findeAcid(ac[i].itsName)));
                    }
                }
>>>>>>> origin/master
                for(int i=0; i<non.length; i++){
                    for (int j=0; j<met.length ; j++){
                        System.out.println(met[j].itsName+ " + "+ non[i].itsName+ "-> "+ Search.bild(met[j], Search.findeNon_metals(non[i].itsName+2)));
                    }
                }*/

            }
        });


    }
}

