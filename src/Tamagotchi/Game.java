package Tamagotchi;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;

public class Game {

    static Tamagotchi tamagotchi = new Tamagotchi();

    static void gameStart() {

        tamagotchi.initWeight();
        TimedActions.timer30minutes(tamagotchi);
    }

    public static void main(String[] args) {

        gameStart();
        tamagotchi.toString();
        tamagotchi.upWeight(1);
        Play.playGame(tamagotchi);
        tamagotchi.toString();
    }
}
