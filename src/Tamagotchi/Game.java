package Tamagotchi;

public class Game {

    static Tamagotchi tamagotchi = new Tamagotchi();

    static void gameStart() {
        tamagotchi.initWeight();
    }

    public static void main(String[] args) {
        gameStart();
        tamagotchi.toString();
        tamagotchi.upWeight(1);
        Play.playGame(tamagotchi);
        tamagotchi.toString();
    }
}
