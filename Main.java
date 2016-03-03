package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        int x = 100;
        int y = 100;
        int lineLength = 50;
        String type = "F";

        Drawing drawing = new Drawing();
        drawing.addDrawable(new Drawable() {
            @Override
            public void draw(Graphics2D graphics2D) throws InterruptedException {
                if (type == "F"){
                    graphics2D.drawLine(x,y,x,y-lineLength);
                    y -= lineLength;
                }
            }
        });
    }
}