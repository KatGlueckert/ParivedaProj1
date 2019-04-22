package com.company;

import javax.swing.*;

public class Maze {

    public static void maze() {
        new Maze();

    }

    public static String title = "Maze";
    public static String version = "Alpha 1.0";
    public static int width = 510;
    public static int height = 535;


    public Maze() {
        JPanel frame = new JPanel();
        //frame.setTitle(title + " - " + version);
        frame.add(new Board());
        frame.setSize(width, height);
        //frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
