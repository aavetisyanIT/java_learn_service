package com;

import java.util.Random;

public class GuessingGame {
    public String guessEnteredNum(int guessedNum) {
        return "You got it";
    }

    public int generateRandomNum() {
        Random randomNum = new Random();
        return randomNum.nextInt(10) + 1;
    }
}
