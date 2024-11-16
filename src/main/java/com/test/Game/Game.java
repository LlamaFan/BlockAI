package com.test.Game;

import com.test.GUI.DisplayPanel;

public class Game implements Runnable {
    private DisplayPanel dp;
    public Thread thread;

    public Game(DisplayPanel dp) {
        this.dp = dp;
    }

    public void start() {
        thread = new Thread(this);
        run();
    }

    @Override
    public void run() {
        double lastTime = System.currentTimeMillis();
        int ticks = 1; // Runs this often per

        while (thread != null) {
            if (System.currentTimeMillis() >= lastTime + 1000 / ticks) {
                dp.repaint();
                lastTime = System.currentTimeMillis();
            }
        }
    }
}
