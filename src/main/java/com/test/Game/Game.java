package com.test.Game;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.GUI.DisplayPanel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game implements Runnable {
    private DisplayPanel dp;
    public Thread thread;

    public ArrayList<int[][]> forms;

    public Game(DisplayPanel dp) {
        this.dp = dp;
    }

    public void startThread() {
        thread = new Thread(this);
        thread.start();
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

    // Initializes the forms

    public void initForms(String path) {
        try {
            ObjectMapper om = new ObjectMapper();
            forms = om.readValue(new File(path), new TypeReference<ArrayList<int[][]>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Couldn't load patterns");
        }
    }
}
