package Tamagotchi;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Play {

    private static int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    private static int getInput() {
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        while (!(choice.equals("1") || choice.equals("2"))) {
            System.out.println("Enter 1 or 2");
            choice = sc.nextLine();
        }
        return Integer.parseInt(choice);
    }

    public static void playGame(Tamagotchi tamagotchi) {
        int win = 0;
        int loss = 0;
        int choice;

        while (win < 3 && loss < 3) {

            int initialNumber = generateRandomNumber(1, 10);
            int nextNumber = generateRandomNumber(1, 10);

            while (nextNumber == initialNumber) {
                nextNumber = generateRandomNumber(1, 10);
            }
            System.out.println("Will de number be higher or lower than (1 for lower, 2 for higher) : " + initialNumber);
            choice = getInput();
            System.out.println("The number was : " + nextNumber);
            if (choice == 1 && nextNumber < initialNumber || choice == 2 && initialNumber > nextNumber) {
                win++;
            } else {
                loss++;
            }
        }
        changeStats(tamagotchi,win > loss);
    }

    private static void changeStats (Tamagotchi tamagotchi, boolean win) {
        if (win) {
            tamagotchi.upHappiness(1);
        }
        tamagotchi.downWeight(1);
    }
}
