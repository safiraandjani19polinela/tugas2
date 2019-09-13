package com.enigma.model;

import java.util.Arrays;

public class Mobil {


    private Integer postX;
    private Integer postY;
    private Integer fuel = 0;
    private String FORWARD = "F";
    private String RIGHT = "R";
    private String LEFT= "L";
    private String BACKWARD = "B";
    private char[] commands;

    public Mobil(Integer x, Integer y) {
        this.postX = x;
        this.postY = y;
    }



    public void fillFuel(int fuel) {
        this.fuel = this.fuel + fuel;
    }

    public void move(String movement) {
        if (movement.equals(RIGHT)) {
            this.postX++;
        } else if (movement.equals(LEFT)) {
            this.postX--;
        } else if (movement.equals(FORWARD)) {
            this.postY++;
        } else if (movement.equals(BACKWARD)) {
            this.postY--;
        }
    }
        public void setCommands(String commands){
        this.commands= commands.toCharArray();
    }

        public String getPositions() {
        return "(" + postX + "," + postY +" )";
    }

    public void run() {
         for (int i = 0; i < this.commands.length; i++) {
             if(fuel==0){
                 System.out.println("bensin abis");
                 break;
             }
            move(String.valueOf(this.commands[i]));
             System.out.println(this.commands[i] + getPositions());
            if((i+1) % 3 == 0){
                fuel--;
            }
         }
    }

                public String print(){
                 return "Mobil{" +
                "postX=" + postX +
                ", postY=" + postY +
                ", fuel=" + fuel +
                ", commands=" + Arrays.toString(commands) +
                '}';
    }
}














