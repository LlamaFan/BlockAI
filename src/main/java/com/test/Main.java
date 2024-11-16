package com.test;

import com.test.GUI.DisplayPanel;
import com.test.GUI.Window;
import com.test.Game.Game;

public class Main {
    private static DisplayPanel dp;
    private static Window window;
    private static Game game;

    private static int[][] form1 = new int[2][3];

    public static void main(String[] args) {
        dp = new DisplayPanel();
        window = new Window(dp);
        game = new Game(dp);

        form1[0][0] = 1;
        form1[0][1] = 1;
        form1[0][2] = 1;
        form1[1][0] = 1;

        game.run();
        dp.setForm(form1, 2, 3);
        dp.repaint();
    }
}