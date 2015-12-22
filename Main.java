package com.jetbrains;

public class Main {

    public static void main(String[] args) {

        for(int accidentlyFall =10; accidentlyFall >0; accidentlyFall--) {
            System.out.println(accidentlyFall + " green bottle standing " + "on the wall.");
            System.out.println(accidentlyFall + " green bottle standing " + "on the wall.");
            System.out.println("And if 1 green bottle should accidently fall ");


            if (accidentlyFall > 0) {
                System.out.println("There'll be " + (accidentlyFall - 1) + "green bottles on the wall.");

            } else {
                System.out.println("There'll be no green bottles on the wall.");

            }

        }
    }
}

