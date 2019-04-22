package com.company;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {
    private JFrame mainFrame;
    private JPanel firstView;
    private Board secondView;
    private JButton showSecViewBtn;
    private JButton showFirstViewBtn;
    private JTextField playerName;
    private JLabel instructLbl;
    private JLabel petPicLbl;

    public Main() {
        configureGui();
    }

    public static void main(String[] args) {
        Main mainFrame = new Main();
    }

    public void configureGui() {
        mainFrame = new JFrame();
        mainFrame.setBounds(900, 100, 900, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        firstView = new JPanel();
        firstView.setLayout(new GridLayout(0, 2, 2, 2));


        instructLbl = new JLabel("Please enter your name for the leaderboard!");
        firstView.add(instructLbl);

        playerName = new JTextField();
        firstView.add(playerName);
        firstView.setVisible(true);

        secondView = new Board();
        secondView.setLayout(new GridLayout(0, 2, 2, 2));
        secondView.setVisible(false);


        showFirstViewBtn = new JButton("Move to the next level");
        showFirstViewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                secondView.setVisible(false);
                mainFrame.setSize(900, 200);
                firstView.setVisible(true);

            }
        });

        showSecViewBtn = new JButton("Click here to start the game!");
        showSecViewBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstView.setVisible(false);
                configureSecView(playerName.getText());
                secondView.setVisible(true);
            }
        });
        firstView.add(showSecViewBtn);
        firstView.setSize(900, 100);
        firstView.setPreferredSize(
                new Dimension(firstView.getPreferredSize().width, firstView.getPreferredSize().height));

        firstView.setVisible(true);
        mainFrame.add(firstView);
        mainFrame.add(secondView);
        mainFrame.setVisible(true);
    }

    public void configureSecView(String playerName) {


       // Maze.maze();


        String title = "Maze";
        String version = "Level 1";
        int width = 510;
        int height = 535;
        //JPanel frame = new JPanel();
        secondView.setVisible(false);
        secondView.setSize(width, height);
        //secondView.add(showFirstViewBtn);
        secondView.setSize(1000,500);
        mainFrame.setSize(1000,500);
    }

    }



