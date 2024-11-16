package com.test.Game;

import com.test.GUI.DisplayPanel;

public class Game implements Runnable {
    private DisplayPanel dp;
    private boolean running;

    public Game(DisplayPanel dp) {
        this.dp = dp;
    }

    @Override
    public void run() {
        double lastTime = System.currentTimeMillis();
        int ticks = 1; // Runs this often per second

        running = true;

        while (running) {
            if (System.currentTimeMillis() >= lastTime + 1000 / ticks) {
                dp.repaint();
                lastTime = System.currentTimeMillis();
            }
        }
    }
}
