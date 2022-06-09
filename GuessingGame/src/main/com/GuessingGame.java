package com;

import java.util.Random;

public class GuessingGame {

    private final int randomNum = new Random().nextInt(10) + 1;
    public String guessEnteredNum(int guessedNum) {
        return "You got it";
    }

    public int generateRandomNum() {
        return randomNum;
    }
}
