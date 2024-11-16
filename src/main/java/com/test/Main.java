package com.test;

import com.test.GUI.DisplayPanel;
import com.test.GUI.Window;
import com.test.Game.Game;

public class Main {
    private static DisplayPanel dp;
    private static Window window;
    private static Game game;

    private static int[][] form1 = {{1, 1, 1}, {1, 0, 0}};

    public static void main(String[] args) {
        dp = new DisplayPanel();
        window = new Window(dp);
        game = new Game(dp);

        game.start();
        dp.setForm(form1, 2, 3);
        dp.repaint();
    }
}