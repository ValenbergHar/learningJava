package com.game.task_2113_horse;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 1; i <= 30; i++) {
            move();
            print();
            Thread.sleep(500);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        double dis = winner.getDistance();
        for (Horse horse : horses) {
            if (horse.getDistance() > dis) {
                dis = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }


    public static void main(String[] args) throws InterruptedException {
//        Horse horse1 = new Horse("first", 3.0, 0.0);
//        Horse horse2 = new Horse("second", 3.0, 0.0);
//        Horse horse3 = new Horse("third", 3.0, 0.0);
//        List<Horse> horses = new ArrayList<>();
//        horses.add(horse1);
//        horses.add(horse2);
//        horses.add(horse3);
//        game = new Hippodrome(horses);
//        game.run();
//        game.printWinner();
        Date date = new Date();
        System.out.println(String.format("%td:%tm:%ty %tH:%tM:%tS", date, date, date, date, date, date));
    }
}
