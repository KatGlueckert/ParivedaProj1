package com.company;

import javax.swing.*;
import java.awt.*;

public class Player {

    private int tileX;

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }

    private int tileY;


    private Image player;

    public Player(){

        ImageIcon img = new ImageIcon("Player.txt");
        player = img.getImage();

        tileX = 0;
        tileY = 4;
    }

    public Image getPlayer(){
        return player;
    }

    public int getTileX(){
        return tileX;
    }
    public int getTileY(){
        return tileY;
    }

    public void move(int dx, int dy) {


        tileX += dx;
        tileY += dy;


    }
}
