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
        frame.setSize(700, 300);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton craete = new JButton("craete");
        Label rez = new Label();

        JTextField first = new JTextField(5);
        JTextField second = new JTextField(10);
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

                Metals tempMetal= Search.findeMetals(firstInput);
                Non_metals tempNon_metal = null;
                Acid  tempAcid= null;

                if(Search.findeAcid(secondInput)!=null){
                    tempAcid= Search.findeAcid(secondInput);
                    rez.setText(Search.bild(tempMetal, tempAcid));
                }
                else{
                    tempNon_metal=Search.findeNon_metals(secondInput);
                    rez.setText(Search.bild(tempMetal,tempNon_metal));
                }


                /*Metals[] met = Metals.createMetals();
                Non_metals[] non =Non_metals.createNon_metals();
                Acid[] ac=Acid.createAcid();
                for(int i=0; i<ac.length; i++){
                    for (int j=0; j<met.length ; j++){
                        System.out.println(met[j].itsName+ " + "+ ac[i].itsName+ "-> "+ Search.bild(met[j], Search.findeAcid(ac[i].itsName)));
                    }
                }
                for(int i=0; i<non.length; i++){
                    for (int j=0; j<met.length ; j++){
                        System.out.println(met[j].itsName+ " + "+ non[i].itsName+ "-> "+ Search.bild(met[j], Search.findeNon_metals(non[i].itsName+2)));
                    }
                }*/

            }
        });


        }
    }

