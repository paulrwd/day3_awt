package com.paul;

import java.awt.*;
import java.awt.event.*;



public class Day3_awt extends Frame {
    class MyMouse extends MouseAdapter {
        int x0, y0;
        public void mousePressed(MouseEvent e) {
            x0=e.getX();
            y0 = e.getY();
        }

        public void mouseDragged(MouseEvent e) {
            int x1 = e.getX(), y1 = e.getY();
            getGraphics().drawLine(x0, y0, x1, y1);
        }
    }
    public Day3_awt(){

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
        MyMouse mm = new MyMouse();
        addMouseListener(mm);
        addMouseMotionListener(mm);

        setSize(700,600);
        setTitle("Paint");
        setVisible(true);
    }
    public static void main(String[] args) {
        new Day3_awt();

    }
}
