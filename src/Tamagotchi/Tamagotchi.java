package Tamagotchi;

import java.util.HashMap;
import java.util.Map;

public class Tamagotchi {

    static HashMap<Stage, Integer> weightLow = new HashMap<Stage, Integer>();
    static Map<Stage, Integer> weightHigh = new HashMap<Stage, Integer>();

    int age;
    int weight;
    int health;
    int hunger;
    int happiness;
    int disciplineLvl;
    boolean isDisciplined;

    public Tamagotchi() {
        age = 0;
        weight = 1;
        health = 3;
        hunger = 3;
        happiness = 3;
        disciplineLvl = 7; // on 10
        isDisciplined = true;
    }

    public void initWeight() {

        Tamagotchi.weightLow.put(Stage.BABY, 1);
        weightHigh.put(Stage.BABY, 20);

        weightLow.put(Stage.TODDLER, 15);
        weightHigh.put(Stage.TODDLER, 55);

        weightLow.put(Stage.TEEN, 45);
        weightHigh.put(Stage.TEEN, 115);

        weightLow.put(Stage.ADULT, 100);
        weightHigh.put(Stage.ADULT, 160);
        
    }

    public void upWeight (int num) {
        this.weight = weight + num;
    }

    public void downWeight(int num) {
        if (this.weight - num >= 1) {
            this.weight = this.weight - num;
        }
    }

    public void upHunger(int num) {this.hunger = hunger + num;}

    public void downHunger(int num) {this.hunger--;}

    public void upHappiness(int num) {this.happiness++;}

    public void downHappiness(int num) {this.happiness--;}


    public void upDiscipline () {
        if (disciplineLvl != 10) {
            this.disciplineLvl++;
        }
        if (disciplineLvl >= 6 && !isDisciplined) {
            this.isDisciplined = true;
        }
    }

    public void downDiscipline () {
        if (disciplineLvl != 0) {
            this.disciplineLvl--;
        }
        if (disciplineLvl <= 5 && isDisciplined) {
            this.isDisciplined = false;
        }
    }

    public void upAge() {
        this.age++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getDisciplineLvl() {
        return disciplineLvl;
    }

    public void setDisciplineLvl(int disciplineLvl) {
        this.disciplineLvl = disciplineLvl;
    }

    public boolean isDisciplined() {
        return isDisciplined;
    }

    public void setDisciplined(boolean disciplined) {
        isDisciplined = disciplined;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    @Override
    public String toString() {
        System.out.println("Age: " + this.getAge());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Health: " + this.getHealth());
        System.out.println("Hunger: " + this.getHunger());
        System.out.println("Discipline level: " + this.getDisciplineLvl());
        System.out.println("Is discipline : " + this.isDisciplined());;
        return "\n";
    }
}