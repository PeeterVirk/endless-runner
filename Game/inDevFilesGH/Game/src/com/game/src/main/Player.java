package com.game.src.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {

    //private int animationFrameAmmount = 2;

    private double x;
    private double y;
    private double g = 9.8;
    private double yMom = 0.0;
    private double gLev = 224.0;

    //private boolean crouched = false;

    private BufferedImage playerA1;
    //private BufferedImage playerA2;

    public Player(double x, double y, Game game) {

        this.x = x;
        this.y = y;

        SpriteSheet ss = new SpriteSheet(game.getSpriteSheet());

        playerA1 = ss.grabImage(1, 1, 64, 64);
        //playerA2 = ss.grabImage(2, 1, 64, 64);

    }

    public void tick() {
        y = y - yMom;
        if (yMom > 0) {
            yMom = yMom - g / 60;
            if (x > gLev) {
                yMom = 0;
                x = gLev;
            }
        }
    }

    public void render(Graphics g) {
        g.drawImage(playerA1, (int) x, (int) y, null);

    }


    public void Jump() {

        //	xMom = 10;

    }

    public void CroutchS() {

        //	Crouched = true;

    }

    public void CroutchE() {

        //	Crouched = false;

    }

    public void setYMom(double YMom) {
        this.yMom = YMom;
    }
}