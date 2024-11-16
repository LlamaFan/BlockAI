package com.test.GUI;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private final int size = 500;
    private final int squares = 9;
    private final int length = size / squares;

    public int[][] field;

    public DisplayPanel() {
        setPreferredSize(new Dimension(size, size));
        setBackground(Color.BLACK);
    }

    // Repaints the GUI

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g.setColor(Color.darkGray);
        drawLine(g);
        g.dispose();
    }

    private void drawLine(Graphics g) {
        for (int i = 0; i < squares; i++) {
            g.drawLine(i * length, 0, i * length, size);
            g.drawLine(0, i * length, size, i * length);
        }
    }

    // This will set the blocks on the field

    public int setForm() {


        return 0;
    }

    private boolean checkField() {


        return true;
    }
}
