package com.test.GUI;

import javax.swing.*;

public class Window extends JFrame {
    private DisplayPanel dp;

    public Window(DisplayPanel dp) {
        this.dp = dp;

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Terrain Generation");
        setResizable(false);

        add(dp);
        pack();

        setVisible(true);

        this.dp.repaint();
    }
}
