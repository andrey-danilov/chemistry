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
        frame.setSize(500, 300);
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
                Metals tempMetal= Search.findelMetals(firstInput);
                Material tempMaterial=Search.findelMaterial(secondInput);
                Non_metals tempNon_metal=Search.findelNon_metals(secondInput);

                if(tempMaterial!=null)
                {
                    rez.setText(Search.bild(tempMetal, tempMaterial));
                }
                else {
                   //rez.setText(Search.bild(tempMetal,tempNon_metal));
                }



            }
        });


        }
    }

