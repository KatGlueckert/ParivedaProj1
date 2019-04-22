package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


    public class Board extends JPanel implements ActionListener {

        private Timer timer;
        private Map m;
        private Player p;
        private String Message = " ";



        public Board() {

            String mapName = "MapOne.txt";
            m = new Map(mapName);

            p = new Player();

            addKeyListener(new Al());
            setFocusable(true);

            timer = new Timer(25, this);
            timer.start();
        }


        public void actionPerformed(ActionEvent f){
            if (m.getMap(p.getTileX(), p.getTileY()).equals("f")){
                //Player.movePlayer();
                //Map.getNewMap();
                //new Maze();
            }
            repaint();
        }

        public void paint(Graphics g) {
            super.paint(g);
            for (int y = 0; y < 25; y++){
                for (int x = 0; x < 25; x++){
                    if (m.getMap(x,y).equals("f")) {
                        g.drawImage(m.getFinish(), x * 20, y * 20, null);
                    }

                    if (m.getMap(x, y).equals("g")){
                        g.drawImage(m.getGrass(), x * 20, y *20, null);
                    }
                    if (m.getMap(x, y).equals("w")){
                        g.drawImage(m.getWall(), x * 20, y *20, null);
                    }
                }
            }
            g.drawImage(p.getPlayer(), p.getTileX() * 20, p.getTileY() * 20, null);
            g.drawString(Message, 50,50);
        }

        public class Al extends KeyAdapter {
            public void keyPressed(KeyEvent f){
                int keycode = f.getKeyCode();

                if (keycode == KeyEvent.VK_W){
                    if (!m.getMap(p.getTileX(), p.getTileY()-1).equals("w")) {
                        p.move(0, -1);
                    }
                }
                if (keycode == KeyEvent.VK_S){
                    if (!m.getMap(p.getTileX(), p.getTileY()+ 1).equals("w")) {
                        p.move(0, 1);
                    }
                }
                if (keycode == KeyEvent.VK_A){
                    if (!m.getMap(p.getTileX() - 1, p.getTileY()).equals("w")) {
                        p.move(-1, 0);
                    }
                }
                if (keycode == KeyEvent.VK_D){
                    if (!m.getMap(p.getTileX() + 1, p.getTileY()).equals("w")) {
                        p.move(1, 0);
                    }
                }
            }


            public void keyReleased(KeyEvent f){
                int keycode = f.getKeyCode();
            }
            public void keyTyped(KeyEvent f){

            }
        }

    }


