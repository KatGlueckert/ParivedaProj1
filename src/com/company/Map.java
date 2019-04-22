package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Map {

    private Scanner m;

    private String Map[] = new String[25];

    private Image grass, wall, finish;

    public Map(String mapName){

        ImageIcon img = new ImageIcon("grass.png");
        grass = img.getImage();
        img = new ImageIcon("wall.png");
        wall = img.getImage();
        img = new ImageIcon("Finish.png");
        finish = img.getImage();

        openFile(mapName);
        readFile();
        closeFile();
    }

    public Image getGrass(){
        return grass;
    }
    public Image getWall(){
        return wall;
    }
    public Image getFinish() {return finish;}

    public String getMap(int x, int y){
        String index = Map[y].substring(x, x + 1);
        return index;
    }

    public void openFile(String mapName){
        try {
            m = new Scanner(new File(mapName));
        }
        catch(Exception e){
            System.out.println("error loading map");
        }
    }
    public void readFile(){
        while (m.hasNext()){
            for (int i =0; i < 25; i++){
                Map[i] = m.next();
            }
        }
    }

    public static String getNewMap() {
        String mapName = "MapTwo.txt";
        return mapName;
    }

    public void closeFile(){
        m.close();
    }


}
