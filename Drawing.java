package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Drawing extends JFrame{
    private ArrayList<Drawable> drawables = new ArrayList<Drawable>();

    public Drawing()
    {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
        this.add(new DrawingPanel());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void addDrawable(Drawable d)
    {
        drawables.add(d);
    }

    private class DrawingPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            for (Drawable d: drawables)
            {
                try {
                    d.draw(g2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
