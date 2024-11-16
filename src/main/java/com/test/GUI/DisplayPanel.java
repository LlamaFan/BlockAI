package com.test.GUI;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private final int size = 500;
    private final int squares = 9;
    private final int length = size / squares;

    public int[][] field;

    public DisplayPanel() {
        field = new int[squares][squares];

        setPreferredSize(new Dimension(size, size));
        setBackground(Color.BLACK);
    }

    // Repaints the GUI

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < squares; i++)
            for (int j = 0; j < squares; j++) {
                if (field[i][j] == 0) {
                    g2.setColor(Color.black);
                } else {
                    g2.setColor(Color.white);
                }

                g2.fillRect(i * length, j * length, length, length);
            }

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

    public int setForm(int[][] block, int x, int y) {
        int score = 0;

        for (int i = 0; i < block.length; i++)
            for (int j = 0; j < block[i].length; j++) {
                if (x + i < squares && y + j < squares) {
                    if (field[i + x][j + y] == 0) {
                        if (block[i][j] != 0) field[j + x][i + y] = 1; // I always forget which way arrays are aligned, so this may is weird
                        score++;
                    } else return -2;
                } else return -1;
            }

        return score;
    }

    // Checks if a row is being cleared

    public int checkRows() {
        for (int i = 0; i < squares; i++) {
            for (int j = 0; j < squares; j++) {
                if (field[i][j] == 0) break;
            }
        }

        return 0;
    }
}