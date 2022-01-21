package Tamagotchi;

public class Feed {

    public static void giveSnack(Tamagotchi tamagotchi) {

        if (tamagotchi.getHunger() < 4) {
            tamagotchi.upHunger(1);
            tamagotchi.upWeight(1);
        }
    }

    public static void giveCake(Tamagotchi tamagotchi) {

        if (tamagotchi.getHunger() < 4) {
            tamagotchi.upHunger(1);
            tamagotchi.upWeight(2);
            if (tamagotchi.getHappiness() < 4) {
                tamagotchi.upHappiness(1);
            }
        }
    }
}
