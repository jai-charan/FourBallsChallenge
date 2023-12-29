package org.example;

import processing.core.PApplet;

public class Processing extends PApplet{
    public static void main(String[] args) {
        PApplet.main("org.example.Processing",args);
    }
    Ball ball1,ball2,ball3,ball4;
    @Override
    public void settings() {
        size(640,480);
    }

    @Override
    public void setup() {
        ball1=new Ball(1,1,10);
        ball2=new Ball(2,2,10);
        ball3=new Ball(3,3,10);
        ball4=new Ball(4,4,10);
    }

    @Override
    public void draw() {
        ball1.drawCircle();
        ball2.drawCircle();
        ball3.drawCircle();
        ball4.drawCircle();

        ball1.moveCircle();
        ball2.moveCircle();
        ball3.moveCircle();
        ball4.moveCircle();

    }

    class Ball{
        int speed;
        int diameter;
        int xAxis, yAxis;

        public Ball(int speed, int heightMultiplier, int diameter){
            this.speed=speed;
            this.xAxis =0;
            this.yAxis =(heightMultiplier*height)/5;
            this.diameter=diameter;
        }

        public void drawCircle(){
            ellipse(xAxis, yAxis,diameter,diameter);
        }
        public void moveCircle(){
            xAxis +=speed;
        }

    }
}